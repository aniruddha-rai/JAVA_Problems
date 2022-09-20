package JAVA_8_Arrays;

import java.util.Scanner;

public class CN8_Assignment16_SumOf2Array {
    public static void sum(int[] arr1, int[]arr2){
        int[] arr = new int[arr1.length];
        for (int i = arr1.length-1;i>=0;i--){
            arr[i] = arr1[i] + arr2[i];
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
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
            sum(arr1, arr2);
        }
    }
}