package JAVA_6;

import java.util.Scanner;

public class CN6_7_Break_Pattern {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

//        for (int i=1;i<=num;i++){
//            for (int j=1;j<=num;j++){
//                System.out.print(j+" ");
//                if (j > i){
//                    break;
//                }
//            }
//            System.out.println();
//            i++;
//        }

        int i = 1;
        while (i <= num){
            int j = 1;
            while (j <= num){
                System.out.print(j + " ");
                j++;
                if (j > i){
                    break;
                }
            }
            System.out.println();
            i++;
        }

//        int i = 1;
//        while (i <= num){
//            int j = 1;
//            while (j <= i){
//                System.out.print(j + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

    }
}
