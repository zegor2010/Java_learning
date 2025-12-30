package Projects.Math;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public String getStatus() {
        double BMI = getBMI();
        if (BMI < 18.5) {
            return "underweight";
        } else if (18.5 < BMI && BMI < 24.9) {
            return "normal";
        } else if (BMI < 30) {
            return "obese";
        } else {
            return "overweight";
        }
    }
}
