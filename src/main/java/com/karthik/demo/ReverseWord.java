package com.karthik.demo;

public class ReverseWord {

    private static String reverseWord(String str){
        String[] space = str.split(" ");
        String result = "";
        for(int i= space.length-1;i>=0;i--){
            if(i == 0){
                result = result + space[i];
            }else {
                result = result + space[i] + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hi this is karthik rajan";
        System.out.println(reverseWord(str));
    }
}
