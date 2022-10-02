package JAVA_7_Functions;

import java.util.Scanner;

public class CN7_4_Function_Calling_PrimeTwo2N {

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

    public static void printPrime(int n){
        for (int i=2;i<=n;i++){
            // Need to check if i is prime or not
            boolean isIPrime = isPrime(i);
            if (isIPrime){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        printPrime(num);
    }
}
