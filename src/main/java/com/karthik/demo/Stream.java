package com.karthik.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100,200,13,99,45,16);
       // numbers.stream().map(x->x * 2).forEach(System.out::println);
        // numbers.stream().filter(x->x > 2).forEach(System.out::println);
       /* List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);*/
        /*Integer integer = numbers.stream().min(Comparator.comparingInt(o -> o)).get();
        System.out.println(integer);*/
        long count = numbers.stream().count();
        System.out.println(count);
    }
}
