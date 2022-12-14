/*
Assignment Coding Problem
Problem Name: Check Array Rotation
Problem Level: MEDIUM
Problem Description:
#### You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' in the clockwise direction.

#### Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.

##### Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    First line of each test case or query contains an integer 'N' representing the size of the array/list.

    Second line contains 'N' single space separated integers representing the elements in the array/list.

##### Output Format :
    For each test case, print the value of 'K' or the index from which which the array/list has been rotated.

    Output for every test case will be printed in a separate line.


##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^5
    Time Limit: 1 sec
 ##### Sample Input 1:
    1
    6
    5 6 1 2 3 4

##### Sample Output 1:
    2

##### Sample Input 2:
    2
    5
    3 6 8 9 10
    4
    10 20 30 1

##### Sample Output 2:
    0
    3
 */

package JAVA_8_Arrays;

import java.util.Scanner;

public class CN8_Assignment14_CheckArrayRotation {

    public static void checkArrayRotation(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (i == arr.length-1){
                System.out.println(0);
                break;
            }
            else if (arr[i+1] < arr[i]){
                System.out.println(i+1);
                break;
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
            checkArrayRotation(arr);
        }
    }
}
