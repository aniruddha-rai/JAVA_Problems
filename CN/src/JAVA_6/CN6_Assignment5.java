/*
Assignment Coding Problem
Problem Name: Square Root (Integral)
Problem Level: MEDIUM
Problem Description: #### Given a number N, find its square root. You need to find and print only the integral part of square root of N.
#### For eg. if number given is 18, answer is 4.

##### Input format :
    Integer N

##### Output Format :
    Square root of N (integer part only)

##### Constraints :
    0 <= N <= 10^8
 ##### Sample Input 1 :
    10

##### Sample Output 1 :
    3

##### Sample Input 2 :
    4

##### Sample Output 2 :
    2

 */

package JAVA_6;

import java.util.Scanner;

public class CN6_Assignment5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int i = 1, result = 1;

        while (result <= num) {
            i++;
            result = i * i;
        }
        System.out.println(i-1);
    }
}
