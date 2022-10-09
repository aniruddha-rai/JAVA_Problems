package JAVA_13_OOPS2;


public class VehicleUse {
    public static void main(String[] args) {
////        Vehicle v = new Vehicle();
////        v.color = "Black";
////        v.setMaxSpeed(10);
////        v.print();
//
//        // When we create derived class object it automatically creates a parent class object ie default vehicle constructor that's why vehicle constructor being called twice
//        Car c = new Car(10, 20);
//        // c.numGears = 10;
//        c.color = "Red";
//        c.setMaxSpeed(100);
//        c.print();
////        c.printCar(); ---> If parent class and child class have same function let's say print then,
////        First it will search in car class if exist will print or else search in parent class then print

        // POLYMORPHISM ------------------------------------------------------------------------------------>

        // Everything that s subclass of vehicle can be used here
        Vehicle v = new Car(23,45);
        // We can use vehicle class function but not subclass because every vehicle is not convertible as in truck
//        v.isConvertible(); In compile time it only knows that v is reference to vehicle means isConvertible will not be accessible
        v.print(); // At runtime, we have object of car, so it will print car's print function
        // which function to be called is decided in run time
    }
}

