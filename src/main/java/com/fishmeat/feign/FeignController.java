package com.fishmeat.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sggb
 * @since 11.05.2017
 */
@RestController
public class FeignController {

    @Autowired
    HelloClient helloClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return helloClient.get();
    }
}
