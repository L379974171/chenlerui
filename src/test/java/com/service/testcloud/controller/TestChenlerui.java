package com.service.testcloud.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestChenlerui {

        ChenleruiDelegate chenleruiDelegate = new ChenleruiDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = chenleruiDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}