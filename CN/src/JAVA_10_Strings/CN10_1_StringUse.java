package JAVA_10_Strings;

public class CN10_1_StringUse {
    public static void main(String[] args) {
        char c = 'c';
        String str = "Aniruddha";
        System.out.println(str.charAt(1));
        // System.out.println(str[0]);  ---> Incorrect way of accessing string
        System.out.println(str.length());
        System.out.println(str.substring(0,3)); // ---> Doesn't include end index
        System.out.println(str.substring(3)); // Print from 3 to end
        System.out.println(str.substring(0));  // Same
        System.out.println(str);                        // Same
        String temp = str.substring(str.length());
        // String temp2 = str.substring(str.length()+1); ---> Out of bound error
        System.out.println(temp); // ---> returns empty array
        System.out.println(temp.length());
        // System.out.println(str.charAt(9)); ---> Out of bound error
        System.out.println(str.substring(1,1)); // --->  start and end index are same so empty string

        System.out.println(str.contains("nir"));
        System.out.println(str.contains("ani"));

        System.out.println(str.concat(" Rai"));
        System.out.println(str);
    }
}
