package Projects.Math;

public class Circle {
    private double radius;
    private static int numberCircles = 0;

    public Circle() {
        numberCircles++;
    }

    public Circle(double radius){
        this.radius = radius;
        numberCircles++;
    }

    public void setRadius(double radius) {
        if(radius > 0){
            this.radius = radius;
        }
        else{
            System.out.println("can't");
        }
    }
    public double getRadius() {
        return radius;
    }
    public static int getNumberCircles(){
        return numberCircles;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
