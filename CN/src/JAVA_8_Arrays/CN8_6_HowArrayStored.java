package JAVA_8_Arrays;

public class CN8_6_HowArrayStored {

    public static void printArr(int[] arrInput){
        for (int j : arrInput) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void increment(int i){
        i++;
    }

    public static void incrementArray(int[] arr){
//        arr = new int[5];     --> This will create a new arr which refer a different address so arr of main will not reflect
        for (int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }

    public static void incrementArray2(int[] arr){
        arr = new int[5];    // --> This will create a new arr which refer a different address so arr of main will not reflect
                             // --> This will have values 1 in all elements
        for (int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }


    public static void main(String[] args) {
        int i = 10;
        increment(i);
        System.out.println(i);

        int[] arr = {1,2,3,4,5};
        incrementArray(arr);
        printArr(arr);

        int[] arr2 = {1,2,3,4,5};
        incrementArray2(arr2);
        printArr(arr2);
    }
}
