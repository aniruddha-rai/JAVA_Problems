/*
Coding Problem
Problem Name: Print Like a Wave
Problem Level: MEDIUM
Problem Description:
#### For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.

##### Input format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

    Second line onwards, the next 'N' lines or rows represent the ith row values.

    Each of the ith row constitutes 'M' column values separated by a single space.

##### Output format :
    For each test case, print the elements of the two-dimensional array/list in the sine wave order in a single line, separated by a single space.

    Output for every test case will be printed in a seperate line.

##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^3
    0 <= M <= 10^3
    Time Limit: 1sec
 ##### Sample Input 1:
    1
    3 4
    1  2  3  4
    5  6  7  8
    9 10 11 12

##### Sample Output 1:
    1 5 9 10 6 2 3 7 11 12 8 4

##### Sample Input 2:
    2
    5 3
    1 2 3
    4 5 6
    7 8 9
    10 11 12
    13 14 15
    3 3
    10 20 30
    40 50 60
    70 80 90

##### Sample Output 2:
    1 4 7 10 13 14 11 8 5 2 3 6 9 12 15
    10 40 70 80 50 20 30 60 90
 */

package JAVA_11_2D_Array;

import java.util.Scanner;

public class CN11_7_PrintLikeAWave {

    public static void printWave(int row, int column, int[][] arr) {
        for (int i=0;i<column;i++){
            for (int j=0;j<row;j++) {
                if (i % 2 != 0) {
                    j = row-1;
                    while (j>=0){
                        System.out.print(arr[j][i] + " ");
                        j--;
                    }
                    i++;
                } else {
                    System.out.print(arr[j][i] + " ");
                }
            }
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
            printWave(row, column, arr);
        }
    }
}