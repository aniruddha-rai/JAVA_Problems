package JAVA_12_OOPS1;

// Suppose we have a Class 'STUDENT' have some properties 'name' and 'rollNumber' that every student is going to have.

/*
Default --> Within the package
Public --> anywhere
Private --> Within the same class
 */

//public class Student {
//
////    default access modifiers used here
////    String name;
////    int rollNumber;
//
////    We use public and private access modifiers here
//    public String name;
//    private int rollNumber;
//
////    When we create a class by default we get constructor already created which allow us to create an object
//
//    // Custom Constructor whose value is fixed by default
//    public Student (){
//        rollNumber = 100;
//    }
//
//    // Custom Constructor that take one parameter
//    public Student (String n){
//        name = n;
//    }
//
//    // Custom Constructor that take two parameter
//    public Student (String n, int rn){
//        name = n;
//        rollNumber = rn;
//    }
//
//    // It means we have to take at least one parameter that is of 'name'
//
//    public void print(){
//        System.out.println(name + " : " + rollNumber);
//    }
//
//    // We used getter and setter to take control on program, now nobody can enter negative value here
//    public void setRollNumber(int rn){
//        if (rn <= 0){
//            return;
//        }
//        rollNumber = rn;
//    }
//
//    public int getRollNumber(){
//        return rollNumber;
//    }
//
//}


public class Student {

//    default access modifiers used here
//    String name;
//    int rollNumber;

    //    We use public and private access modifiers here
    public String name;
    // final data members can be initialized as soon as they are declared
    // OR inside a constructot
    private final int rollNumber;
    private static int numStudents;

    public static int getNumStudents() { // Static function which is not depend on object
        return numStudents;
    }


//    When we create a class by default we get constructor already created which allow us to create an object

//    // Custom Constructor whose value is fixed by default
//    public Student (){
//        rollNumber = 100;
//    }

//    // Custom Constructor that take one parameter
//    public Student (String n){  // Here rollNumber is not initialized and after that it cannot be changed so it will always be 0
//        name = n;
//    }

    // Custom Constructor that take two parameter
    public Student (String name, int rollNumber){
        // this : access data member which has same name as a local variable
        this.name = name;               // this keyword is used to reduce ambiguity between the two same name, because it will always take local variable name
        this.rollNumber = rollNumber;
        numStudents++;
    }

    // It means we have to take at least one parameter that is of 'name'

    public void print(){
        System.out.println(name + " : " + rollNumber);
    }

//    // We used getter and setter to take control on program, now nobody can enter negative value here
//    public void setRollNumber(int rn){
//        if (rn <= 0){
//            return;
//        }
//        rollNumber = rn;
//    }

    public int getRollNumber(){
        return rollNumber;
    }

}
