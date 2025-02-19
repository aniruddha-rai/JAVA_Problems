package Patterns;

import java.util.Scanner;

public class P3_Function {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        // 492A ---> A. Vanya and Cubes
        int num = read.nextInt();
        int cubesPerRow = 0, totalNumOfCubes = 0, output = 0;
        for (int i = 1; i <= num; i++) {
            cubesPerRow += i;
//            System.out.print("Row - " + i + " || Cubes : " + cubesPerRow);
            totalNumOfCubes += cubesPerRow;
//            System.out.println(" --- Total Cubes : " + totalNumOfCubes);
            if (totalNumOfCubes == num) {
                output = i;
                break;
            } else if (num < totalNumOfCubes) {
                output = i - 1;
                break;
            }
        }
        System.out.println(output);


        // 1520A ---> A. Do Not Be Distracted!
        int numOfDays = read.nextInt();
        String output2 = "";
        String task = read.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numOfDays; i++) {
            result.append(String.valueOf(task.charAt(i)));
            for (int j = 0; j < result.length(); j++) {
                if (task.charAt(i) == result.charAt(j)) {
                    output2 = "NO";
                } else
                    output2 = "YES";
            }
        }
        System.out.println(output2);
    }

}
