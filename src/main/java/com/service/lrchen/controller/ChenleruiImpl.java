package com.service.lrchen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-24T02:53:02.531Z")

@RpcSchema(schemaId = "chenlerui")
public class ChenleruiImpl implements Chenlerui{

    @Autowired
    private ChenleruiDelegate chenleruiDelegate;


    public String helloworld(String name) {

        return chenleruiDelegate.helloworld(name);
    }

}
