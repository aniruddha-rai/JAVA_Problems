package JAVA_14_Recursion;

public class CN14_7_PrintDecreasingNumber {
    public static int print(int n){
        if (n == 0){
//            System.out.print(n + " ");
            return n;
        }
        System.out.print(n + " ");
        return print(n-1);
    }

    public static void main(String[] args) {
        int num = 7;
        print(num);
    }
}
