package Patterns;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int i,j,k;

        // Solid Rectangle
        for (i=1;i<=num;i++) {
            for (j=1;j<=num;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hollow Rectangle
        for (i=1;i<=num;i++) {
            for (j=1;j<=num;j++) {
                if (i==1 || i==num || j==1 || j==num)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Half Right Sided Pyramid
        for (i=1;i<=num;i++) {
            for (j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Half Right Sided Inverted Pyramid
        for (i=1;i<=num;i++) {
            for (j=0;j<=num-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
                    // OR
        for (i=num;i>=1;i--) {
            for (j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i=1;i<=num;i++) {
            for (j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Half Left Sided Pyramid ------ num=5, i=1-5, j=1-5
        for (i=1;i<=num;i++) {
            for (k=1;k<=num-i;k++) {        // Space Print
                System.out.print(" ");
            }
            for (j=1;j<=i;j++) {            // Star Print
                System.out.print("*");
            }
            System.out.println();
        }

        // Half Left Sided Inverted Pyramid
        for (i=1;i<=num;i++) {
            for (k=1;k<=i-1;k++) {
                System.out.print(" ");
            }
            for (j=1;j<=num-(i-1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Half Left Sided Inverted Pyramid
        for (i=1;i<=num;i++) {
            for (k=1;k<=i-1;k++) {
                System.out.print(" ");
            }
            for (j=1;j<=num-(i-1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Half Left Sided Pyramid ------ num=5, i=1-5, j=1-5
        for (i=1;i<=num;i++) {
            for (k=1;k<=num-i;k++) {        // Space Print
                System.out.print(" ");
            }
            for (j=1;j<=i;j++) {            // Star Print
                System.out.print("*");
            }
            System.out.println();
        }

        // <<<<< ----- https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe0gqgFk-CUE-ktO5Cek1GdP&index=21 ----- >>>>> \\

        // Half Right Sided Numbered Pyramid
        for (i=1;i<=num;i++) {
            int count = 1;
            for (j=1;j<=i;j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
                    // OR
        for (i=1;i<=num;i++) {
            for (j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Half Right Sided Inverted Numbered Pyramid
        for (i=1;i<=num;i++) {
            for (j=1;j<=num-i+1;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
                    // OR
        for (i=0;i<num;i++) {
            for (j=1;j<=num-i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Floyd's Triangle
        int count = 1;
        for (i=1;i<=num;i++) {
            for (j=1;j<=i;j++) {
                System.out.print(count+" ");
                // For better visibility (Optional)
                if (count<10)
                    System.out.print(" ");
                count++;
            }
            System.out.println();
        }

        // 0-1 Triangle
        for (i=1;i<=num;i++) {
            for (j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
