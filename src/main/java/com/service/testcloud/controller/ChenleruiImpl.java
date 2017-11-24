package com.service.testcloud.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-24T02:36:39.317Z")

@RestSchema(schemaId = "chenlerui")
@RequestMapping(path = "/testcloud", produces = MediaType.APPLICATION_JSON)
public class ChenleruiImpl {

    @Autowired
    private ChenleruiDelegate userChenleruiDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userChenleruiDelegate.helloworld(name);
    }

}
