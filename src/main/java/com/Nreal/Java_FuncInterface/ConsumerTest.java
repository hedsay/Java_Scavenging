package com.Nreal.Java_FuncInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rui", "kk");
        Consumer<String> printName = name-> System.out.println(name);
        list.forEach(printName);
    }
}
