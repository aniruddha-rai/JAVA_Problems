/*
Assignment Coding Problem
Problem Name: Check Permutation
Problem Level: MEDIUM
Problem Description: #### Given two strings, S and T, check if they are permutations of each other. Return true or false.
#### Permutation means - length of both the strings should same and should contain same set of characters. Order of characters doesn't matter.
##### Note : Input strings contain only lowercase english alphabets.
<br>

##### Input format :
    Line 1 : String 1
    Line 2 : String 2
##### Output format :
    'true' or 'false'
##### Constraints :
    0 <= |S| <= 10^7
    0 <= |T| <= 10^7
    where |S| represents the length of string, S.

 ##### Sample Input 1 :
    abcde
    baedc

##### Sample Output 1 :
    true

##### Sample Input 2 :
    abc
    cbd

##### Sample Output 2 :
    false
 */

package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_Assignment1_CheckPermutation {

    public static void checkPermutation(String str1, String str2){
        boolean flag = false;
        for (int i=0;i<str1.length();i++){
            for (int j=0;j<str2.length();j++){
                if (str1.charAt(i) == str2.charAt(j)){
                    flag = true;
                    break;
                }else {
                    flag = false;
                }
            }
        }
        if (flag){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str1 = read.next();
        String str2 = read.next();
        if (str1.length() == str2.length()){
            checkPermutation(str1, str2);
        }else {
            System.out.println("False");
        }
    }
}
