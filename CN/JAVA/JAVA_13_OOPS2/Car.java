package JAVA_13_OOPS2;

// Inheriting from Vehicle, Parent class will be Vehicle
public class Car extends Vehicle {
//    String color;
//    int maxSpeed;

    int numGears;
    boolean isConvertible;

    public void print(){
//        System.out.println("Car Color : " + color);
//        System.out.println("Car Max Speed : " + getMaxSpeed());
        // Instead --->
        super.print();
        System.out.println("Car numGears : " + numGears);
        System.out.println("Car isConvertible : " + isConvertible);
    }
}