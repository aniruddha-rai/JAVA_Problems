/*
Coding Problem
Problem Name: Count Words
Problem Level: EASY
Problem Description: #### Given a string S, count number of words in the string.
##### Note : Assume there is single space between two words and there are no extra spaces before and after words.
<br>

##### Input Format :
     String S
##### Output Format :
    Count of words
##### Constraints :
    0 <= |S| <= 10^7
    where |S| represents the length of string, S.


 ##### Sample Input 1:
    this is a sample string

##### Sample Output 1:
    5

##### Sample Input 2:
    coding is awesome

##### Sample Output 2:
    3
 */

package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_3_CountWords {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        int count = 0;
        for (int i=0;i<input.length();i++){
            if (input.charAt(i) == ' ') count++;
        }
        System.out.println(count);
    }
}
