package JAVA_7_Functions;

import java.util.Scanner;

public class CN7_1_NcR {

    public static boolean isPrime(int n){
        int i = 2;
        while (i < n){
            if (n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void printTillN(int n){
        if (n <= 0){
            return;
        }
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    public static int factorial(int n){
        int ans = 1;
        for (int i=1;i<=n;i++){
            ans *= i;
        }
        return ans;
    }

    public static int ncr(int n, int r){
        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial(n-r);
        int ans = num/(den1*den2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int r = read.nextInt();

        int ans = ncr(n, r);
        System.out.println(ans);

        boolean ansPrime = isPrime(13);
        System.out.println(ansPrime);

        printTillN(13);

    }
}
