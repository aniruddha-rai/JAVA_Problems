/*
Coding Problem
Problem Name: First Index
Problem Level: EASY
Problem Description: ####Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
####First index means, the index of first occurrence of x in the input array.
####Do this recursively. Indexing in the array starts from 0.

#####Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces
    Line 3 : Integer x

#####Output Format :
    first index or -1

#####Constraints :
####1 <= N <= 10^3

 #####Sample Input :
    4
    9 8 10 8
    8

#####Sample Output :
    1
 */

package JAVA_14_Recursion;

public class CN14_11_PrintFirstIndex {

    public static int firstIndex(int[] arr, int n, int num){
        if (n == arr.length-1){
            return -1;
        }

        if (arr[n] == num){
            return n;
        }

        return firstIndex(arr, n++, num);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10};
        int num = 8;
        System.out.println(firstIndex(arr, 0, num));
    }
}
