package JAVA_8_Arrays;

public class CN8_7_Other {

    private static void change(int[] arr) {
        arr = new int[5];
        arr[0] = 15;
    }

    public static void main(String[] args) {
        int[] arr2 = new int[5];     // Correct Statement
        arr2 = new int[6];

        int[] arr = new int[5];
        change(arr);
        System.out.println(arr[0]);
    }
}
