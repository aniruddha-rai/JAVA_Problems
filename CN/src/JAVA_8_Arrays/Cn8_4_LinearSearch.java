package JAVA_8_Arrays;

import java.util.Scanner;

public class Cn8_4_LinearSearch {

    public static void linearSearch(int size, int[] arr, int findNum){
        boolean flag = true;
        for (int i=0;i<size;i++){
            if (findNum == arr[i]){
                flag = false;
                System.out.println(i);
                break;  // For single index num
            }
        }
        if (flag){
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        for (int i=0;i<num;i++){
            int size = read.nextInt();
            int[] arr = new int[size];
            for (int j=0;j<size;j++){
                arr[j] = read.nextInt();
            }
            int findNum = read.nextInt();
            linearSearch(size, arr, findNum);
        }
    }
}
