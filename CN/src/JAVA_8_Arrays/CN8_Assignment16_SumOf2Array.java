package JAVA_8_Arrays;

import java.util.Scanner;

public class CN8_Assignment16_SumOf2Array {
    public static void sum(int[] arr1, int[]arr2, int[] arr){
        int carry = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = arr.length-1;
        while (k >= 0){
            int digit = carry;

            if (i>=0) digit += arr[i];
            if (j>=0) digit += arr[j];

            carry = digit/10;
            digit = digit%10;

            arr[k] = digit;
            i--;
            j--;
            k--;
        }
        if (carry != 0){
            System.out.print(carry + " ");
        }
        for (int val: arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for (int i=0;i<n;i++){
            int n1 = read.nextInt();
            int[] arr1 = new int[n1];
            for (int j=0;j<n1;j++){
                arr1[j] = read.nextInt();
            }
            int n2 = read.nextInt();
            int[] arr2 = new int[n2];
            for (int k=0;k<n2;k++){
                arr2[k] = read.nextInt();
            }
            if (n1>n2){
                int[] arr = new int[n1];
                sum(arr1, arr2, arr);
            }else {
                int[] arr = new int[n2];
                sum(arr1, arr2, arr);
            }
        }
    }
}