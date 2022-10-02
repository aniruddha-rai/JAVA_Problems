/*
Coding Problem
Problem Name: Swap Alternate
Problem Level: EASY
Problem Description: #### You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.

#### You don't need to print or return anything, just change in the input array itself.

##### Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    First line of each test case or query contains an integer 'N' representing the size of the array/list.

    Second line contains 'N' single space separated integers representing the elements in the array/list.

##### Output Format :
    For each test case, print the elements of the resulting array in a single row separated by a single space.

    Output for every test case will be printed in a separate line.

##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5
    Time Limit: 1sec
 ##### Sample Input  1:
    1
    6
    9 3 6 12 4 32

##### Sample Output 1 :
    3 9 12 6 32 4

##### Sample Input  2:
    2
    9
    9 3 6 12 4 32 5 11 19
    4
    1 2 3 4

##### Sample Output 2 :
    3 9 12 6 32 4 11 5 19
    2 1 4 3
 */

package JAVA_8_Arrays;

import java.util.Scanner;

public class CN8_8_SwapAlternate {

    public static void swap(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (i+1 == arr.length){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i + 1] + " " + arr[i] + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for (int i=0;i<n;i++){
            int size = read.nextInt();
            int[] arr = new int[size];
            for (int j=0;j<size;j++){
                arr[j] = read.nextInt();
            }
            swap(arr);
        }
    }
}
