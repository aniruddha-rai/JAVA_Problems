/*
Assignment Coding Problem
Problem Name: Highest Occurring Character
Problem Level: MEDIUM
Problem Description: #### Given a string, S, find and return the highest occurring character present in the given string.
##### If there are 2 characters in the input string with same frequency, return the character which comes first.
<br>

##### Note : Assume all the characters in the given string are lowercase.
<br>

##### Input format :
    String S
##### Output format :
    Highest occurring character
##### Constraints :
    0 <= |S| <= 10^7
    where |S| represents the length of string, S.
 ##### Sample Input 1:
    abdefgbabfba

##### Sample Output 1:
    b

##### Sample Input 2:
    xy

##### Sample Output 2:
    x
 */

package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_Assignment5_HighestOccuringCharacter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String character = read.nextLine();
//        int count = 1;
        char ch = 0;
        for (int i=0;i<character.length();i++){
            for (int j=i+1;j<character.length();j++){
                if (character.charAt(i) == character.charAt(j)) {
//                    count++;
                    ch = character.charAt(i);
                    break;
                }
            }
//            count = 0;
        }
        System.out.println(ch);
    }
}
