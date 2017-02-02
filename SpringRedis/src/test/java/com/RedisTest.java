package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.RedisConfig;

@ContextConfiguration(classes=RedisConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {
	
	// TODO: Add REDIS SOMEWHERE IN HERE...
	
	@Test
	public void firstTest() {
	}
}
