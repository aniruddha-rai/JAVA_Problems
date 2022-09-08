// LARGEST OF THREE NUMBERS

import java.util.Scanner;

public class CN2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();

//        if (a>=b && a>=c){
//            System.out.println(a);
//        }else {
//            if (b>=a && b>=c){
//                System.out.println(b);
//            }else {
//                System.out.println(c);
//            }
//        }

        if (a>=b && a>=c){
            System.out.println(a);
        }else if (b>=a && b>=c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
