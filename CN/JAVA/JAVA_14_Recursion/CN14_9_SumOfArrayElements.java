package JAVA_14_Recursion;

public class CN14_9_SumOfArrayElements {

    public static int sum(int[] arr, int n){
        if (n <= 0){
            return 0;
        }
//        int[] smallArr = new int[arr.length - 1];
//        for (int i=1;i<arr.length;i++){
//            smallArr[i-1] = arr[i];
//        }
        return sum(arr, n-1) + arr[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(sum(arr, arr.length));
    }
}
