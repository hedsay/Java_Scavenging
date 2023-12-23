package com.Nreal.Java_Lambda;

public class E3 {
    public interface MyFunc3{
        public String test(String s1,String s2);
    }

    public static void main(String[] args) {
        MyFunc3 m = (s1,s2)->{
            return s1+s2;
        };
        System.out.println(m.test("hello ","Nreal"));
    }
}
