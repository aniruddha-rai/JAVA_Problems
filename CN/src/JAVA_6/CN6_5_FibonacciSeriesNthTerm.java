package JAVA_6;

import java.util.Scanner;

public class CN6_5_FibonacciSeriesNthTerm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        int firstNum = 1, secondNum = 1;
        int thirdNum = 0;
        for (int i=3;i<=num;i++){
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }
        System.out.println(thirdNum);
    }
}
