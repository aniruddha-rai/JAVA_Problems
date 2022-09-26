/*
Assignment Coding Problem
Problem Name: Reverse Each Word
Problem Level: MEDIUM
Problem Description: #### Given a string S, reverse each word of a string individually. For eg. if a string is "abc def", reversed string should be "cba fed".

##### Input Format :
    String S

##### Output Format :
    Modified string

##### Constraints :
    0 <= |S| <= 10^7
    where |S| represents the length of string, S.
 ##### Sample Input 1:
    Welcome to Coding Ninjas

##### Sample Output 1:
    emocleW ot gnidoC sajniN

##### Sample Input 2:
    Give proper names to variables and functions

##### Sample Output 2:
    eviG reporp seman ot selbairav dna snoitcnuf
 */

package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_Assignment3_ReverseEachWord {

    public static void print(String str, int start, int end){
        for (int i=end;i>=start;i--){
            System.out.print(str.charAt(i));
        }
        System.out.print(" ");
//        return end;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        int len = str.length();
        int start = 0, end = len;
        for (int i=0;i<len;i++){
            if (i == len-1){
                end = len-1;
                print(str, start, end);
            }
            if (str.charAt(i) == ' '){
                end = str.charAt(i-1);
                print(str, start, end);
                start = i+1;
            }
        }
    }
}
