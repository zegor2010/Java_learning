package Projects.Math;

public class Rectangle {
    private double width = 1;
    private double height = 1;
    private String color ="";

    public Rectangle(){}
    public Rectangle (double width) {
        this.width=width;
    }
    public Rectangle(double width, double height){
        this(width);
            this.height = height;
    }
    public Rectangle(double width,double height,String color){
        this(width, height);
        this.color=color;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return width*2+height*2;
    }

}

