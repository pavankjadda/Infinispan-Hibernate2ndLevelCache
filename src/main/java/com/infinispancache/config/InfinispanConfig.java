package com.infinispancache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@EnableCaching
@Configuration
public class InfinispanConfig
{
   /* @Bean
    public CacheManager cacheManager()
    {
        return new SpringEmbeddedCacheManager(infinispanCacheManager());

    }

    private EmbeddedCacheManager infinispanCacheManager()
    {
        return new DefaultCacheManager();
    }*/


    @Bean
    public CacheManager cacheManager()
    {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        //cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("addresses"),new ConcurrentMapCache("persons")));
        cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("persons")));
        return cacheManager;
    }
}
