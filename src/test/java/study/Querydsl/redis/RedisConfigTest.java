package study.Querydsl.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisConfigTest {
    @Autowired
    ApplicationContext applicationContext;
    
    @Test
    void test() {
        Object cacheManager = applicationContext.getBean("cacheManager");
        Object redisTemplate = applicationContext.getBean("redisTemplate");
        Object redisConnectionFactory = applicationContext.getBean("redisConnectionFactory");
        System.out.println("cacheManager = " + cacheManager);
    }
}