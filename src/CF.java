import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CF {
    public static void main(String[] args) {
//        Scanner read = new Scanner(System.in);
//        int count0 = 0, count1 = 0;
//        String str = read.next();
//        for (int i=0;i<str.length();i++){
//            if (str.charAt(i) == '0') {
//                count0++;
//                count1 = 0;
//            }
//            else {
//                count1++;
//                count0 = 0;
//            }
//            if (count0 == 7 || count1 == 7){
//                break;
//            }
////            System.out.println("Count0 " + count0);
////            System.out.println("Count1 " + count1);
//        }
//
//        if (count0 == 7 || count1 == 7){
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }


//        Scanner read = new Scanner(System.in);
//        String str = read.next();
//        int upper = 0;
//        int lower = 0;
//
//        for (int i=0;i<str.length();i++){
//            if (Character.isUpperCase(str.charAt(i))) upper++;
//            else if (Character.isLowerCase(str.charAt(i))) lower++;
//        }
////        System.out.println(upper);
////        System.out.println(lower);
//
//        if (upper <= lower){
//            str = str.toLowerCase();
//        }
//        else {
//            str = str.toUpperCase();
//        }
//
//        System.out.println(str);


//        Scanner read = new Scanner(System.in);
//        long n = read.nextLong();
//        int k = read.nextInt();
//
//        for (int i=0;i<k;i++){
//            if (n%10 == 0){
//                n = n/10;
//            }
//            else {
//                n = n - 1;
//            }
//        }
//        System.out.println(n);



//        Scanner read = new Scanner(System.in);
//        long n = read.nextLong();
//        int count = 0;
//        while(n>0){
//            n =n/10;
//            System.out.println(n);
//            if (n == 4 || n == 7){
//                count++;
//            }
//        }
//        System.out.println("count -> "+count);
//        if (count == 4 || count == 7){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int n1 = n;
//        int n2 = 1,n3=0;
//        int count= 0;
////        System.out.println(n1);
//        while(n1>0){
//            count++;
//            n1 = n1/10;
//        }
//        for (int i=0;i<count-1;i++){
//            n2 = n2*10;
//        }
//        System.out.println(n2);
////        System.out.println(count);
//        for (int i=1;i<=count;i++){
//            n = n/n2;
//            n3 = n%n2;
//            System.out.println(n);
//        }


//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        int count = 0;
//        while(n>0){
//            if (n%10 == 4 || n%10 == 7){
//                count++;
//            }
//            n /= 10;
//        }
//        if (count == 4 | count == 7){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }

////      677A - Vanya and Fence
//        Scanner read = new Scanner(System.in);
//        int numOfPerson = read.nextInt();
//        int heightOfFence = read.nextInt();
//        int minWidthOfRoad = 0;
//        int[] arr = new int[numOfPerson];
//        for (int i=0;i<numOfPerson;i++){
//            arr[i] = read.nextInt();
//        }
//        for (int i=0;i<numOfPerson;i++){
//            if (arr[i] > heightOfFence) {
//                minWidthOfRoad += 2;
//            } else {
//                minWidthOfRoad++;
//            }
//        }
//        System.out.println(minWid thOfRoad);


//      1030A - In Search of an Easy Problem
//        Scanner read = new Scanner(System.in);
//        int numOfPerson = read.nextInt();
//        boolean hardProblem = false;
//        int[] think = new int[numOfPerson];
//        for (int i=0;i<numOfPerson;i++) {
//            think[i] = read.nextInt();
//        }
//        for (int i=0;i<numOfPerson;i++) {
//            if (think[i] == 1) {
//                hardProblem = true;
//            }
//        }
//        if (hardProblem) {
//            System.out.println("HARD");
//        } else {
//            System.out.println("EASY");
//        }


////        271A - Beautiful Year
//        Scanner read = new Scanner(System.in);
//        String year = read.nextLine();
//
//        for (int i=1000;i<=9000;i++) {
//            year = String.valueOf(Integer.parseInt(year) + 1);
//            if (year.charAt(0)!=year.charAt(1) && year.charAt(0)!=year.charAt(2) && year.charAt(0)!=year.charAt(3) &&
//                    year.charAt(1)!=year.charAt(2) && year.charAt(1)!=year.charAt(3) && year.charAt(2)!=year.charAt(3)) {
//                break;
//            }
//        }
//        System.out.println(year);

////        492A - Vanya and Cubes
//        Scanner read = new Scanner(System.in);
//        int num = read.nextInt();
//        int numOfCubes = 0;
//        int totalNumOfCubes = 0;
//        int height = 0;
//
//        for (int i=1;i<=num;i++) {
//            numOfCubes += i;
////            System.out.println("Num Of Cubes - " + numOfCubes);
//            totalNumOfCubes += numOfCubes;
////            System.out.println("Total Cubes - " + totalNumOfCubes);
//            height = i;
////            System.out.println("Height - " + height);
//            if (totalNumOfCubes > num) {
//                height -= 1;
//                break;
//            }
//        }
//
//        System.out.println(height);

        // --------------- OR ------------------>

//        Scanner read = new Scanner(System.in);
//        int num = read.nextInt();
//        int numOfCubes = 0;
//        int totalNumOfCubes = 0;
//        int height = 0;
//
//        for (int i=1;i<=num;i++) {
//            numOfCubes += i;
////            System.out.println("Num Of Cubes - " + numOfCubes);
//            totalNumOfCubes += numOfCubes;
////            System.out.println("Total Cubes - " + totalNumOfCubes);
//            height = i;
////            System.out.println("Height - " + height);
//            if (totalNumOfCubes > num) {
//                height -= 1;
//                break;
//            }
//        }
//
//        System.out.println(height);


//////      266B - Queue at the School
////        Scanner read = new Scanner(System.in);
////        int numOfStudent = read.nextInt();
////        int time = read.nextInt();
////        String arrangement = read.next();
////        for (int i=0;i<arrangement.length()-1;i++) {
////            char temp = 'a';
////            if (arrangement.charAt(i) == 'B' && arrangement.charAt(i+1) == 'G') {
////                arrangement.replace('B', 'G');
////                i++;
////            }
////        }
////        System.out.println(arrangement);
//
//        Scanner read = new Scanner(System.in);
//        int numOfChildren = read.nextInt();
//        int time = read.nextInt();
//        String arrangement = read.next();
//        char[] charArray = new char[numOfChildren];
//
//        for (int i =0;i<numOfChildren;i++) {
//            charArray[i] = arrangement.charAt(i);
//        }
//
//        for (int i=0;i<numOfChildren;i++) {
//            if (i+time < numOfChildren) {
//                if (arrangement.charAt(i) == 'B' && arrangement.charAt(i + 1) == 'G') {
//                    charArray[i] = 'G';
//                    charArray[i + 1] = 'B';
//                }
//            }
//        }
//        for (int i =0;i<numOfChildren;i++) {
//            System.out.print(charArray[i]);
//        }


//        122A - Lucky Division
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        boolean flag = false;
        String luckyNum = String.valueOf(num);
        if (num % 4 == 0 || num % 7 == 0)
            flag = true;
        else if (luckyNum.length() == 1 && (luckyNum.contains("4") || luckyNum.contains("7")))
            flag = true;
        else if (luckyNum.length() > 1) {
            for (int i=0;i<luckyNum.length();i++) {
                if (luckyNum.charAt(i) == '4' || luckyNum.charAt(i) == '7') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        else
            flag = false;

        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");


        // <<<<<<<<<<< --- OR --- >>>>>>>>>>>
            Scanner reader = new Scanner(System.in);
            int num2 = reader.nextInt();
            String res = "NO";
            int[] arr = {4,7,44,47,74,77,444,447,477,777,774,744};
            for(int i=0; i<arr.length; i++){
                if(num2%arr[i]==0)
                    res = "YES";
            }
            System.out.println(res);

    }
}
