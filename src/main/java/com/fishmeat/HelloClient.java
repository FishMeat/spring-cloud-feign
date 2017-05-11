package com.fishmeat;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sggb
 * @since 11.05.2017
 */
@FeignClient("client")
public interface HelloClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String get();
}
