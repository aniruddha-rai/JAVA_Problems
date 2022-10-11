/*
Coding Problem
Problem Name: x to the power n
Problem Level: EASY
Problem Description: ####Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
####Do this recursively.

#####Input format :
    Two integers x and n (separated by space)

#####Output Format :
    x^n (i.e. x raise to the power n)

#####Constraints :
    1 <= x <= 30
    0 <= n <= 30
 #####Sample Input 1 :
     3 4

#####Sample Output 1 :
    81

#####Sample Input 2 :
     2 5

#####Sample Output 2 :
    32
 */

package JAVA_14_Recursion;

public class CN14_3_XtothePowerN {

    public static int power(int n, int pow){
        if (pow == 0){
            return 1;
        }
        pow--;
        return n*power(n, pow);
    }

    public static void main(String[] args) {
        int n = 3;
        int pow = 4;
        int ans = power(n,pow);
        System.out.println(ans);
    }
}
