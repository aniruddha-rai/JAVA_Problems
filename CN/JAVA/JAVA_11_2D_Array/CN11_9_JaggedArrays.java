package JAVA_11_2D_Array;

public class CN11_9_JaggedArrays {
    public static void main(String[] args) {

//        int[][] arr1 = new int[3][5];
//        System.out.println(arr1[0]);
//        System.out.println(arr1[0][0]);
//
//        int[][] arr2 = new int[4][];
//        System.out.println(arr2);
////        System.out.println(arr2[0]);
////        System.out.println(arr2[0][0]);
////        for (int i=0;i< arr2.length;i++){
////            System.out.println(arr2[i]);
////        }
//
//        for (int i=0;i< arr2.length;i++){
//            arr2[i] = new int[2];
//            System.out.println(arr2[i]);
//        }
//        System.out.println(arr2[0][0]);

//        JAGGED ARRAY ----------------------> Each row has different column

        // Initializing array with 5 rows
        int[][] arr3 = new int[5][];
        for (int i=0;i< arr3.length;i++){
            // Initializing each row with 1 column
            arr3[i] = new int[i+1];
        }

        // Printing Jagged Array
        for (int i=0;i< arr3.length;i++){
            for (int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
