/*
    RECURSION is a function calling itself.
    RECURSION in computer science is a method where the solution to a problem depends on solutions to smaller instances of the same problem.

    n! = n * (n-1)!

    BASE CASE ---> Where we want a problem recursion to stop.
    eg: in case of factorial base case would be fact(0) otherwise it will go into infinite loop.
 */

package JAVA_14_Recursion;

public class CN14_1_Factorial {

    public static int fact(int n){

        // Each function call will be completely different and will take a 4 byte seperately and after returning the value then only it will destroy
        // Base case ---> to stop loop from executing infinite times
        if (n == 0){
            return 1;
        }

        int smallFact = fact(n-1);
        return n*smallFact;
    }

    public static void main(String[] args) {
        int n = 3;
        int ans = fact(n);
        System.out.println(ans);
    }
}
