package JAVA_8_Arrays;

import java.util.Scanner;

public class CN8_Assignment3_ArrayIntersection {

   public static boolean union(int find, int count, int[] arr){
            boolean flag = false;
            for (int j=0;j<arr.length;j++){
                if (find == arr[j]){
                    flag = true;
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            return flag;
        }

        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            int n1 = read.nextInt();
            int n2 = read.nextInt();
            int count = 0;
            int[] arr1 = new int[n1];
            int[] arr2 = new int[n2];
            for (int i=0;i<n1;i++){
                arr1[i] = read.nextInt();
            }
            for (int i=0;i<n2;i++){
                arr2[i] = read.nextInt();
            }

            if (n1 > n2) {
                count = n1;
                for (int i=0;i<n2;i++) {
                    boolean result = union(arr2[i], count, arr1);
                    if (result == false) count++;
                }
            }
            else{
                count = n2;
                for (int i=0;i<n1;i++) {
                    boolean result = union(arr1[i], count, arr2);
                    if (result == false) count++;
                }
            }

            System.out.println(count);

//                for (int i=0;i<n1;i++){
//            for (int j=0;j<n2;j++){
//            if (i < n2){
//                if (arr1[i] == arr2[i]){
//                    count++;
//                }
//                else {
//                    count += 2;
//                }
//            }
//            else count++;
//        }
//        System.out.println(count);

        }
    }