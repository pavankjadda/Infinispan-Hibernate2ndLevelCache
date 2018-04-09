package com.infinispancache.config;

import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;
import org.infinispan.spring.provider.SpringEmbeddedCacheManager;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;

public class InfinispanConfig
{
    @Bean
    public CacheManager cacheManager()
    {
        return new SpringEmbeddedCacheManager(infinispanCacheManager());
    }

    private EmbeddedCacheManager infinispanCacheManager() {
        return new DefaultCacheManager();
    }
}
