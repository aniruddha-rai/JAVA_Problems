package JAVA_12_OOPS1;

import java.io.File;
import java.io.FileNotFoundException;

public class FractionUse {
    // Either we throw exception or handle it
//    public static void temp() throws ZeroDenominatorException{
    public static void temp(){
        Fraction f1 = new Fraction(20,30);
        f1.print();

        f1.setNumerator(12);
        int d = f1.getDenominator();
        System.out.println(d);
        f1.print();

        f1.setNumerator(10);

        // Handling Exception
        int i = 67;
        try {
            f1.setDenominator(0);
            i++;        // Runs only in case of no exception
        } catch (ZeroDenominatorException e){
            System.out.println("Hey don't input 0 as Denominator!");    // Runs only in case of exception
        } finally {     // Runs everytime either exception occurs or not (Common code of try and catch will execute in finally)

        }
        System.out.println(i); // when we trigger exception then next line will not be executed

//        f1.setDenominator(0);

        f1.print();

        Fraction f2 = new Fraction(3,4);
        f1.add(f2);     // f2 will add in f1 so that f1's value will be changed and f1 will remains the same
        f1.print();
        f2.print();

        Fraction f3 = new Fraction(4,5);
        f3.mulitply(f2);
        f3.print();
        f2.print();

        Fraction f4 = Fraction.add(f1, f3);
        f1.print();
        f3.print();
        f4.print();

    }

    public static void main(String[] args) throws ZeroDenominatorException{
        temp();

//        String s = "";
//        File f;
//        try {
//            f = new File(s);
//            // f.close();
//        } catch (FileNotFoundException){
//            // f.close();
//        } finally {
//            f.close();
//        }

    }
}
