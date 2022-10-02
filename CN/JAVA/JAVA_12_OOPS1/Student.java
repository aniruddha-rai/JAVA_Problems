package JAVA_12_OOPS1;

// Suppose we have a Class 'STUDENT' have some properties 'name' and 'rollNumber' that every student is going to have.

/*
Default --> Within the package
Public --> anywhere
Private --> Within the same class
 */

public class Student {

//    default access modifiers used here
//    String name;
//    int rollNumber;

//    We use public and private access modifiers here
    public String name;
    private int rollNumber;

//    When we create a class by default we get constructor already created which allow us to create an object

    // Custom Constructor whose default value is fixed
    public Student (){
        rollNumber = 100;
    }

    // Custom Constructor that take one parameter
    public Student (String n){
        name = n;
    }

    // Custom Constructor that take two parameter
    public Student (String n, int rn){
        name = n;
        rollNumber = rn;
    }

    // It means we have to take at least one parameter that is of 'name'

    public void print(){
        System.out.println(name + " : " + rollNumber);
    }

    // We used getter and setter to take control on program, now nobody can enter negative value here
    public void setRollNumber(int rn){
        if (rn <= 0){
            return;
        }
        rollNumber = rn;
    }

    public int getRollNumber(){
        return rollNumber;
    }

}
