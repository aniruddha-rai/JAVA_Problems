package JAVA_14_Recursion;

public class CN14_8_CheckSorted {

    public static boolean checkSorted(int[] arr){
        if (arr.length <= 1){
            return true;
        }

        int[] smallArr = new int[arr.length - 1];
        for (int i=1;i<arr.length;i++){
            smallArr[i-1] = arr[i];
        }

        boolean smallAns = checkSorted(smallArr);
        if (!smallAns){
            return false;
        }
        if (arr[0] <= arr[1]){
            return true;
        }else {
            return false;
        }

    }


    public static boolean checkSorted_2(int[] arr){
        if (arr.length <= 1){
            return true;
        }
        // Checking first and second element so that we don't need to wait till the n-1 elements
        if (arr[0] > arr[1]){
            return false;
        }

        int[] smallArr = new int[arr.length - 1];
        for (int i=1;i<arr.length;i++){
            smallArr[i-1] = arr[i];
        }

        boolean smallAns = checkSorted_2(smallArr);
        return smallAns;
//        if (smallAns){
//            return true;
//        }else {
//            return false;
//        }

    }


    // This function checks if the array is sorted from the startIndex to the endIndex
    public static boolean checkSortedBetter(int input[], int startIndex){
        if (startIndex >= input.length-1){
            return true;
        }

        if (input[startIndex] > input[startIndex+1]){
            return false;
        }

        boolean smallAns = checkSortedBetter(input, startIndex+1);
        return smallAns;

    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,9};
        System.out.println(checkSorted(arr));
        System.out.println(checkSorted_2(arr));
        System.out.println(checkSortedBetter(arr, 0));
    }
}
