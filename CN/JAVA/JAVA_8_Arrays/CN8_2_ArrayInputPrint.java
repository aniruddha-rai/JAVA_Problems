package JAVA_8_Arrays;

import java.util.Scanner;

public class CN8_2_ArrayInputPrint {

    public static int[] takeInput(){
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] arrInput = new int[size];

        for (int i=0;i<size;i++){
            arrInput[i] = read.nextInt();
        }
        return arrInput;
    }

    public static void printArr(int[] arrInput){
        for (int j : arrInput) {
            System.out.print(j + " ");
        }
        System.out.println();
        /*int size = arrInput.length;
        for (int i=0;i<size;i++){
            System.out.print(arrInput[i] + " ");
         }*/

    }

    public static int largestInArray(int[] arrInput){
        // int max = -9999999;
        int max = Integer.MIN_VALUE;
        for (int j : arrInput){
            if (j > max){
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        printArr(arr);
        int largest = largestInArray(arr);
        System.out.println(largest);
    }
}
