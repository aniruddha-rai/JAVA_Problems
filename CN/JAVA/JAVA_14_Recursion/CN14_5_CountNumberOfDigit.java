/*
Coding Problem
Problem Name: Number of digits
Problem Level: EASY
Problem Description: ####Given the code to find out and return the number of digits present in a number recursively. But it contains few bugs, that you need to rectify such that all the test cases should pass.

#####Input Format :
    Integer n

#####Output Format :
    Count of digits

#####Constraints :
    1 <= n <= 10^6
 #####Sample Input 1 :
     156

#####Sample Output 1 :
    3

#####Sample Input 2 :
     7

#####Sample Output 2 :
    1


 */

package JAVA_14_Recursion;

public class CN14_5_CountNumberOfDigit {

    public static int count(int n, int count) {
        if (n == 0){
            return count;
        }
        n = n/10;
        count++;
        return count(n,count);
    }

    public static void main(String[] args) {
        int n = 1234567845;
        int ans = count(n,0);
        System.out.println(ans);
    }
}
