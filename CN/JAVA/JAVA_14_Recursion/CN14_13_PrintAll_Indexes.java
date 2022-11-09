package JAVA_14_Recursion;

public class CN14_13_PrintAll_Indexes {

    // Without Recursion
    public static void allIndex(int[] arr, int num){
        int ans = 0;
        int arr2[] = new int[arr.length];
        for (int i=0, j=0;i<arr.length;i++){
            if (arr[i] == num){
////                ans = i;
//                System.out.println(i);
                arr2[j] = i;
                j++;
            }
        }
        for (int j:arr2){
            System.out.println(j);
        }
    }

    // With Recursion
    public static int allIndex(int[] arr, int num, int i, boolean flag, int ans){
        if (i > arr.length-1 && !flag){
            return -1;
        }else if(i > arr.length-1 && flag){
            return ans;
        }
        if (arr[i] == num){
            flag = true;
            ans = i;
            System.out.println(i);
        }
        i++;
        return allIndex(arr, num, i, flag, ans);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,10,8,8};
        int num = 8;
//        allIndex(arr, num);
        System.out.println(allIndex(arr, num, 0, true, -1));
    }
}