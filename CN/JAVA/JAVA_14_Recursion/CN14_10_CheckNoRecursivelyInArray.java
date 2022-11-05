/*
Coding Problem
Problem Name: Check number recursively
Problem Level: EASY
Problem Description: ####Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
####Do this recursively.

#####Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces
    Line 3 : Integer x

#####Output Format :
    'true' or 'false'

#####Constraints :
    1 <= N <= 10^3

 #####Sample Input 1 :
    3
    9 8 10
    8

##### Sample Output 1 :
    true

##### Sample Input 2 :
    3
    9 8 10
    2

##### Sample Output 2 :
    false
 */

package JAVA_14_Recursion;

public class CN14_10_CheckNoRecursivelyInArray {

    public static boolean check(int[] arr, int n, int num){
        if (n <= 0){
            return false;
        }

        if (arr[n] == num){
            return true;
        }

        return check(arr, n+1, num);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10};
        int num = 8;
        System.out.println(check(arr, 0, num));
    }
}
