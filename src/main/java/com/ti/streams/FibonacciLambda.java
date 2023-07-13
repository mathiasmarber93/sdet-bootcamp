package com.ti.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciLambda {

    public static void main(String args[]) {
        System.out.println(FibonacciLambda.generate(15));
    }
    public static List generate(int series) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(series)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }
}
