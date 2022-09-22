package JAVA_9_Searching_Sorting;

import java.util.Scanner;

public class CN9_5_MergeTwoSortedArray {

    public static void mergeArray(int[] arr1, int[] arr2, int size1, int size2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i=0, j=0;
        for (int k=0;k<arr3.length;k++){
                if (arr1[i] >= arr2[j] && j<size2-1) {
                    arr3[k] = arr2[j];
                    j++;
                } else if (arr1[i] <= arr2[j] && i<size1-1) {
                    arr3[k] = arr1[i];
                    i++;
                }else if (i == size1-1){
                    arr3[k] = arr2[j];
                } else if (j == size2-1) {
                    arr3[k] = arr1[i];
                }
        }
        printArray(arr3);
    }

    private static void printArray(int[] arr3) {
        for (int i: arr3){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        for (int i=0;i<num;i++){
            int size1 = read.nextInt();
            int[] arr1 = new int[size1];
            for (int j=0;j<size1;j++){
                arr1[j] = read.nextInt();
            }
            int size2 = read.nextInt();
            int[] arr2 = new int[size2];
            for (int j=0;j<size2;j++){
                arr2[j] = read.nextInt();
            }
            mergeArray(arr1, arr2, size1, size2);
        }
    }
}
