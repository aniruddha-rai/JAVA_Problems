package JAVA_6;

import java.util.Scanner;

public class CN6_6_Break_PrimeNo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        boolean flag = false;

        // FOR LOOP
        for (int i=2;i<num;i++){
            if (num%i == 0){
                flag = true;
                break;
            }
        }

        // WHILE LOOP
//        int i = 2;
//        while (i < num){
//            if (num % i == 0){
//            flag = true;
//            break;
//            }
//            i++;
//        }

        if (flag){
            System.out.println("Not Prime");
        }else System.out.println("Prime");
    }
}
