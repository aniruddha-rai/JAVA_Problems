package JAVA_1_to_5;

/*
    Need to figure out these below points to start printing patters:
    1. Number of rows
    2. Number of columns in ith row
    3. What to print
 */

import java.util.Scanner;

public class CN4_Patterns {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//
////        SQUARE PATTERNS ---------------------------------------------------------------------->
//
////        ****
////        ****
////        ****
////        ****
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=n) {
////                System.out.print("*");
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
////        7777777
////        7777777
////        7777777
////        7777777
////        7777777
////        7777777
////        7777777
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=n) {
////                System.out.print(n);
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        1111
////        2222
////        3333
////        4444
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=n) {
////                System.out.print(i);
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        1234
////        1234
////        1234
////        1234
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=n) {
////                System.out.print(j);
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        4321
////        4321
////        4321
////        4321
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = n;
////            while (j>=1) {
////                System.out.print(j);
////                j--;
////            }
////            System.out.println();
////            i++;
////        }
//
////        OR
//
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=n) {
////                System.out.print(n-j+1);
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
//
////        12345
////        23456
////        34567
////        45678
////        56789
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = n;
////            int val = i;
////            while (j>=1) {
////                System.out.print(val);
////                val++;
////                j--;
////            }
////            System.out.println();
////            i++;
////        }
//
//
//
//
//
////        TRIANGULAR PATTERNS --------------------------------------------------------------------->
//
//
////        1
////        12
////        123
////        1234
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=i) {
////                System.out.print(j);
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        1
////        23
////        456
////        78910
////        int n = read.nextInt();
////        int i = 1;
////        int val = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=i) {
////                System.out.print(val);
////                val++;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        1
////        23
////        345
////        4567
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            int val = i;
////            while (j<=i) {
////                System.out.print(val);
////                val++;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        *
////        **
////        ***
////        ****
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=i) {
////                System.out.print("*");
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        1
////        22
////        333
////        4444
////        55555
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=i) {
////                int val = i;
////                System.out.print(val);
////                val++;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        1
////        21
////        321
////        4321
////        54321
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            int val = i;
////            while (j<=i) {
////                System.out.print(val);
////                val--;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
//
////        CHARACTER PATTERNS --------------------------------------------------------------------->
//
//
//
////        ABCDE
////        ABCDE
////        ABCDE
////        ABCDE
////        ABCDE
////        int n = read.nextInt();
//////        char ch = 'A';
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            while (j<=n){
////                System.out.print((char)('A' + j - 1));
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        AAAAA
////        BBBBB
////        CCCCC
////        DDDDD
////        EEEEE
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            while (j<=n){
////                System.out.print((char)('A' + i - 1));
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        ABCDE
////        BCDEF
////        CDEFG
////        DEFGH
////        EFGHI
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            char ch = (char)('A' + i - 1);
////            while (j<=n){
////                System.out.print(ch);
////                ch++;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
//
////        A
////        BB
////        CCC
////        DDDD
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            while (j<=i){
////                System.out.print((char)('A' + i - 1));
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        A
////        AB
////        ABC
////        ABCD
////        ABCDE
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            while (j<=i){
////                System.out.print((char)('A' + j - 1));
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        A
////        BC
////        CDE
////        DEFG
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            char ch = (char)('A' + i - 1);
////            while (j<=i){
////                System.out.print(ch);
////                ch++;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        D
////        DE
////        DEF
////        DEFG
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            char ch = (char)('A' + n - 1);
////            while (j<=i){
////                System.out.print(ch);
////                ch++;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        D
////        DC
////        DCB
////        DCBA
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            char ch = (char)('A' + n - 1);
////            while (j<=i){
////                System.out.print(ch);
////                ch--;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        E
////        DE
////        CDE
////        BCDE
////        ABCDE
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            char ch = (char)('A' + n - i);
////            while (j<=i){
////                System.out.print(ch);
////                ch++;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        1
////         12
////          123
////           1234
////            12345
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int j = 1;
////            int space = 1;
////            while (space <= i){
////                System.out.print(" ");
////                space++;
////            }
////            while (j<=i){
////                System.out.print(j);
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////            *
////           **
////          ***
////         ****
////        *****
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int space = 1;
////            while (space <= n-i){
////                System.out.print(" ");
////                space++;
////            }
////            int j = 1;
////            while (j<=i){
////                System.out.print("*");
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        *****
////        ****
////        ***
////        **
////        *
////        int n = read.nextInt();5
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=n-i+1) {
////                System.out.print("*");
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////            *****
////           ****
////          ***
////         **
////        *
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int space = 1;
////            while (space <= n-i){
////                System.out.print(" ");
////                space++;
////            }
////            int j = 1;
////            while (j<=n-i+1) {
////                System.out.print("*");
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        *****
////         ****
////          ***
////           **
////            *
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int space = n;
////            while (space >= n-i+2){
////                System.out.print(" ");
////                space--;
////            }
////            int j = 1;
////            while (j<=n-i+1) {
////                System.out.print("*");
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        5
////        44
////        333
////        2222
////        11111
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = 1;
////            while (j<=i) {
////                int val = n-i+1;
////                System.out.print(val);
////                val++;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        55555
////        4444
////        333
////        22
////        1
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = n;
////            while (j>=i) {
////                int val = n-i+1;
////                System.out.print(val);
////                j--;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        4567
////        345
////        23
////        1
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = n;
////            int val = n-i+1;
////            while (j>=i) {
////
////                System.out.print(val);
////                val++;
////                j--;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////        54321
////        4321
////        321
////        21
////        1
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int j = n;
////            int val = n-i+1;
////            while (j>=i) {
////
////                System.out.print(val);
////                val--;
////                j--;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////            1
////           12
////          123
////         1234
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int spaces = 1;
////            while (spaces <= n-i){
////                System.out.print(" ");
////                spaces++;
////            }
////            int j = 1;
////            while (j <= i){
////                System.out.print(j);
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////           1
////          121
////         12321
////        1234321
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n) {
////            int spaces = 1;
////            while (spaces <= n-i){
////                System.out.print(" ");
////                spaces++;
////            }
////            int j = 1;
////            while (j <= i){
////                System.out.print(j);
////                j++;
////            }
////            int k = i-1;
////            j = 1;
////            while (j <= i-1){
////                System.out.print(k);
////                k--;
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//
////                *
////               ***
////              *****
////             *******
////            *********
////        int n = read.nextInt();
////        int i = 1;
////        while (i <= n){
////            int space = 1;
////            while (space <= n-i){
////                System.out.print(" ");
////                space++;
////            }
////            int j = 1;
////            while (j <= i){
////                System.out.print("*");
////                j++;
////            }
////            int k = 1;
////            while (k <= i-1){
////                System.out.print("*");
////                k++;
////            }
////            System.out.println();;
////            i++;
////        }
//
////        int n = read.nextInt();
////        int i = 1;
////        while (i<=n){
////            int space = 1;
////            while (space<=n-i){
////                System.out.print("_");
////                space++;
////            }
////            int j = 1;
////            while (j<=i){
////                System.out.print("*");
////                j++;
////            }
////            System.out.println();
////            i++;
////        }
//
//        int n = 3; // Size of the square and triangle
//        // Print the square and triangle side by side
//        for (int i = 0; i < n; i++) {
//            // Print the square
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//            }
//
//            // Print the space between the square and the triangle
//            System.out.print(" ");
//
//            // Print the triangle
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            // Move to the next line
//            System.out.println();
//        }
//


//        // Print the pattern
//        for (int i = 1; i <= n; i++) {
//            // Calculate the number of stars to print
//            int stars;
//            if (i <= (n + 1) / 2) {
//                stars = i;
//            } else {
//                stars = n - i + 1;
//            }
//
//            // Print the stars for the current line
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i = 1; i <= n; i++) {
//            // Calculate the number of stars to print
//            int stars, space;
//            if (i <= (n + 1) / 2) {
//                stars = i;
//            } else {
//                stars = n - i + 1;
//            }
//
//            for (int k = 1; k <= n-i-2; k++) {
//                System.out.print(" ");
//            }
//
////            for (int k = 5; k >= n-i; k--) {
////                System.out.print(" ");
////            }
//
//            // Print the stars for the current line
//            for (int j = 0; j < stars; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        // Get the user input for n
//        System.out.print("Enter an odd number for n: ");
//        int n = read.nextInt();
//
//        // Check if the input is valid
//        if (n < 1 || n % 2 == 0) {
//            System.out.println("Please enter a positive odd number.");
//            return;
//        }
//
//        // Print the pattern
//        for (int i = 0; i < n; i++) {
//            int numSpaces;
//            int numStars;
//
//            if (i == 0 || i == n - 1) {
//                numSpaces = (n - 1) / 2; // 2 spaces for the first and last line if n = 5
//                numStars = 1;
//            } else if (i == n / 2) {
//                numSpaces = 0; // No spaces for the middle line
//                numStars = n;
//            } else {
//                numSpaces = 1; // 1 space for the lines just before and after the middle
//                numStars = n - 2; // 3 stars if n = 5
//            }
//
//            // Print the spaces
//            for (int j = 0; j < numSpaces; j++) {
//                System.out.print(" ");
//            }
//
//            // Print the stars
//            for (int k = 0; k < numStars; k++) {
//                System.out.print("*");
//            }
//
//            // Move to the next line
//            System.out.println();
//        }


//        //taking user input
//        System.out.print("Enter the number of row ");
//        int n=read.nextInt();
//        //declare for loop for print first pyramid
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i*2-1;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //declare for loop for print reverse pyramid
//        for(int i=n-1;i>0;i--)
//        {
//            for(int j=1;j<=n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i*2-1;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//  *
// **
//***
// **
//  *

//        // Get the user input for n
//        System.out.print("Enter an odd number for n: ");
//        int n = read.nextInt();
//
//        // Check if the input is valid
//        if (n < 1 || n % 2 == 0) {
//            System.out.println("Please enter a positive odd number.");
//            return;
//        }
//
//
//        for (int i = 0; i < n; i++) {
//            // Calculate the number of spaces and stars for each line
//            int numSpaces;
//            int numStars;
//
//            if (i <= n / 2) {
//                numSpaces = n / 2 - i;    // Spaces before stars
//                numStars = 2 * i + 1;    // Stars to print
//            } else {
//                numSpaces = i - n / 2;    // Spaces before stars
//                numStars = 2 * (n - i - 1) + 1; // Stars to print
//            }
//
//            // Print spaces
//            for (int j = 0; j < numSpaces; j++) {
//                System.out.print(" ");
//            }
//
//            // Print stars
//            for (int j = 0; j < numStars/2 + 1; j++) {
//                System.out.print("*");
//            }
//
//            // Move to the next line
//            System.out.println();
//        }

        int n=read.nextInt();
        int i, j;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (i = 1; i < n; i++)
        {
            for (j = i; j < n; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}

