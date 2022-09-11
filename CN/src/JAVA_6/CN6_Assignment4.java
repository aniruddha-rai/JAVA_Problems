package JAVA_6;

import java.util.Scanner;

public class CN6_Assignment4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int[] arr = new int[num];
        int count = 0;
        for (int i=0;i<num;i++){
           arr[i] = read.nextInt();
        }
        for (int i=0;i<num;i++){
            if (arr[i+1] == (arr[i]+1)){
                System.out.println(arr[i+1]);
                System.out.println(arr[i]+1);
                count++;
            }
        }

        if (count > 0){
            System.out.println("TRUE");
        }

    }
}
