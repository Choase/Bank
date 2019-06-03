package com.bank.bankservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class UserController{
    @RequestMapping("/test")
    public String index(){
        return "hello world";
    } 
    
}