package com.service.lrchen.controller;

import org.springframework.stereotype.Component;


@Component
public class ChenleruiDelegate implements Chenlerui {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
