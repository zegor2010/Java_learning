package Projects;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    public Fan(){}

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }

    public String toString() {
        if (on) {
            return "The fan's speed is " + speed + ", the color of the fan is " + color + ", the radius is " + radius + ".";
        }
        else{
            return "The color of the fan is " + color + ", the radius is " + radius + " the fan is off.";
        }
    }
}
