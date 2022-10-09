package JAVA_13_OOPS2;

// Inheriting from Vehicle, Parent class will be Vehicle
public class Car extends Vehicle {
//    String color;
//    int maxSpeed;

    int numGears;
    boolean isConvertible;

    // Constructor
    public Car(int numGears, int maxSpeed){
        // super(200); // as we don't have defualt constuctor of parent class vehicle we have define the parameter to get rid pof errors
        super(maxSpeed);
        this.numGears = numGears;
        System.out.println("Car Constructor");
    }

    public void print(){
//        System.out.println("Car Color : " + color);
//        System.out.println("Car Max Speed : " + getMaxSpeed());
        // Instead --->
        super.print();
        System.out.println("Car numGears : " + numGears);
        System.out.println("Car isConvertible : " + isConvertible);
    }
}
