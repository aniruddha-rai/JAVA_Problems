package JAVA_8_Arrays;

import java.util.Scanner;

public class CN8_Assignment11_ZeroesToEnd {

    public static void zeroesToEnd(int[] arr){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] != 0){
                System.out.print(arr[i] + " ");
            }else count++;
        }
        for (int j=0;j<count;j++){
            System.out.print(0 + " ");
        }
        System.out.println();
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
            zeroesToEnd(arr);
        }
    }
}
