package JAVA_10_Strings;

import java.util.Scanner;

public class CN10_1_PutNameInArrayOfString {
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
    }
}
