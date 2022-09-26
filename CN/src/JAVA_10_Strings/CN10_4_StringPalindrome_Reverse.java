/*
Coding Problem
Problem Name: String Palindrome
Problem Level: EASY
Problem Description: #### Given a String s, check it its palindrome. Return true if string is palindrome, else return false.
#### Palindrome strings are those, where string s and its reverse is exactly same.


##### Input Format :
     String S
##### Output Format :
    "true" if S is palindrome, else "false"
##### Constraints :
    0 <= |S| <= 10^7
    where |S| represents the length of string, S.
 ##### Sample Input 1 :
    abcdcba
##### Sample Output 1 :
    true

##### Sample Input 1 :
    abcd
##### Sample Output 1 :
    false
 */

package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_4_StringPalindrome_Reverse {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        int len = input.length();
        boolean flag = false;

        // Logic to reverse a String
        String[] arr = new String[len];
        for (int i=len-1,j=0;i>=0;i--,j++){
            arr[i] = String.valueOf(input.charAt(j));
        }

        // Logic to check if input given is equal to our reverse string or not
        for (int k=0;k<len;k++){
            if (String.valueOf(input.charAt(k)).equals(arr[k])) {
                flag = true;
            }
        }

        if (flag){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
