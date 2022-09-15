package JAVA_7_Functions;

public class CN7_5_PassByValue_Increment {

    public static void increment(int n){
        n++;
    }

    public static void main(String[] args) {
        int n = 10;
        increment(n);
        System.out.println(n);
    }
}
