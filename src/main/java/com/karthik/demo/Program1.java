package com.karthik.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// input : 10,20,30,40,50
// sum : 150
// output : 160,170,180,190,200

public class Program1 {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,20,30,40,50);
        Integer sum = num.stream().reduce(0,Integer::sum);
        List<Integer> collect = num.stream().map(x -> x +sum).collect(Collectors.toList());
        System.out.println(collect);
    }
}
