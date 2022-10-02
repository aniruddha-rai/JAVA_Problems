/*
Coding Problem
Problem Name: Merge Two Sorted Arrays
Problem Level: MEDIUM
Problem Description:
#### You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.

##### Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    First line of each test case or query contains an integer 'N' representing the size of the first array/list.

    Second line contains 'N' single space separated integers representing the elements of the first array/list.

    Third line contains an integer 'M' representing the size of the second array/list.

    Fourth line contains 'M' single space separated integers representing the elements of the second array/list.


##### Output Format :
    For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.

    Output for every test case will be printed in a separate line.

##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5
    0 <= M <= 10^5
    Time Limit: 1 sec
 ##### Sample Input 1 :
    1
    5
    1 3 4 7 11
    4
    2 4 6 13

##### Sample Output 1 :
    1 2 3 4 4 6 7 11 13

##### Sample Input 2 :
    2
    3
    10 100 500
    7
    4 7 9 25 30 300 450
    4
    7 45 89 90
    0

##### Sample Output 2 :
    4 7 9 10 25 30 100 300 450 500
    7 45 89 90
 */

package JAVA_9_Searching_Sorting;

import java.util.Scanner;

public class CN9_5_MergeTwoSortedArray {

    public static void mergeArray(int[] arr1, int[] arr2, int size1, int size2){
//        int[] arr3 = new int[size1+size2];
//        int i=0, j=0;
//        for (int k=0;k<arr3.length;k++){
//                if (arr1[i] >= arr2[j] && j<size2-1) {
//                    arr3[k] = arr2[j];
//                    j++;
//                } else if (arr1[i] <= arr2[j] && i<size1-1) {
//                    arr3[k] = arr1[i];
//                    i++;
//                }else if (i < size1){
//                    arr3[k] = arr2[j];
//                } else if (j < size2) {
//                    arr3[k] = arr1[i];
//                }
//        }
        int i=0,j=0,k=0;
        int[] arr3 = new int[size1+size2];
        while (i<size1 && j<size2){
            if (arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i<size1){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j<size2){
            arr3[k] = arr2[j];
            j++;
            k++;
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
