package JAVA_14_Recursion;

public class CN14_6_FibonacciNumber {

    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}
