package JAVA_11_2D_Array;

import java.util.Scanner;

public class CN11_4_HowArrayStored {

    public static int[][] takeInput() {
        Scanner read = new Scanner(System.in);
        int rows = read.nextInt();
        int column = read.nextInt();
        int[][] arr = new int[rows][column];
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                arr[i][j] = read.nextInt();
            }
        }
        return arr;
    }

    public static void print(int[][] arr){
        int rows = arr.length;
        int column = arr[0].length;

        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

//        int[][] arr = {{1,2,3},{4,5,6}};
//        System.out.println(arr);            // address to array (master array) which contain addresses of 1D arrays
//        System.out.println(arr.length);     // returns rows
//        for (int i=0;i<2;i++){
//            System.out.println(arr[i]);         // address to 1D array which is referenced in master array
//            System.out.println(arr[i].length);  // returns column

        int[][] inputArr = takeInput();
        print(inputArr);
    }
}
