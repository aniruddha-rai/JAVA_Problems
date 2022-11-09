/*
Coding Problem
Problem Name: All indexes of x
Problem Level: MEDIUM
Problem Description: ####Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
####Do this recursively. Indexing in the array starts from 0.

#####Input Format :
    Line 1 : An Integer N i.e. size of array
    Line 2 : N integers which are elements of the array, separated by spaces
    Line 3 : Integer x

#####Output Format :
    indexes where x is present in the array (separated by space)

#####Constraints :
####1 <= N <= 10^3

 #####Sample Input :
    5
    9 8 10 8 8
    8

#####Sample Output :
    1 3 4
 */

package JAVA_14_Recursion;

public class CN14_13_PrintAll_Indexes {

    // Without Recursion
    public static void allIndex(int[] arr, int num){
        int ans = 0;
        int[] arr2 = new int[arr.length];
        for (int i=0, j=0;i<arr.length;i++){
            if (arr[i] == num){
////                ans = i;
//                System.out.println(i);
                arr2[j] = i;
                j++;
            }
        }
        for (int j:arr2){
            System.out.println(j);
        }
    }

    // With Recursion
//    public static int allIndex(int[] arr, int num, int i, boolean flag, int ans){
//        if (i > arr.length-1 && !flag){
//            return -1;
//        }else if(i > arr.length-1 && flag){
//            return ans;
//        }
//        if (arr[i] == num){
//            flag = true;
//            ans = i;
//            System.out.println(i);
//        }
//        i++;
//        return allIndex(arr, num, i, flag, ans);
//    }

    public static int allIndex(int[] arr, int num, int i, boolean flag, int ans, int j){
        int[] arr2 = new int[arr.length-1];
        if (i > arr.length-1 && !flag){
            return -1;
        }else if(i > arr.length-1 && flag){
            for (int k:arr2){
                System.out.println(k);
            }
            return ans;
        }

        if (arr[i] == num){
            flag = true;
            arr2[j] = i;
            j++;
            ans = i;
            System.out.println(i);
        }
        i++;
        return allIndex(arr, num, i, flag, ans, j);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10,8,8};
        int num = 8;
//        allIndex(arr, num);
        System.out.println(allIndex(arr, num, 0, true, -1, 0));
    }
}