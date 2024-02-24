package com.dino.springboot.contional;

import jakarta.annotation.PostConstruct;

import java.time.LocalDateTime;


public final class Today {
    public void print(){
        System.out.println(LocalDateTime.now());
    }

    @PostConstruct
    public void init(){
        System.out.println("init Today!!!");
    }
}
