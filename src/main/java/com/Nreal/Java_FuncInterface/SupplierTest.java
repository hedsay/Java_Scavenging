package com.Nreal.Java_FuncInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> randomNumSupplier = ()->new Random().nextInt();
        int randomNum = randomNumSupplier.get();
        System.out.println(randomNum);
    }
}
