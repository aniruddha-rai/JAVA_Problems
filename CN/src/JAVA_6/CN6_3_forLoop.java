package JAVA_6;

import java.util.Scanner;

public class CN6_3_forLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        // FOR LOOP
        int sum = 0;
        for (int i=1;i<=num;i++){
            sum += i;
        }

        // WHILE LOOP
//        int i = 1;
//        int sum = 0;
//        while (i <= num){
//            sum += i;
//            i++;
//        }

        System.out.println(sum);
    }
}
