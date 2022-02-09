package com.codegym;

public class Main {
    public static void main(String[] args) {
	    int [] arr = {1,2,3,5,566,6,22,11};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int[] arr) {
        int index = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
