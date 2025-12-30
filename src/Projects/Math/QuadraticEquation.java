package Projects.Math;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double newA, double newB, double newC){
        a = newA;
        b = newB;
        c = newC;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }
    public double getRoot1(){
        return (-b + Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
    }
    public double getRoot2(){
        return (-b - Math.pow(b * b - 4 * a * c, 0.5)) / 2 * a;
    }
}
