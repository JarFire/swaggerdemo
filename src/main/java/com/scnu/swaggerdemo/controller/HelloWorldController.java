package com.scnu.swaggerdemo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/HelloWorldController")
@Api(description = "HelloController test")
public class HelloWorldController{

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String Hello(@PathVariable(value = "name",required = false)  String name){
        return "Hello " + name;
    }



}
