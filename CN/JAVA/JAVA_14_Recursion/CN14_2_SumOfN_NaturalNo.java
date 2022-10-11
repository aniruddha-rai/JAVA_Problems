package JAVA_14_Recursion;

public class CN14_2_SumOfN_NaturalNo {

    public static int sum(int n){
        // Base case
        if (n == 1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        int n = 8;
        int ans = sum(n);
        System.out.println(ans);
    }
}
