package com.teste.teste.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class newcontroller 
{
    @GetMapping(value="/")
    public String getMethodName() {
        return "Ola mundo VSCODE!";
    }
        
}
