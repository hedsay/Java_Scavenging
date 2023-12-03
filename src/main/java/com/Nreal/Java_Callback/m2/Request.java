package com.Nreal.Java_Callback.m2;

import com.Nreal.Java_Callback.m1.CallBack;

public class Request {
    public void send(CallBack callBack) throws Exception {
        // 模拟等待响应
        Thread.sleep(3000);
        System.out.println("[Request]:收到响应");
        callBack.processResponse();
    }
}
