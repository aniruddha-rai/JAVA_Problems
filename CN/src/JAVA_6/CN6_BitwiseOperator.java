package JAVA_6;

public class CN6_BitwiseOperator {
    public static void main(String[] args) {

        System.out.println(2 & 3);  // Bitwise AND
        System.out.println(2 | 3);  // Bitwise OR
        System.out.println(2 ^ 3);  // Bitwise XOR
        System.out.println(~2);     // Bitwise NOT

        int a = 42;
        int b = ~a; //(there is tilde sign before a)
        System.out.print(a + " " + b);
    }
}
