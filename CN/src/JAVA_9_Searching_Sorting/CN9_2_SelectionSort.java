/*
INPUT --->
2
10
2 89 43 67 55 9 5 34 87 90
1 5 67 4 99

OUTPUT --->
2 5 9 34 43 55 67 87 89 90 5
1 4 5 67 99
 */

package JAVA_9_Searching_Sorting;

import java.util.Scanner;

public class CN9_2_SelectionSort {

    public static void selectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
//              int temp = arr[i];
//              arr[i] = arr[minIndex];
//              arr[minIndex] = temp;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for (int i=0;i<n;i++) {
            int size = read.nextInt();
            int[] arr = new int[size];
            for (int j=0;j<size;j++){
                arr[j] = read.nextInt();
            }
            selectionSort(arr);
        }
    }
}
