import java.util.Scanner;

// EVEN OR ODD NUMBER

public class CN1_IfElse {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

//        if (n%2 == 0){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        if (n%2 == 0){
            System.out.println("Even");
            return;
        }
        System.out.println("Odd");
    }
}
