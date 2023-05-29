// 116A Tram

import java.util.Scanner;

public class A_116A_Tram {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numOfStops = read.nextInt();
        int exit, enter, max = 0, count = 0;
        for (int i=0;i<numOfStops;i++){
            exit = read.nextInt();
            enter = read.nextInt();
            count = count - exit + enter;
            if (count > max){
                max = count;
            }
        }
        System.out.println(max);
    }
}
