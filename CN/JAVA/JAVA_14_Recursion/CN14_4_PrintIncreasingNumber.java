/*
Coding Problem
Problem Name: Print numbers
Problem Level: EASY
Problem Description: #### Given is the code to print numbers from 1 to n in increasing order recursively. But it contains few bugs that you need to rectify such that all the test cases pass.

##### Input Format :
    Integer n

##### Output Format :
    Numbers from 1 to n (separated by space)

##### Constraints : c
    1 <= n <= 10000
 ##### Sample Input 1 :
     6

##### Sample Output 1 :
    1 2 3 4 5 6

##### Sample Input 2 :
     4

##### Sample Output 2 :
    1 2 3 4

 */

package JAVA_14_Recursion;

public class CN14_4_PrintIncreasingNumber {

    public static int print(int n, int a) {
        if (a == n){
            System.out.print(a + " ");
            return n;
        }
        System.out.print(a + " ");
        return print(n,a+1);
    }

    public static void main(String[] args) {
        int n = 8;
        print(n,1);
//        System.out.println(ans);
    }
}
