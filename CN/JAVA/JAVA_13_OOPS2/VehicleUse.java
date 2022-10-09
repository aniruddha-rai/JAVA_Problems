package JAVA_13_OOPS2;


public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.color = "Black";
        v.setMaxSpeed(10);
        v.print();

        Car c = new Car();
        c.numGears = 10;
        c.color = "Red";
        c.setMaxSpeed(100);
        c.print();
//        c.printCar(); ---> If parent class and child class have same function let's say print then,
//        First it will search in car class if exist will print or else search in parent class then print
    }
}

