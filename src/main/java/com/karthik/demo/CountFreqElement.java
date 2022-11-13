package com.karthik.demo;

import java.util.HashMap;
import java.util.Map;

public class CountFreqElement {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,10,50,50,40,30,30};
        countFreqElement(arr);
    }

    private static void countFreqElement(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
