/*
Assignment Coding Problem
Problem Name: Sum or Product
Problem Level: MEDIUM
Problem Description: #### Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).

#### If C is equal to -
     1, then print the sum
     2, then print the product
     Any other number, then print '-1' (without the quotes)

##### Input format :
    Line 1 : Integer N
    Line 2 : Choice C

##### Output Format :
     Sum or product according to user's choice

##### Constraints :
    1 <= N <= 12
 ##### Sample Input 1 :
    10
    1

##### Sample Output 1 :
    55

##### Sample Input 2 :
    10
    2

##### Sample Output 2 :
    3628800

##### Sample Input 3 :
    10
    4

##### Sample Output 3 :
    -1
 */


package JAVA_6;

import java.util.Scanner;

public class CN6_Assignment1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int condition = read.nextInt();
        int sum = 0;
        int product = 1;
        for (int i=1;i<=num;i++){
            if (condition == 1) {
                sum += i;
                System.out.print(sum + " ");
            }else if (condition == 2) {
                product *= i;
            }
        }
        if (condition == 1) {
            System.out.println(sum);
        }else if (condition == 2) {
            System.out.println(product);
        }else {
            System.out.println("-1");
        }

    }
}
