package JAVA_11_2D_Array;

import java.util.Scanner;

public class CN11_10_Other_PairSum {

    public static void pairSum(int[] arr, int findSum) {
        for (int i=0,j=arr.length-1;i<j;){
            if (arr[i] + arr[j] == findSum){
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }else if ((arr[i] + arr[j]) < findSum){
                i++;
            }else {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int []arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = read.nextInt();
        }
        int findSum = read.nextInt();
        pairSum(arr, findSum);
    }
}
