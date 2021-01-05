package it.labtech.platform.api.impl;

import it.labtech.platform.api.endpoint.ICache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultCacheImpl implements ICache {
    @Override
    @Cacheable("hz-cache")
    public String getCache() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "Cache working";
    }
}
