package JAVA_1_to_5;

import java.util.Scanner;

public class CN4_Pattern_Problems {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

//        SQUARE PATTERNS ---------------------------------------------------------------------->

        // Square Pattern of * N Times

//        int i = 0;
//        while (i < n) {
//            int j = 0;
//            while (j < n) {
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Square Pattern of N numbers

//        int i = 0;
//        while (i < n) {
//            int j = 0;
//            while (j < n) {
//                System.out.print(n);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        1111
        //        2222
        //        3333
        //        4444

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print(i);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        1234
        //        1234
        //        1234
        //        1234

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        4321
        //        4321
        //        4321
        //        4321

//        int i = 1;
//        while (i <= n) {
//            int j = n;
//            while (j >= 1) {
//                System.out.print(j);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

//        OR

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print(n - j + 1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        TRIANGULAR PATTERNS ---------------------------------------------------------------------->

        //        1
        //        22
        //        333
        //        4444

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(i);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        1
        //        12
        //        123
        //        1234

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        1
        //        23
        //        345
        //        4567

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            int start = i;
//            while (j <= i) {
//                System.out.print(start);
//                start++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        1
        //        23
        //        456
        //        78910

//        int i = 1;
//        int start = i;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(start);
//                start++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        *
        //        **
        //        ***
        //        ****

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        4
        //        43
        //        432
        //        4321

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(n - j + 1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        1234
        //        123
        //        12
        //        1

//        int i = 1;
//        while (i <= n) {
//            int j = n;
//            while (j >= i) {
//                System.out.print(n - j + 1);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

        //        1
        //        21
        //        321
        //        4321

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            int t = i;
//            while (j <= i) {
//                System.out.print(t);
//                t--;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        SQUARE CHARACTER PATTERNS ---------------------------------------------------------------------->

        //        ABCD
        //        ABCD
        //        ABCD
        //        ABCD

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print((char)('A' + j - 1));
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        OR

//        int i = 0;
//        while (i < n) {
//            int j = 0;
//            while (j < n) {
//                System.out.print((char)('A' + j));
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        AAAA
        //        BBBB
        //        CCCC
        //        DDDD

//        int i = 0;
//        while (i < n) {
//            int j = 0;
//            while (j < n) {
//                System.out.print((char)('A' + i));
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        ABCDE
        //        BCDEF
        //        CDEFG
        //        DEFGH
        //        EFGHI

//        int i = 0;
//        while (i < n) {
//            int j = 0;
//            while (j < n) {
//                System.out.print((char)('A' + i + j));
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        OR

//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            char StartingChar = (char)('A' + i - 1);
//            while (j<=n){
//                System.out.print(StartingChar);
//                StartingChar++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        TRIANGULAR CHARACTER PATTERNS ---------------------------------------------------------------------->

        //        A
        //        BB
        //        CCC
        //        DDDD
        //        EEEEE
        //        FFFFFF
        //        GGGGGGG

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print((char)('A' + i - 1));
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        A
        //        AB
        //        ABC
        //        ABCD

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print((char)('A' + j - 1));
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        A
        //        BC
        //        CDE
        //        DEFG

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            int t = i;
//            while (j <= i) {
//                System.out.print((char)('A' + t - 1));
//                t++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        E
        //        ED
        //        EDC
        //        EDCB
        //        EDCBA

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print((char)('A' + n - j));
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        E
        //        DE
        //        CDE
        //        BCDE
        //        ABCDE

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            int t = n-i;
//            while (j <= i) {
//                System.out.print((char)('A' + t));
//                t++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        REVERSE TRIANGULAR PATTERNS ---------------------------------------------------------------------->

        //           *
        //          **
        //         ***
        //        ****

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n-i) {
//                System.out.print(" ");
//                j++;
//            }
//            j = 1;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        ****
        //        ***
        //        **
        //        *

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n - i + 1) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //        ****
        //        ***_
        //        **__
        //        *___

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n - i + 1) {
//                System.out.print("*");
//                j++;
//            }
//            j = 1;
//            while (j < i) {
//                System.out.print("_");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // INVERTED NUMBER PATTERNS ----------------------->

        //        4444
        //        333
        //        22
        //        1

//        int i = 1;
//        while (i <= n) {
//            int j = n - i + 1;
//            while (j > 0) {
//                System.out.print(n - i + 1);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

        //        4321
        //        321
        //        21
        //        1

//        int i = 1;
//        while (i <= n) {
//            int j = n - i + 1;
//            while (j > 0) {
//                System.out.print(j);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

        // ISOSCELES TRIANGLE ----------------------->

        //           1
        //          121
        //         12321
        //        1234321

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n - i) {
//                System.out.print(" ");
//                j++;
//            }
//            j = 1;
//            while (j <= i) {
//                System.out.print(j);
//                j++;
//            }
//            j = 1;
//            while (j <= i - 1) {
//                System.out.print(i - j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        OR

//        int i = 1;
//        while (i<=n) {
//            int spaces = 1;
//            while (spaces <= n-i){
//                System.out.print(" ");
//                spaces++;
//            }
//            int j = 1;
//            while (j <= i){
//                System.out.print(j);
//                j++;
//            }
//            int k = i-1;
//            j = 1;
//            while (j <= i-1){
//                System.out.print(k);
//                k--;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //           *
        //          ***
        //         *****
        //        *******

//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n - i) {
//                System.out.print(" ");
//                j++;
//            }
//            j = 1;
//            while (j <= i) {
//                System.out.print("*");
//                j++;
//            }
//            j = 1;
//            while (j <= i - 1) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        int i = 1;
        while (i <= n/2 + 1) {
            int j = 1;
            while (j <= n - i) {
                System.out.print("_");
                j++;
            }
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            j = 1;
            while (j <= i - 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
        int k = 1;
        int median = n/2;
        while (k <= median) {
            int l = 1;
            while (l <= (median + 1) - k) {
                System.out.print("_");
                l++;
            }
            l = 1;
            while (l <= k) {
                System.out.print("*");
                l++;
            }

            System.out.println();
            k++;
        }

    }
}
