/*
Coding Problem
Problem Name: Bubble Sort
Problem Level: EASY
Problem Description:
#### Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Bubble Sort'.


##### Note:
    Change in the input array/list itself. You don't need to return or print the elements.


##### Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    First line of each test case or query contains an integer 'N' representing the size of the array/list.

    Second line contains 'N' single space separated integers representing the elements in the array/list.

##### Output format :
    For each test case, print the elements of the array/list in sorted order separated by a single space.

    Output for every test case will be printed in a separate line.

##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^3
    Time Limit: 1 sec
 ##### Sample Input 1:
    1
    7
    2 13 4 1 3 6 28

##### Sample Output 1:
    1 2 3 4 6 13 28

##### Sample Input 2:
    2
    5
    9 3 6 2 0
    4
    4 3 2 1

##### Sample Output 2:
    0 2 3 6 9
    1 2 3 4
 */

package JAVA_9_Searching_Sorting;

import java.util.Scanner;

public class CN9_3_BubbleSort {

    // Time Complexity = O(n^2)
    public static void bubbleSort(int[] arr){
        int temp = 0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        for (int i=0;i<num;i++){
            int size = read.nextInt();
            int[] arr = new int[size];
            for (int j=0;j<size;j++){
                arr[j] = read.nextInt();
            }
            bubbleSort(arr);
        }
    }
}
