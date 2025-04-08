package Patterns;

import java.util.Scanner;

public class P4_Array_2D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int row = read.nextInt();
        int col = read.nextInt();
        int[][] arr = new int[row][col];

//        for (int i=0;i<row;i++) {
//            for (int j=0;j<col;j++) {
//                arr[i][j] = read.nextInt();
//            }
//        }
//        for (int i=0;i<row;i++) {
//            for (int j=0;j<col;j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

//        // <<<<<<< ----- LINEAR SEARCH ----- >>>>>>>
//        for (int i=0;i<row;i++) {
//            for (int j=0;j<col;j++) {
//                arr[i][j] = read.nextInt();
//            }
//        }
//        int num = read.nextInt();
//        for (int i=0;i<row;i++) {
//            for (int j=0;j<col;j++) {
//                if (arr[i][j] == num)
//                    System.out.println("Num found at location (" + i + "," + j + ")");
//            }
//        }

        int row2 = col;
        int col2 = row;
        int[][] arrTranspose = new int[row2][col2];
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                arrTranspose[i][j] =  arr[i][j];
            }
        }

        for (int i=0;i<row2;i++) {
            for (int j=0;j<col2;j++) {
                System.out.print(arrTranspose[i][j]);
            }
            System.out.println();
        }


    }
}
