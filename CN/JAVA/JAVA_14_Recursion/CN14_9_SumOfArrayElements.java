/*
Coding Problem
Problem Name: Sum of array (recursive)
Problem Level: EASY
Problem Description: #### Given an array of length N, you need to find and return the sum of all elements of the array.
####Do this recursively.

##### Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces

##### Output Format :
    Sum

##### Constraints :
    1 <= N <= 10^3

 #####Sample Input 1 :
    3
    9 8 9

#####Sample Output 1 :
    26

#####Sample Input 2 :
    3
    4 2 1

#####Sample Output 2 :
    7
 */

package JAVA_14_Recursion;

public class CN14_9_SumOfArrayElements {

    public static int sum(int[] arr, int n){
        if (n <= 0){
            return 0;
        }
//        int[] smallArr = new int[arr.length - 1];
//        for (int i=1;i<arr.length;i++){
//            smallArr[i-1] = arr[i];
//        }
        return sum(arr, n-1) + arr[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(sum(arr, arr.length));
    }
}
