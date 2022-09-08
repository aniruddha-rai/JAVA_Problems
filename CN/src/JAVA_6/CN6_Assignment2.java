/*
Assignment Coding Problem
Problem Name: Terms of AP
Problem Level: MEDIUM
Problem Description: #### Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

##### Input format :
    Integer x

##### Output format :
    Terms of series (separated by space)

##### Constraints :
    1 <= N <= 1,000
 ##### Sample Input 1 :
    10

##### Sample Output 1 :
    5 11 14 17 23 26 29 35 38 41

##### Sample Input 2 :
    4

##### Sample Output 2 :
    5 11 14 17
 */


package JAVA_6;

import java.util.Scanner;

public class CN6_Assignment2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int j = 1;
        for (int i=1;i<=num;i++){
            int ans = (3*j + 2);
//            System.out.print(ans + "-");
            if (ans % 4 != 0){
                System.out.print(ans + " ");
            } else {
                i--;
            }
            j++;
        }
    }
}
