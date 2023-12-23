package com.Nreal.Java_Lambda;

public class E2 {
    public interface MyFunctionalInterface2{
        public String test(String s);
    }

    public static void main(String[] args) {
        MyFunctionalInterface2 m = (s)->{
            return "hello "+s;
        };
        System.out.println(m.test("Nreal"));
    }
}
