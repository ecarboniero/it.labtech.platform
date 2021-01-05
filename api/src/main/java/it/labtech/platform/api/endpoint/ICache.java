package it.labtech.platform.api.endpoint;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/cache", produces = MediaType.APPLICATION_JSON_VALUE)
public interface ICache {

    @GetMapping
    String getCache();
}
