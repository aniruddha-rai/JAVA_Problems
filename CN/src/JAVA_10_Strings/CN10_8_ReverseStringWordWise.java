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
//        System.out.println(count);
    }
}
