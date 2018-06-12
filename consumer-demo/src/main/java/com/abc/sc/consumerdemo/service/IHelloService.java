package com.abc.sc.consumerdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="spring-cloud-provider-demo")
@RequestMapping("/demo")
public interface IHelloService{
    @RequestMapping("/hello")
    public String testHelloWorld(@RequestParam(value="name") String name);
}