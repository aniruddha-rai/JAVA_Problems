/*
Coding Problem
Problem Name: All substrings
Problem Level: MEDIUM
Problem Description: #### Given a String S of length n, print all its substrings.
#### Substring of a String S is a part of S (of any length from 1 to n), which contains all consecutive characters from S.


##### Input Format :
    String S

##### Output Format :
     All Substrings of S, one in each line.

##### Constraints :
    0 <= |S| <= 10^2
    where |S| represents the length of string, S.

##### Note : The order in which you print substrings doesn't matter.
 #### Sample Input 1 :
    xyz
#### Sample Output 1 :
    x
    xy
    xyz
    y
    yz
    z

#### Sample Input 2 :
    ab
#### Sample Output 2 :
    a
    b
    ab


 */

package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_7_AllSubstrings {
    public static void printAllSubstring(String str){
        for (int i=0;i<str.length();i++){
            for (int j=0;j<str.length();j++){
                if (j<i) continue;
                System.out.println(str.substring(i, j+1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        printAllSubstring(str);
    }
}