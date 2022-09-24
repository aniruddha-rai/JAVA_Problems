package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_4_StringPalindrome_Reverse {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        int len = input.length();
        boolean flag = false;

        // Logic to reverse a String
        String[] arr = new String[len];
        for (int i=len-1,j=0;i>=0;i--,j++){
            arr[i] = String.valueOf(input.charAt(j));
        }

        // Logic to check if input given is equal to our reverse string or not
        for (int k=0;k<len;k++){
            if (String.valueOf(input.charAt(k)).equals(arr[k])) {
                flag = true;
            }
        }

        if (flag){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
