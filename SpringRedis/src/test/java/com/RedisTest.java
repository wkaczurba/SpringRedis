package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.RedisConfig;

@ContextConfiguration(classes=RedisConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {
	
	@Autowired
	RedisConnectionFactory cf;
	
	// TODO: Add REDIS TEMPLATE.
	@Autowired
	RedisTemplate<String, Product> redis;
	
	@Test
	public void firstTest() {
		Product wheel = new Product("0001", "Wheel", 44.99f); 
		redis.opsForValue().set("Wheel", wheel);
		
		Product retrievedProduct = redis.opsForValue().get("Wheel");
		Assert.assertEquals(wheel, retrievedProduct);
		//System.out.println(wheel);
	}
}
