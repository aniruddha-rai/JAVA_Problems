package JAVA_11_2D_Array;

import java.util.Scanner;

public class CN11_5_LargestColumnSum {

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

    public static int largeColSum(int[][] arr) {
        int largest = Integer.MIN_VALUE;
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i=0;i<cols;i++){
            int sum = 0;
            for (int j=0;j<rows;j++){
                sum += arr[j][i];
            }
            if (sum > largest) largest = sum;
        }
        return largest;
    }

    public static void main(String[] args) {
        int[][] input = takeInput();
        print(input);
        System.out.println(largeColSum(input));
    }
}
