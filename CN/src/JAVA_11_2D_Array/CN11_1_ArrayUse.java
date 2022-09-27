package JAVA_11_2D_Array;

import java.util.Scanner;

public class CN11_1_ArrayUse {
    public static void main(String[] args) {

//        int[][] arr2D = new int[3][4];
//        System.out.println(arr2D[1][2]);
//        arr2D[2][0] = 15;
//        System.out.println(arr2D[2][0]);

//        int[][] arr2 = {{1,2,3},
//                        {4,5,6},
//                        {7,8,9}};
//        System.out.println(arr2[1][2]);

        Scanner read = new Scanner(System.in);
        int rows = read.nextInt();
        int column = read.nextInt();
        int[][] arr = new int[rows][column];
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                arr[i][j] = read.nextInt();
            }
        }

        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
