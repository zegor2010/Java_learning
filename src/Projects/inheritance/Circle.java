package Projects.inheritance;

import java.time.LocalDateTime;

public class Circle extends  GeometricFigure {

    double radius;
    String color;

    public Circle(String color, boolean filled, LocalDateTime dateTime, double radius) {
        super(color, filled, dateTime);
        this.radius = radius;
        super.color = color;


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public int test(){
        return 5;
    }
    public int test(int a){
        return 4;
    }

    @Override
    public String getColor() {
        return color;
    }
}

