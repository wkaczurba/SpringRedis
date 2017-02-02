package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import com.RedisConfig;

@ContextConfiguration(classes=RedisConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {
	
	@Autowired
	RedisConnectionFactory cf;
	
	// TODO: Add REDIS TEMPLATE.
	
	@Test
	public void firstTest() {
	}
}
