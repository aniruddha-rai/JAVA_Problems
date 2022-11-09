/*
Coding Problem
Problem Name: Last index of x
Problem Level: MEDIUM
Problem Description: ####Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
####Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
####You should start traversing your array from 0, not from (N - 1).
####Do this recursively. Indexing in the array starts from 0.

#####Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces
    Line 3 : Integer x

#####Output Format :
    last index or -1

#####Constraints :
####1 <= N <= 10^3

 #####Sample Input :
    4
    9 8 10 8
    8

#####Sample Output :
    3
 */


package JAVA_14_Recursion;

public class CN14_12_PrintLastIndex {

    // Without Recursion
//    public static int lastIndex(int[] arr, int num){
//        int ans = 0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] == num){
//                ans = i;
//            }
//        }
//        return ans;
//    }

    // With Recursion
    public static int lastIndex(int[] arr, int num, int i, boolean flag, int ans){
        if (i > arr.length-1 && !flag){
            return -1;
        }else if(i > arr.length-1 && flag){
            return ans;
        }
        if (arr[i] == num){
            flag = true;
            ans = i;
        }
        i++;
        return lastIndex(arr, num, i, flag, ans);
    }

    public static void main(String[] args) {
        int[] arr = {9,10,8};
        int num = 2;
        System.out.println(lastIndex(arr, num, 0, true, -1));
    }
}