package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_6_PrintPrefixOfString {

    public static void printPrefix(String str){
        for (int i=0;i<str.length();i++){
//            for (int j=0;j<=i;j++){
//                System.out.print(str.charAt(j));
//            }
//            System.out.println();

            // OR

            System.out.println(str.substring(0, i+1));
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        printPrefix(str);
    }
}
