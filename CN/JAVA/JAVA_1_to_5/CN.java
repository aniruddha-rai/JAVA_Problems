package JAVA_1_to_5;

import java.util.Scanner;

public class CN {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int d3 = 'a' + 4;
        System.out.println(d3);

        char c = 'a';
//        System.out.println(c + 3); // 100

        int i = c + 10;
//        System.out.println(i);  // 107

        i = c;
        // char ab = i;      ---> Cannot assign a more space data (4 bytes) into less space memory (2 bytes)
        long l = i;
        // i = l;
        System.out.println(l);
        System.out.println(i);

        l = 1232524623112123L;
        i = (int) l;
        System.out.println(i);

        double d = i;
        // i = d;

        float f = (float) 1.23;
        float f2 = 1.23f;
        // f = d;
        d = f;

        int j = 100;


//        int var1 = 5;
//        int var2 = 6;
//        if ((var2 = 1) == var1)
//            System.out.print(var2);
//        else
//            System.out.print(var2 + 1);

//        int x = 15;
//        if(x <= 15){
//            System.out.print("Inside if  ");
//        }else if(x == 15){
//            System.out.print("Inside else if  ");
//        }
//        System.out.println(x);

//        String str;
//        str = read.next();
//        System.out.print(str);

//        int f = read.nextInt();
////        int c = (5/9)*(f-32);
////        int c1 = (5*(f-32))/9;
////        System.out.println(c1);
//        int c2 = (int) ((5.0/9)*(f-32));
//        System.out.println(c2);

//        System.out.println(9/5);
//        System.out.println(9.0/5);
//        System.out.println(9%5);
//
//        byte b = 50;
//        b = (byte) (b * 50);
//        System.out.println(b);

//        double a = 6 / 4;
//        int b  = 6 / 4;
//        double c = a + b;
//        System.out.println(c);

//        int var1 = 5;
//        int var2 = 6;
//        System.out.print(var1 > var2);
    }
}
