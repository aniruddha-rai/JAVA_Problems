package JAVA_1_to_5;

import java.util.Scanner;

public class CN3_Assignment {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Power of a number

        int base = read.nextInt();
        int power = read.nextInt();
        int i=0;
        int ans = 1;
        while (i<power){
            ans = ans*base;
            i++;
        }
        System.out.println(ans);


        // Sum of even and odd numbers

//        long num = read.nextLong();
//        long even = 0;
//        long odd = 0;
//        while (num > 0){
//            long n1 = num%10;
//            if (n1%2 == 0){
//                even += n1;
//            }
//            else {
//                odd += n1;
//            }
//            num /= 10;
//        }
//        System.out.println(even + " " + odd);



        // Total Salary

//        float salary = read.nextInt();
//        String grade = read.next().toUpperCase();
//        float hra = salary / 5;
//        float da = salary / 2;
//        float pf = (salary*11)/100;
//        int allow = 0;
//        System.out.println(hra);
//        System.out.println(da);
//        System.out.println(pf);
//
//        if (grade.charAt(0) == 'A'){
//            allow += 1700;
//        } else if (grade.charAt(0) == 'B'){
//            allow += 1500;
//        } else if (grade.charAt(0) == 'C'){
//            allow += 1300;
//        }
//
//        float totalSalary = (salary + hra + da + allow - pf);
//
//        System.out.println(Math.round(totalSalary));

//        Scanner read = new Scanner(System.in);
//        float salary = read.nextFloat();
//        String grade = read.next().toUpperCase();
//        float hra = (float) (salary * 0.2);
//        float da = (float) (salary * 0.5);
//        float pf = (float) (salary * 0.11);
//        int allow = 0;
//        if (grade.charAt(0) == 'A') {
//            allow = 1700;
//        } else if (grade.charAt(0) == 'B') {
//            allow = 1500;
//        } else {
//            allow = 1300;
//        }
//
//        float totalSalary = salary + hra + da + allow - pf;
//        System.out.println(Math.round(totalSalary));
    }
}
