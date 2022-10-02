/*
Assignment Coding Problem
Problem Name: Reverse of a number
Problem Level: MEDIUM
Problem Description: #### Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

##### Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
<br>

##### Input format :
    Integer N

##### Output format :
    Corresponding reverse number

##### Constraints:
    0 <= N < 10^8
 ##### Sample Input 1 :
    1234

##### Sample Output 1 :
    4321

##### Sample Input 2 :
    1980

##### Sample Output 2 :
    891
 */


package JAVA_6;

import java.util.Scanner;

public class CN6_Assignment3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long num = read.nextLong();
        while (num > 0){
            int ans = (int) (num%10);
            if (ans == 0) num /= 10;
            else {
                System.out.print(ans);
                num /= 10;
            }

        }
    }
}
