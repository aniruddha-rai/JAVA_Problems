package JAVA_6;

public class CN6_1_BitwiseOperator {
    public static void main(String[] args) {

        System.out.println(2 & 3);  // Bitwise AND
        System.out.println(2 | 3);  // Bitwise OR
        System.out.println(2 ^ 3);  // Bitwise XOR
        System.out.println(~2);     // Bitwise NOT

        System.out.println(34 << 1);    // Left Shift on Positive no
        System.out.println(34 >> 2);    // Right Shift on Positive no
        System.out.println(-4 << 1);    // Left Shift on Negative no
        System.out.println(-4 >> 1);    // Right Shift on Negative no

        int a = 42;
        int b = ~a; //(there is tilde sign before a)
        System.out.print(a + " " + b);
    }
}
