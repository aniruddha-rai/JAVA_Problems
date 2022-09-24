package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_3_CountWords {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        int count = 0;
        for (int i=0;i<input.length();i++){
            if (input.charAt(i) == ' ') count++;
        }
        System.out.println(count);
    }
}
