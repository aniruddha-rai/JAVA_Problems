package JAVA_11_2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class CN11_10_Other_PairSum {

    public static void printArr(int[] arr) {
        for (int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // This Bubble Sort approach has Time Complexity ---> O(n^2)
    public static int[] sort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            int temp = arr[i];
            for (int j=0;j<arr.length-1;j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    // Using Binary Search
    public static void bsApproch(int[] arr, int target) {
        printArr(arr);
        for (int i=0;i<arr.length;i++) {
            int findNum = target - arr[i];
            int secondNum = binarySearch(arr, findNum, i);
            if (secondNum != -1){
                System.out.println(arr[i] + " " + secondNum);
            }
        }
    }

    public static int binarySearch(int[] arr, int num, int i) {
        int start = i+1;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid] == num){
                return arr[mid];
            }else if (arr[mid]>num){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

    // Using 2 Pointers
    public static void pairSum(int[] arr, int target) {
        for (int i=0,j=arr.length-1;i<j;){
            if (arr[i] + arr[j] == target){
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }else if ((arr[i] + arr[j]) < target){
                i++;
            }else {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int []arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = read.nextInt();
        }
        Arrays.sort(arr);   // Time Complexity of this is O(nlogn)
//        printArr(arr);
        int target = read.nextInt();
//        pairSum(arr, target);
        bsApproch(arr, target);
    }
}
