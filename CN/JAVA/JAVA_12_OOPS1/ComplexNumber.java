package JAVA_12_OOPS1;

public class ComplexNumber {
    private int real;
    private int imaginary;
    private boolean flag = false;

    public ComplexNumber(int real, int imaginaryArr){
        this.real = real;
        this.imaginary = imaginaryArr;
    }

    public int getReal(){
        return real;
    }

    public int getImaginary(){
        return imaginary;
    }

    public void setReal(int r){
        this.real = r;
    }

    public void setImaginary(int i){
        this.imaginary = i;
    }

    public void print() {
        if (flag == true) {
            // TODO Error out
            System.out.println(real + " - " + imaginary + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }

    public void add(ComplexNumber c2){
        this.real = this.real+c2.real;
        this.imaginary = this.imaginary+c2.imaginary;
    }

    public void multiply(ComplexNumber c2){
        this.real = this.real*c2.real;
        this.imaginary = this.imaginary*c2.imaginary;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        int newReal = c1.real+c2.real;
        int newImaginary = c1.imaginary+c2.imaginary;
        ComplexNumber f3 = new ComplexNumber(newReal, newImaginary);
        return f3;
    }

    public ComplexNumber conjugate(){
        flag = true;
        ComplexNumber c1 = new ComplexNumber(this.real, this.imaginary);
        return c1;
    }

}
