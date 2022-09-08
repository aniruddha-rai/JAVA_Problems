import java.util.Scanner;

public class CN4_Patterns {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

//        SQUARE PATTERNS ---------------------------------------------------------------------->

//        ****
//        ****
//        ****
//        ****
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=n) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        7777777
//        7777777
//        7777777
//        7777777
//        7777777
//        7777777
//        7777777
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=n) {
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
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=n) {
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
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=n) {
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
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = n;
//            while (j>=1) {
//                System.out.print(j);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

//        OR

//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=n) {
//                System.out.print(n-j+1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }



//        12345
//        23456
//        34567
//        45678
//        56789
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = n;
//            int val = i;
//            while (j>=1) {
//                System.out.print(val);
//                val++;
//                j--;
//            }
//            System.out.println();
//            i++;
//        }





//        TRIANGULAR PATTERNS --------------------------------------------------------------------->


//        1
//        12
//        123
//        1234
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=i) {
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        1
//        23
//        456
//        78910
//        int n = read.nextInt();
//        int i = 1;
//        int val = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=i) {
//                System.out.print(val);
//                val++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        1
//        23
//        345
//        4567
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            int val = i;
//            while (j<=i) {
//                System.out.print(val);
//                val++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        *
//        **
//        ***
//        ****
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        1
//        22
//        333
//        4444
//        55555
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=i) {
//                int val = i;
//                System.out.print(val);
//                val++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        1
//        21
//        321
//        4321
//        54321
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            int val = i;
//            while (j<=i) {
//                System.out.print(val);
//                val--;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }



//        CHARACTER PATTERNS --------------------------------------------------------------------->



//        ABCDE
//        ABCDE
//        ABCDE
//        ABCDE
//        ABCDE
//        int n = read.nextInt();
////        char ch = 'A';
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            while (j<=n){
//                System.out.print((char)('A' + j - 1));
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        AAAAA
//        BBBBB
//        CCCCC
//        DDDDD
//        EEEEE
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            while (j<=n){
//                System.out.print((char)('A' + i - 1));
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
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            char ch = (char)('A' + i - 1);
//            while (j<=n){
//                System.out.print(ch);
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }



//        A
//        BB
//        CCC
//        DDDD
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            while (j<=i){
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
//        ABCDE
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            while (j<=i){
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
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            char ch = (char)('A' + i - 1);
//            while (j<=i){
//                System.out.print(ch);
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        D
//        DE
//        DEF
//        DEFG
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            char ch = (char)('A' + n - 1);
//            while (j<=i){
//                System.out.print(ch);
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        D
//        DC
//        DCB
//        DCBA
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            char ch = (char)('A' + n - 1);
//            while (j<=i){
//                System.out.print(ch);
//                ch--;
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
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            char ch = (char)('A' + n - i);
//            while (j<=i){
//                System.out.print(ch);
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        1
//         12
//          123
//           1234
//            12345
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int j = 1;
//            int space = 1;
//            while (space <= i){
//                System.out.print(" ");
//                space++;
//            }
//            while (j<=i){
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//            *
//           **
//          ***
//         ****
//        *****
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n){
//            int space = 1;
//            while (space <= n-i){
//                System.out.print(" ");
//                space++;
//            }
//            int j = 1;
//            while (j<=i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        *****
//        ****
//        ***
//        **
//        *
//        int n = read.nextInt();5
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=n-i+1) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//            *****
//           ****
//          ***
//         **
//        *
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int space = 1;
//            while (space <= n-i){
//                System.out.print(" ");
//                space++;
//            }
//            int j = 1;
//            while (j<=n-i+1) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        *****
//         ****
//          ***
//           **
//            *
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int space = n;
//            while (space >= n-i+2){
//                System.out.print(" ");
//                space--;
//            }
//            int j = 1;
//            while (j<=n-i+1) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        5
//        44
//        333
//        2222
//        11111
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = 1;
//            while (j<=i) {
//                int val = n-i+1;
//                System.out.print(val);
//                val++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        55555
//        4444
//        333
//        22
//        1
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = n;
//            while (j>=i) {
//                int val = n-i+1;
//                System.out.print(val);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }


//        4567
//        345
//        23
//        1
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = n;
//            int val = n-i+1;
//            while (j>=i) {
//
//                System.out.print(val);
//                val++;
//                j--;
//            }
//            System.out.println();
//            i++;
//        }


//        54321
//        4321
//        321
//        21
//        1
//        int n = read.nextInt();
//        int i = 1;
//        while (i<=n) {
//            int j = n;
//            int val = n-i+1;
//            while (j>=i) {
//
//                System.out.print(val);
//                val--;
//                j--;
//            }
//            System.out.println();
//            i++;
//        }


//            1
//           12
//          123
//         1234
//        int n = read.nextInt();
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
//            System.out.println();
//            i++;
//        }


//           1
//          121
//         12321
//        1234321
//        int n = read.nextInt();
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


//                *
//               ***
//              *****
//             *******
//            *********
//        int n = read.nextInt();
//        int i = 1;
//        while (i <= n){
//            int space = 1;
//            while (space <= n-i){
//                System.out.print(" ");
//                space++;
//            }
//            int j = 1;
//            while (j <= i){
//                System.out.print("*");
//                j++;
//            }
//            int k = 1;
//            while (k <= i-1){
//                System.out.print("*");
//                k++;
//            }
//            System.out.println();;
//            i++;
//        }

        int n = read.nextInt();
        int i = 1;
        while (i<=n){
            int space = 1;
            while (space<=n-i){
                System.out.print("_");
                space++;
            }
            int j = 1;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }


    }
}
