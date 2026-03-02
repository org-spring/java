package com.basic.intermediate;

public class Array {

    public static void main(String[] args) {

        int[] arr;
        arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]); // default value

        // re-initializing an array value
        arr[3] = 90;
        System.out.println(arr[3]);

        // finding the length of the array
        System.out.println("Length of array: " + arr.length);

        // iterating through the array using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }

        // array declaration and initialization in a single step
        int[] directArr = { 10, 20, 30, 40 };
        for (int i = 0; i < directArr.length; i++) {
            System.out.println(i + "\t" + directArr[i]);
        }

        // copying array reference
        int[] copy = arr;
        System.out.println("Copied array values:");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(i + "\t" + copy[i]);
        }

        // ArrayIndexOutOfBoundsException example (do not uncomment)
        // System.out.println(arr[5]);
    }
}
