package JAVA_11_2D_Array;

import java.util.Scanner;

public class CN11_3_ColumnWiseSum {
    public static void columnSum(int row, int column, int[][] arr) {
        int sum = 0;
        for (int i=0;i<column;i++){
            for (int j=0;j<row;j++){
                sum += arr[j][i];
            }
            System.out.print(sum + " ");
            sum = 0;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        for (int k=0;k<num;k++) {
            int row = read.nextInt();
            int column = read.nextInt();
            int[][] arr = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    arr[i][j] = read.nextInt();
                }
            }
            columnSum(row, column, arr);
        }
    }
}