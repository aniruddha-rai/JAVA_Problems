/*
Assignment Coding Problem
Problem Name: Remove Consecutive Duplicates
Problem Level: MEDIUM
Problem Description: #### Given a string, S, remove all the consecutive duplicates that are present in the given string.  That means, if 'aaa' is present in the string then it should become 'a' in the output string.

##### Input format :
    String S
##### Output format :
    Modified string
##### Constraints :
    0 <= |S| <= 10^7
    where |S| represents the length of string, S.


 ##### Sample Input 1:
    aabccbaa

##### Sample Output 1:
    abcba

##### Sample Input 2:
    xxyyzxx

##### Sample Output 2:
    xyzx
 */

package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_Assignment2_RemoveConsecutiveDuplicates {

    public static void removeDuplicates(String str) {
        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i) == str.charAt(i+1)){
                System.out.print(str.charAt(i));
                i++;
            }else {
                System.out.print(str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.next();
        removeDuplicates(str);
    }
}
