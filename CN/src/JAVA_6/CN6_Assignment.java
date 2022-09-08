package JAVA_6;

import java.util.Scanner;

public class CN6_Assignment {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int condition = read.nextInt();
        int sum = 0;
        int product = 1;
        for (int i=1;i<=num;i++){
            if (condition == 1) {
                sum += i;
                System.out.print(sum + " ");
            }else if (condition == 2) {
                product *= i;
            }
        }
        if (condition == 1) {
            System.out.println(sum);
        }else if (condition == 2) {
            System.out.println(product);
        }else {
            System.out.println("-1");
        }

    }
}
