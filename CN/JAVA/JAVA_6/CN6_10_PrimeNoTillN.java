/*
Coding Problem
Problem Name: All prime numbers
Problem Level: MEDIUM
Problem Description: #### Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
#### Print the prime numbers in different lines.

##### Input Format :
    Integer N

##### Output Format :
    Prime numbers in different lines

##### Constraints :
    1 <= N <= 100
 ##### Sample Input 1:
    9

##### Sample Output 1:
    2
    3
    5
    7

##### Sample Input 2:
    20

##### Sample Output 2:
    2
    3
    5
    7
    11
    13
    17
    19

 */

package JAVA_6;

import java.util.Scanner;

public class CN6_10_PrimeNoTillN {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();


        for (int j=2;j<=num;j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
//                    System.out.println(j);
                    break;
                }
                else System.out.println(j);
                break;
            }
        }

//        Printing All Non Prime Numbers
//        for (int j=2;j<=num;j++) {
//            for (int i = 2; i < j; i++) {
//                if (j % i == 0) {
//                    System.out.println(j);
//                    break;
//                }
//            }
//        }

    }
}
