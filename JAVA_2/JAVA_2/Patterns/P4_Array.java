package Patterns;

import java.util.Scanner;

public class P4_Array {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();

//        // <<<<<<< ----- LINEAR SEARCH ----- >>>>>>>
//        int[] arr = new int[size];
//        for (int i=0;i<size;i++){
//            arr[i] = read.nextInt();
//        }
//
//        System.out.println("Enter the number to find from array: ");
//        int findNum = read.nextInt();
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] == findNum)
//                System.out.println("Num fount at index: "+i);
//        }

//        // Take an array of names as input from the user and print them on the screen
//        String[] arr = new String[size];
//        for (int i=0;i<size;i++) {
//            arr[i] = read.next();
//        }
//        for(int i=0;i<arr.length;i++) {
//            System.out.println("Name " + (i+1) +" is : " + arr[i]);
//        }

//        // Find the maximum & minimum number in an array of integers
//        int[] arr = new int[size];
//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//        for (int i=0;i<size;i++) {
//            arr[i] = read.nextInt();
//        }
//        for (int i=0;i<size;i++) {
//            if (arr[i] > max)
//                max = arr[i];
//            if (arr[i] < min)
//                min = arr[i];
//        }
//        System.out.println("MAX: "+max + " & MIN: "+min);

//        // Take an array of numbers as input and check if it is an array sorted in ascending order
//        int[] arr = new int[size];
//        boolean isAscending = false;
//        for (int i=0;i<size;i++) {
//            arr[i] = read.nextInt();
//        }
//        for (int i=0;i<size;i++) {
//            if (i+1 != size) {
//                if (arr[i] < arr[i + 1])
//                    isAscending = true;
//                else {
//                    isAscending = false;
//                    break;
//                }
//            }
//        }
////        boolean isAscending = true;
////        for(int i=0; i<arr.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
////            if(arr[i] > arr[i+1]) { // This is the condition for descending order
////                isAscending = false;
////            }
////        }
//        if (isAscending)
//            System.out.println("Array is sorted in ascending order");
//        else
//            System.out.println("Array is not sorted in ascending order");


    }
}
