package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.context.annotation.Bean;


@Configuration
public class RedisConfig {
	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		JedisConnectionFactory jc = new JedisConnectionFactory();
		jc.setHostName("localhost");
		jc.setPort(6379);
		jc.setPassword(""); // by default is null...
		return jc;
	}
}
