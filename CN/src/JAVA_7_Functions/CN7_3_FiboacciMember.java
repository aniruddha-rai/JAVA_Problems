package JAVA_7_Functions;

import java.util.Scanner;

public class CN7_3_FiboacciMember {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        boolean flag = false;
        int firstNum = 1, secondNum = 1;
        int thirdNum = 0;
        for (int i=3;i<=num;i++){
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            if (thirdNum == num){
                flag = true;
            }
        }
        if (flag){
            System.out.println("True");
        }else System.out.println("False");
    }
}
