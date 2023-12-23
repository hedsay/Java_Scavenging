package com.Nreal.Java_Stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Parallel_test {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        Integer sum = stream.parallel().peek(new Consumer<Integer>(){
                    @Override
                    public void accept(Integer num) {
                        System.out.println(num+Thread.currentThread().getName());
                    }
                }).filter(num->num>5)
                .reduce((result,ele)->result+ele)
                .get();
        System.out.println(sum);
    }
}
