package com.yonyou.scf.common.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.yonyou.scf.common.gateway.entity.TokenBean;

/**
 * token操作
 * @author zhangjlm
 *
 */
public class TokenUtil {
	/*
	 * 通过token 取bean
	 * @param token
	 * @param redisTemplate
	 * @return 当token为空 null  或者redis不存在 则返回null  否则返回bean
	 */
	public static TokenBean getBean(String token, RedisTemplate<Object,Object> redisTemplate) {
		
		if(StringUtils.isEmpty(token) || !redisTemplate.hasKey(token)) {
			return null;
		}
		String tokenValue = (String)redisTemplate.opsForValue().get(token);
		
		if(StringUtils.isEmpty(tokenValue)) {
			return null;
		}
		
		TokenBean tb = JSON.parseObject(tokenValue, TokenBean.class);
		
		return tb;
	}
}
