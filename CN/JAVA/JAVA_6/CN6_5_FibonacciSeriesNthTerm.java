/*
Coding Problem
Problem Name: Nth Fibonacci number
Problem Level: EASY
Problem Description: #### Nth term of fibonacci series F(n) is calculated using following formula -
        F(n) = F(n-1) + F(n-2),
        Where, F(1) = F(2) = 1

#### Provided N you have to find out the Nth Fibonacci Number.


##### Input Format :
    Integer n
##### Output Format :
    Nth Fibonacci term i.e. F(n)
##### Constraints:
    1 <= n <= 25
 ##### Sample Input 1:
    4
##### Sample Output 2:
    3

##### Sample Input 1:
    6
##### Sample Output 2:
    8
 */

package JAVA_6;

import java.util.Scanner;

public class CN6_5_FibonacciSeriesNthTerm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        int firstNum = 1, secondNum = 1;
        int thirdNum = 0;
        for (int i=3;i<=num;i++){
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }
        System.out.println(thirdNum);
    }
}
