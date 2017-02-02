package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.context.annotation.Bean;


// TO RUN TEST -> Needs Redis server running
//   Test with this one on Windows: https://msopentech.com/opentech-projects/redis/

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
	
	@Bean
	public RedisTemplate<String, Product> redisTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate<String, Product> redis = new RedisTemplate<String, Product>();
		redis.setConnectionFactory(connectionFactory);
		
		// Setting serializers (probably not needed)
		redis.setKeySerializer(new StringRedisSerializer());
		redis.setValueSerializer(new Jackson2JsonRedisSerializer<Product>(Product.class));
		
		return redis;
	}
}
