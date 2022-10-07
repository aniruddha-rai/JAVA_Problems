package JAVA_13_OOPS2;

// Protected ---> Same as Default/Friendly but will allow in other packages too which has sub class like we have in TRUCK Class
public class Vehicle {
    protected String color;
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
