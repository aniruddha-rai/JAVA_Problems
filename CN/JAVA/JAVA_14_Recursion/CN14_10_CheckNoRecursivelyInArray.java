package JAVA_14_Recursion;

public class CN14_10_CheckNoRecursivelyInArray {

    public static boolean check(int[] arr, int n){
        if (n <= 0){
            return false;
        }
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] == n){
//                return true;
//            }
//        }
        check(arr, n-1);
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10};
        int n = 1;
        System.out.println(check(arr, n));
    }
}
