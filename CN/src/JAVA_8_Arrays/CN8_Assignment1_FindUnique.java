/*
Assignment Coding Problem
Problem Name: Find Unique
Problem Level: MEDIUM
Problem Description:
#### You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

#### Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

#### You need to find and return that number which is unique in the array/list.

##### Note:
    Unique element is always present in the array/list according to the given condition.

##### Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    First line of each test case or query contains an integer 'N' representing the size of the array/list.

    Second line contains 'N' single space separated integers representing the elements in the array/list.

##### Output Format :
    For each test case, print the unique element present in the array.

    Output for every test case will be printed in a separate line.

##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^3
    Time Limit: 1 sec

 ##### Sample Input 1:
    1
    7
    2 3 1 6 3 6 2

##### Sample Output 1:
    1

##### Sample Input 2:
    2
    5
    2 4 7 2 7
    9
    1 3 1 3 6 6 7 10 7

##### Sample Output 2:
    4
    10
 */

package JAVA_8_Arrays;

import org.w3c.dom.Attr;

import java.util.Scanner;

public class CN8_Assignment1_FindUnique {

    public static boolean linearSearch(int[] arr, int itr, int findNum) {
        boolean flag = true;
        for (int i = 0; i < arr.length && i != itr; i++) {
            if (findNum != arr[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

//    public static void findUnique(int[] arr){
//        for (int i=0;i<arr.length;i++){
//            boolean unique = linearSearch(arr, i, arr[i]);
//            if (unique == false){
//                System.out.println(arr[i]);
//            }
//        }
//    }

    public static void findUnique(int[] arr){
        boolean flag = false;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length && j != i;j++){
                if (arr[i] != arr[j]){
                    flag = true;
                    System.out.println(arr[i]);
                }else if (arr[i] == arr[j]){
                    flag = false;
                }
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
            findUnique(arr);
        }
    }
}
