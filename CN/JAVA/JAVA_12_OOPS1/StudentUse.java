package JAVA_12_OOPS1;

import java.util.Scanner;
// Within the same package we don't have to write import as here for class O1_Student

//        Which of operator is used to allocate memory for an object?
//        Answer ---> new keyword

public class StudentUse {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

//        // For default access modifier
//        Student student1 = new Student(); // We have created the object of class 01_Student
//        student1.name = "Anirudda";
//        student1.rollNumber = 12;
//
//        Student student2 = new Student();
//        student2.name = "Ankush";
//        student2.rollNumber = 121;
//
//        System.out.println(student1.name);
//        System.out.println(student2.name);
//        // System.out.println(student1);     ---> Will give address of Student

//        // Using default constructor
//        // For public and private access modifier
//        Student student1 = new Student(); // We have created the object of class 01_Student
//        student1.name = "Anirudda";
//        student1.setRollNumber(-12);
//
//        Student student2 = new Student();
//        student2.name = "Ankush";
//        student2.setRollNumber(121);
//
//        System.out.println(student1.getRollNumber());
//        System.out.println(student2.getRollNumber());


        // Using custom constructor
        // For public and private access modifier
        Student student0 = new Student();
        Student student1 = new Student("Aniruddha");
        Student student2 = new Student("Ankush", 121);

        student0.print();
        student1.print();
        student2.print();


    }
}
