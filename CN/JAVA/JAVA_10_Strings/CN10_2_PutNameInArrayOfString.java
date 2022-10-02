package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_2_PutNameInArrayOfString {

    public static void printString(String str){
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        String[] arr = new String[name.length()];
        for (int i=0;i<arr.length;i++){
            arr[i] = String.valueOf(name.charAt(i));
        }
        for (String val: arr){
            System.out.print(val + " ");
        }
        System.out.println();
        printString(name);
    }
}
