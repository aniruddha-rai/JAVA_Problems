/*
Coding Problem
Problem Name: Reverse string Word Wise
Problem Level: MEDIUM
Problem Description: #### Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.

##### Input format :
    String in a single line
##### Output format :
    Word wise reversed string in a single line
##### Constraints :
    0 <= |S| <= 10^7
    where |S| represents the length of string, S.
 ##### Sample Input 1:

    Welcome to Coding Ninjas

##### Sample Output 1:

    Ninjas Coding to Welcome

##### Sample Input 2:

    Always indent your code

##### Sample Output 2:
    code your indent Always


 */

package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_8_ReverseStringWordWise {

    public static int print(String input, int start, int end){
        for (int i=start;i<end;i++){
            System.out.print(input.charAt(i));
        }
        System.out.print(" ");
        end = start-1;
        return end;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        int len = input.length();
        int start = 0, end = len;
        for (int i=len-1;i>=0;i--){
            if (i == 0){
                start = 0;
                print(input, start, end);
            }
            if (input.charAt(i) == ' '){
                start = i+1;
                end = print(input, start, end);
            }
        }
    }
}
