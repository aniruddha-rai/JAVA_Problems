package JAVA_12_OOPS1;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction (int numerator, int denominator){
        this.numerator = numerator;
        if (denominator == 0){
        // TODO Error out
        }
        this.denominator = denominator;
        simplify();     // It simplifies the fraction that both numerator and denominator cannot be further divided by any same number
    }

    private void simplify(){
        // We need to find the largest value that divides a and b
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i=1;i<=smaller;i++){
            if (numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        numerator /= gcd;
        denominator /= gcd;
    }

    // GETTER
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    // SETTER
    public void setNumerator(int n){
        this.numerator = n;
        simplify();
    }

//    public void setDenominator(int d){
//        if (d == 0){
//            // TODO Error out
//            return;
//        }
//        this.denominator = d;
//        simplify();
//    }

    // Common Exception
//    public void setDenominator(int d) throws Exception{
//        if (d == 0){
//            // TODO Error out
//            Exception e = new Exception("Denominator can't be 0");
//            throw e;
//            // return;
//        }
//        this.denominator = d;
//        simplify();
//    }

    public void setDenominator(int d) throws ZeroDenominatorException{
        if (d == 0){
            // TODO Error out
            ZeroDenominatorException e = new ZeroDenominatorException();
            throw e;
            // return;
        }
        this.denominator = d;
        simplify();
    }

    public void print(){
        if (denominator == 1){
            System.out.println(numerator);
        }else {
            System.out.println(numerator+"/"+denominator);
        }
    }

    public void add(Fraction f2){
        this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
        this.denominator = this.denominator*f2.denominator;
        simplify();
    }

    public void mulitply(Fraction f2){
        this.numerator = this.numerator*f2.numerator;
        this.denominator = this.denominator*f2.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1, Fraction f2){
        int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int newDen = f1.denominator*f2.denominator;
        Fraction f3 = new Fraction(newNum, newDen);
        return f3;
    }


}
