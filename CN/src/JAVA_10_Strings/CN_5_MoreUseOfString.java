package JAVA_10_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CN_5_MoreUseOfString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

//        String str = "abc";
//        str = str + "def";           // same
//        System.out.println(str);
//        str = str.concat("ghi"); // same
//        System.out.println(str);
//        System.out.println(str.concat("jkl"));
//        System.out.println(str);


//        int[] arr1 = {1,2,3};
//        int[] arr2 = {1,2,3};
//        if (arr1 == arr2) System.out.println("Equal");  // Here both have different address for the array elements
//        else System.out.println("Unequal");
//        System.out.println(arr1 + " " + arr2);
//
//        int[] arr3 = {1,2,3};
//        int[] arr4 = arr3;
//        if (arr3 == arr4) System.out.println("Equal");  // Here both refers to the same address
//        else System.out.println("Unequal");
//        System.out.println(arr3 + " " + arr4);

        // == is used to compare the addresses
        // str1.equals(str2)/Arrays.equals(arr5, arr6) is used to compare the content

//        int[] arr5 = {1,2,3};
//        int[] arr6 = {1,2,3};
//        if (Arrays.equals(arr5, arr6)) System.out.println("Equal");  // Here we are comparing content using .equals() function
//        else System.out.println("Unequal");
//        System.out.println(arr5 + " " + arr6);  // still both have different addresses

        String str1 = "abc";
        String str2 = "abc";
        if (str1 == str2) System.out.println("Equal");  // Here both is referring to the same array address because both have same elements,
        else System.out.println("Unequal");             // String Pool concept is used
        System.out.println(str1 + " " + str2);
        if (str1.equals(str2)) System.out.println("Equal");  // Here we are comparing the content but we it is of no use because,
        else System.out.println("Unequal");                 // string refers to same address when content is same
        System.out.println(str1 + " " + str2);
    }
}
