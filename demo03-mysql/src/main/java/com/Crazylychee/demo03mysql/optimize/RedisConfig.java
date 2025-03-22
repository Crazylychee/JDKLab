package com.Crazylychee.demo03mysql.optimize;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);

        // 设置键的序列化方式
        template.setKeySerializer(new StringRedisSerializer());

        // 设置值的序列化方式，这里使用GenericJackson2JsonRedisSerializer来序列化复杂对象
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());

        // 设置哈希键的序列化方式
        template.setHashKeySerializer(new StringRedisSerializer());

        // 设置哈希值的序列化方式
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

        // 在设置完序列化器后调用afterPropertiesSet方法，以确保所有属性都已设置
        template.afterPropertiesSet();
        return template;
    }
}

