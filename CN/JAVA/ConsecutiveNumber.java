import java.util.Scanner;

public class ConsecutiveNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int[] arr = new int[num];
        for (int j=0;j<num;j++){
            arr[j] = read.nextInt();
        }

        // LOGIC for all consecutive numbers
        // int[] arr = {1,2,1,1,3,3,3,3,1,1,1,4,6};
        int count = 0;
        int max = 0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i] == arr[i+1]){
                count++;
                if (count > max){
                    max = count;
                }
            }else {
                count = 0;
            }
        }
        System.out.println(max+1);

//        // LOGIC for finding 1's consecutive
//        int count = 0;
//        int max = 0;
//        for (int j : arr) {
//            if (j == 1) {
//                count++;
//            }
//            if (count > max) max = count;
//        }
//        System.out.println(max);

    }
}
