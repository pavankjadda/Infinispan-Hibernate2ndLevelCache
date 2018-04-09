package com.infinispancache.config;

import org.infinispan.Cache;
import org.infinispan.configuration.cache.CacheMode;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;
import org.infinispan.spring.provider.SpringEmbeddedCacheManager;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
public class InfinispanConfig
{
    @Bean
    public CacheManager cacheManager()
    {
       /* CacheManager cacheManager= new SpringEmbeddedCacheManager(infinispanCacheManager());
        cacheManager.getCache("persons");
        return cacheManager;*/
        return new ConcurrentMapCacheManager("persons");
    }

    private EmbeddedCacheManager infinispanCacheManager()
    {
        return new DefaultCacheManager();
    }
}
