package Patterns;

import java.util.Scanner;

public class P4_Array {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();

        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = read.nextInt();
        }

        System.out.println("Enter the number to find from array: ");
        int findNum = read.nextInt();

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i] == findNum)
                System.out.println("Num fount at index: "+i);
        }

    }
}
