package JAVA_1_to_5;

//        Problem Name: Find Character Case
//        Problem Level: EASY
//        Problem Description: ####Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
//####1, if the character is an uppercase alphabet (A - Z)
//####0, if the character is a lowercase alphabet (a - z)
//####-1, if the character is not an alphabet

import java.util.Scanner;

public class CN3_isUpper_Lower_notAlphabetic {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

//        String str = read.next();
//        if (str.equals(str.toLowerCase())){
//            System.out.println(0);
//        }else if (str.equals(str.toUpperCase())){
//            System.out.println(1);
//        }else {
//            System.out.println(-1);
//        }
//        if (Character.isUpperCase(str.charAt(0))){
//            System.out.println(0);
//        }else if (Character.isLowerCase(str.charAt(0))) {
//            System.out.println(1);
//        }else if (!Character.isAlphabetic(str.charAt(0))){
//            System.out.println(-1);
//        }


//        char ch = read.next().charAt(0);
//        if (Character.isUpperCase(ch)) {
//            System.out.println(0);
//        }else if (Character.isLowerCase(ch)) {
//            System.out.println(1);
//        }else if (!Character.isAlphabetic(ch)){
//            System.out.println(-1);
//        }


//        if (ch >= 'A' && ch <= 'Z') {
//            System.out.println(0);
//        }else if (ch >= 'a' && ch <= 'z') {
//            System.out.println(1);
//        }else {
//            System.out.println(-1);
//        }


        String character = read.next();
        char character2 = character.charAt(0);
        if (character2 >= 65 && character2 <=90) {
            System.out.println(1);
        } else if (character2 >= 97 && character2 <=122) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }


    }
}
