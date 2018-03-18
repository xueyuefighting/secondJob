package com.yonyou.scf.gateway.ftp;

import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import javax.annotation.PreDestroy;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.PooledObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FTPClient对象连接池 
 * @author zhangjinliang
 * 2017年5月26日 下午4:36:20
 * 
 */
public class FTPClientPool implements ObjectPool<FTPClient>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private final static int POLL_DELAY_TIME = 2000;
	private final static int OFFER_DELAY_TIME = 2000;
	
	private static int poolSize=5;
	
	private BlockingQueue<PooledObject<FTPClient>> pool;
	
	private FTPConnectionFactory fTPConnectionFactory;
	
	
	public void setFactory(FTPConnectionFactory fTPConnectionFactory) {
		this.fTPConnectionFactory = fTPConnectionFactory;
	}

	public FTPClientPool() {
	}

	
	public FTPClientPool(FTPConnectionFactory fTPConnectionFactory){
		this(poolSize , fTPConnectionFactory);
	}
	
	public FTPClientPool(int poolSize,
			FTPConnectionFactory fTPConnectionFactory) {
		this.poolSize = poolSize;
		this.fTPConnectionFactory = fTPConnectionFactory;
		
		initConstruct();
	}

	public void initConstruct(){
		pool = new ArrayBlockingQueue<PooledObject<FTPClient>>(poolSize*2, true);
		try {
			//initPool();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initPool() throws Exception {
		for (int i = 0; i < poolSize; i++) {
			addObject();
		}
	}



	@Override
	public FTPClient borrowObject() throws Exception, NoSuchElementException,
			IllegalStateException {
		return fTPConnectionFactory.makeObject().getObject();
//		PooledObject<FTPClient> pooledObject = pool.poll(POLL_DELAY_TIME, TimeUnit.MILLISECONDS);
//		
//		if(!fTPConnectionFactory.validateObject(pooledObject)){
//			pool.remove(pooledObject);//删除无效对象
//			addObject();//补上对象
//			borrowObject();//递归
//		}
//		return pooledObject.getObject();
	}

	@Override
	public void returnObject(FTPClient obj) throws Exception {
//		PooledObject<FTPClient> pooledObject = new DefaultPooledObject<FTPClient>(obj);
//		if(!fTPConnectionFactory.validateObject(pooledObject)){
//			pool.remove(pooledObject);//删除无效对象
//			addObject();//补上对象
//			return;
//		}
//		pool.offer(new DefaultPooledObject<FTPClient>(obj), OFFER_DELAY_TIME, TimeUnit.MILLISECONDS);
		
		boolean bool = obj.logout();
		
		if(!bool){
			System.out.println("ftp连接回收失败...");
		}
		
	}

	@Override
	public void invalidateObject(FTPClient obj) throws Exception {
		
		
	}

	@Override
	public void addObject() throws Exception, IllegalStateException,
			UnsupportedOperationException {
		System.out.println("添加一个ftp连接对象");
		PooledObject<FTPClient> pooledObject = fTPConnectionFactory.makeObject();
		pool.offer(pooledObject, OFFER_DELAY_TIME, TimeUnit.MILLISECONDS);
		
	}

	@Override
	public int getNumIdle() {
		return 0;
	}

	@Override
	public int getNumActive() {
		return 0;
	}

	@Override
	public void clear() throws Exception, UnsupportedOperationException {
		
	}

	@Override
	@PreDestroy
	public void close() {
		while(pool.iterator().hasNext()){
			PooledObject<FTPClient> po = pool.poll();
			if(po!=null){
				try {
					fTPConnectionFactory.destroyObject(po);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
