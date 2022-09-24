package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_7_AllSubstrings {
    public static void printAllSubstring(String str){
        for (int i=0;i<str.length();i++){
            for (int j=0;j<str.length();j++){
                if (j<i) continue;
                System.out.println(str.substring(i, j+1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        printAllSubstring(str);
    }
}