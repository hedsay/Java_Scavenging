package com.Nreal.Java_FuncInterface;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String,String> uppercaseFunction = str->str.toUpperCase();
        String res = uppercaseFunction.apply("rui");
        System.out.println(res);
    }
}
