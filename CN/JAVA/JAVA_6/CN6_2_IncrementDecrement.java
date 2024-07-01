// Increment & Decrement

package JAVA_6;

public class CN6_2_IncrementDecrement {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);
        a++;    // Post Increment
        ++a;    // Pre Increment
        System.out.println("a --> "+a);
        System.out.println("b --> "+b);

        System.out.println("<------------->");

        int a1 = a++;
        System.out.println(a1);
        System.out.println(a);

        int b1 = ++b;
        System.out.println(b1);
        System.out.println(b);

        System.out.println("<-------------||-------------->");

        int x = 10;
        int y = 20;
        if(x++ > 10 || ++y > 20 ){
            System.out.print("Inside if  ");
        }else{
            System.out.print("Inside else  ");
        }
        System.out.println(x  + " " + y);


        a = 4;
        a *= 2;
        System.out.println(a);

        a ^= 2;
        System.out.println(a);

        int ans = 2 * 3 / 2;
        System.out.println(ans);

        int ans2 = 2 + 3 * 4;
        System.out.println(ans2);
    }
}
