//734A Anton and Danik

import java.util.Scanner;

public class A_734A_Anton_Danik {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int numOfGames = read.nextInt();
        int countA = 0, countB = 0;
        String result = read.next().toUpperCase().substring(0, numOfGames);
        for (char x: result.toCharArray()){
            if (x=='A'){
                countA++;
            }else {
                countB++;
            }
        }
        if (countA > countB){
            System.out.println("Anton");
        } else if (countA < countB) {
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }
    }
}