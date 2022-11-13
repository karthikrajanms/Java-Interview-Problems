package com.karthik.demo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Sample {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 8, 11, 5};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
            }else {
                odd.add(arr[i]);
            }
        }
        even.addAll(odd);
        System.out.println(even);

    }
}
