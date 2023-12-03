package com.Nreal.Java_Callback.m1;

import java.lang.reflect.Method;

public class Request {
    public void send(Class clazz, Method method) throws Exception{
        Thread.sleep(3000);
        System.out.println("[Request]:收到响应");
        method.invoke(clazz.newInstance());
    }
}
