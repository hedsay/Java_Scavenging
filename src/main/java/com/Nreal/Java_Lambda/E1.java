package com.Nreal.Java_Lambda;

public class E1 {
    public interface MyFunctionalInterface1 {
        public String test();
    }

    public static void main(String[] args) {
        MyFunctionalInterface1 m = ()->{
            return "test";
        };
        System.out.println(m.test());
    }
}


