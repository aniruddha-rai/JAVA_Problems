/*
Assignment Coding Problem
Problem Name: Compress the String
Problem Level: MEDIUM
Problem Description: #### Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
#### For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".

##### Note : Consecutive count of every character in input string is less than equal to 9.
<br>

##### Input Format :
    String S

##### Output Format :
    Compressed string

##### Constraints :
    0 <= |S| <= 10^7
    where |S| represents the length of string, S.
 ##### Sample Input 1 :
    aaabbccdsa

##### Sample Output 1 :
    a3b2c2dsa

##### Sample Input 2 :
    aaabbcddeeeee

##### Sample Output 2 :
    a3b2cd2e5

 */

package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_Assignment6_CompressTheString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        int count = 1;
        for (int i=0;i<str.length();i++){
                while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                    count++;
                    i++;
                }
            if (count == 1) {
                System.out.print(str.charAt(i));
                continue;
            }else {
                System.out.print(str.charAt(i) + "" + count);
            }
            count = 1;
        }
    }
}
