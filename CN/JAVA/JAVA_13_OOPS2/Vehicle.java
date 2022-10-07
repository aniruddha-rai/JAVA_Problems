package JAVA_13_OOPS2;

public class Vehicle {
    String color;
    private int maxSpeed;

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("Vehicle Color : " + color);
        System.out.println("Vehicle Max Speed : " + maxSpeed);
    }
}
