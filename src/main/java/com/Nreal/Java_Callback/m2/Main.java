package com.Nreal.Java_Callback.m2;

import com.Nreal.Java_Callback.m1.CallBack;

public class Main {
    public static void main(String[] args) throws Exception {
        Request request = new Request();
        System.out.println("[Main]:我开个线程去异步发请求");
        CallBack callBack = new CallBack();
        new Thread(() -> {
            try {
                request.send(callBack);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("[Main]:请求发完了，我去干点别的");
        Thread.sleep(100000);
    }
}
