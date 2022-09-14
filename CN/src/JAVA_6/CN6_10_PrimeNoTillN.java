package JAVA_6;

import java.util.Scanner;

public class CN6_10_PrimeNoTillN {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        for (int i=2;i<=num;i++) {
            for (int j = 3; j <= num; j++) {
                if (i % j == 0) break;
                System.out.println(i);
            }
        }
    }
}
