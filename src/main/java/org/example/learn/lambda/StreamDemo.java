package org.example.learn.lambda;

import java.util.Arrays;

public class StreamDemo {
    public static void main(String[] args) {
//        Stream.iterate(new int[]{0, 1}, t -> (new int[]{t[1], t[0] + t[1]}))
//                .limit(20)
//                .forEach(t -> System.out.println("(" + t[0] + " " + t[1] + ")"));

        int[] ones = new int[10];
        Arrays.fill(ones, 1);
        Arrays.stream(ones).forEach(System.out::print);
    }
}
