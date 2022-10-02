/*
Assignment Coding Problem
Problem Name: Rotate array
Problem Level: MEDIUM
Problem Description:
#### You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).

##### Note:
    Change in the input array/list itself. You don't need to return or print the elements.

##### Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    First line of each test case or query contains an integer 'N' representing the size of the array/list.

    Second line contains 'N' single space separated integers representing the elements in the array/list.

    Third line contains the value of 'D' by which the array/list needs to be rotated.

##### Output Format :
    For each test case, print the rotated array/list in a row separated by a single space.

    Output for every test case will be printed in a separate line.


##### Constraints :
    1 <= t <= 10^4
    0 <= N <= 10^6
    0 <= D <= N
    Time Limit: 1 sec
 ##### Sample Input 1:
    1
    7
    1 2 3 4 5 6 7
    2

##### Sample Output 1:
    3 4 5 6 7 1 2

##### Sample Input 2:
    2
    7
    1 2 3 4 5 6 7
    0
    4
    1 2 3 4
    2

##### Sample Output 2:
    1 2 3 4 5 6 7
    3 4 1 2
 */

package JAVA_8_Arrays;

import java.util.Scanner;

public class CN8_Assignment12_RotateArray {

    public static void rotateArray(int[] arr, int start){
        for (int i=start;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        for (int j=0;j<start;j++){
            System.out.print(arr[j] + " ");
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
            int startPosition = read.nextInt();
            rotateArray(arr, startPosition);
        }
    }
}
