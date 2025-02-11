package Patterns;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int i,j,k,spaces;

        // BUTTERFLY PATTERN -------------------------------->>>>>>>
        // Upper Half
        for (i=1;i<=num;i++) {
            for (j=1;j<=i;j++) {            // First Part
                System.out.print("* ");
            }
            spaces = 2*(num-i);
            for (k=1;k<=spaces;k++) {       // Spaces
                System.out.print("  ");
            }
            for (j=1;j<=i;j++) {            // Second Part
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower Half
        for (i=num;i>0;i--) {
            for (j=1;j<=i;j++) {
                System.out.print("* ");
            }
            spaces = 2*(num-i);
            for (k=1;k<=spaces;k++) {
                System.out.print("  ");
            }
            for (j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // SOLID RHOMBUS -------------------------------->>>>>>>
        for (i=1;i<=num;i++) {
            spaces = num-i;
            for (j=1;j<=spaces;j++) {
                System.out.print("  ");
            }
            for (k=1;k<=num;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // NUMBER PYRAMID -------------------------------->>>>>>>
        for (i=1;i<=num;i++) {
            spaces = num-i;
            for (j=1;j<=spaces;j++) {
                System.out.print("  ");
            }
            for (k=1;k<=(i+(i-1));k++) {
                if (k%2 == 0)
                    System.out.print("  ");
                else
                    System.out.print(i+" ");
            }
//            for (k=1;k<=i;k++) {             OR
//                System.out.print(i+" ");
//            }
            System.out.println();
        }


        // PALINDROMIC PATTERN -------------------------------->>>>>>>


    }
}
