package com.yonyou.scf.gateway.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import com.yonyou.scf.gateway.service.RedisService;

public abstract class MemoryTimerHandler {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RedisService redisService;
	@Autowired
	private RedisTemplate<Serializable, Object> redisTemplate;
	
	/**
	 * 注册状态码域---开始
	 */
	public final static int NONE = 0;//默认
	public final static int SUCCESS = 1;//成功
	public final static int ERROR = 2;//错误
	public final static int EXIST = 3;//存在
	public final static int NOEXIST = 4;//存在
	public final static int EXISTBUTZERO = 5;//存在但为0
	public final static int VALIDATEERROR = 6;//验证模型方法，key组成有误
	public final static int OUTOFCOUNT = 7;//增加key值 错误 超出指定key值
	public final static int TRANSFORERROR = 8;//类型转换错误
	
	
	//设置key的存活时间 单位：毫秒
	public long outTime = 5000;
	
	
	public long getOutTime() {
		return outTime;
	}



	public void setOutTime(long outTime) {
		this.outTime = outTime;
	}
	
	//
	
	/**
	 * 由实现者提供  验证模型的key的组成  
	 * eg：name+age+height 为key
	 * new Object[]{name.age,height}
	 * @return
	 */
	public abstract Object[] volidateModelKey();
	
	/**
	 * eg: 允许 访问db.rpoperties文件的线程数为200
	 * key=accessDbFile  value=200
	 * @return
	 */
	public int returnSpecify(String key,int count){
		
		redisService.set(key, count);
		
		return SUCCESS;
		
	}
	
	/**
	 * 增加key在内存中  value的值  自增1
	 * @param keyName
	 * @return
	 */
	public int addMyKeyCount(String keyName){
		
		if(!redisService.exists(keyName)){
			logger.warn(MemoryTimerHandler.class.getName()+"：当前做操的key不存在...");
			return EXIST;
		}
	
		Object value = redisService.get(keyName);
		
		try {
			
			redisService.set(keyName, Integer.valueOf(String.valueOf(value))+1);
			
		} catch (Exception NumberFormatException) {
			return TRANSFORERROR;
		}
		
		
		
		return SUCCESS;
	}
	
	/**
	 *  减key在内存中  value的值  减1
	 * @param keyName
	 * @return
	 */
	public int minusMyKeyCount(String keyName){
		
		if(!redisService.exists(keyName)){
			logger.warn(MemoryTimerHandler.class.getName()+"：当前做操的key不存在...");
			return NOEXIST;
		}
		
		
		
		Object value = redisService.get(keyName);
		
		if(value!=null && Integer.valueOf(String.valueOf(value))==0) {
			logger.warn(MemoryTimerHandler.class.getName()+":当前操作的key不存在或者已为0...");
			return EXISTBUTZERO;
		}
		
		redisService.set(keyName, Integer.valueOf(String.valueOf(value))-1);
		
		
		return SUCCESS;
	}
	
	/**
	 * 编译key
	 * @return
	 * @throws NullObjectForUseException 
	 */
	private String StringHashCode(){
		
			Object[] o = volidateModelKey();
			
			if(o==null) return null;
			
			List<Object> keyList = new ArrayList<Object>();
			for (Object object : o) {
				keyList.add(object);
			}
			
			int code = keyList.hashCode();
			
			return String.valueOf(code);
		
	}
	
	/**
	 * 验证主方法，判断当前key是否存在 如果有 忽略其他请求
	 * @return
	 */
	public final int volidate(){
		try {
			
			String key = StringHashCode();
			
			if(!redisTemplate.hasKey(key)){//检查key
				try {
					ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
					operations.set(key, "1");//插入key
					redisTemplate.expire(key, outTime, TimeUnit.MILLISECONDS);//设置存活期
				} catch (Exception e) {
					logger.warn(MemoryTimerHandler.class.getName()+":volidate() throws an Exception...");
					return ERROR;
				}
			}else{
				//提交大于一次，不予处理 返回状态位
				return OUTOFCOUNT;
			}
			
		} catch(Exception ee){
			logger.warn(MemoryTimerHandler.class.getName()+":volidate() throws an Exception...");
			return ERROR;
		}
		
		return SUCCESS;
	}
	
}
