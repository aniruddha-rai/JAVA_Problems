// 41A Translation (30-05-2023)

import java.util.Scanner;

public class A_41A_Translation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String word1 = read.next().toLowerCase();
        String word2 = read.next().toLowerCase();

        StringBuilder result = new StringBuilder();
        for (int i=word1.length()-1;i>=0;i--){
            result.append(word1.charAt(i));
        }

        if (word2.equals(result.toString())){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        // Reverse a String
//        StringBuilder word2 = new StringBuilder();
//        char[] array = word1.toCharArray();
//        for (int i=array.length-1;i>=0;i--){
//            // word2 = word2 + array[i] + "";
//            word2.append(array[i]);
//        }

//        char[] array1 = word1.toCharArray();
//        char[] array2 = word2.toCharArray();
//        boolean flag = true;
//        for (int a=0,b=word2.length()-1;a<=word1.length() && b>=0;a++,b--){
//            if (array1[a] != array2[b]){
//                flag = false;
//            }
//        }
//        if (!flag){
//            System.out.println("NO");
//        }else {
//            System.out.println("YES");
//        }


    }
}
