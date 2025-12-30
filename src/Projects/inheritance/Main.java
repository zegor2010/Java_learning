package Projects.inheritance;

import java.time.LocalDateTime;

public class Main {
    public static void main() {
        GeometricFigure figure = new Rectangle(10,20);
       //"is a"
       // "has a"
        GeometricFigure figure2 = new Rectangle(10,20);
              Triangle figure3 = new Triangle(2.5, 3, 4);
        GeometricFigure circle = new Circle("1",true, LocalDateTime.now(),10);
        System.out.println(figure.test());
        System.out.println(figure2.test());
        System.out.println(circle.test());
        GeometricFigure figure4 = figure3;
        Rectangle rectangle =(Rectangle)figure2;
        Rectangle rectangle2 = new Rectangle(10,10);
        if(circle instanceof Rectangle){ rectangle2 =(Rectangle)circle;}
        //overloading -різні параметри/тип повернення
        //overriding    - в різних класах що успадковуються один від одного
        System.out.println(figure.equals(figure2));
        //підготувати декілька речень
        /*Основи ООП
        -інкапсуляція
        -наслідування
        -поліморфізм
         */
        // GeometricFigure figure2 = new Rectangle();
        //GeometricFigure -оголошений (declared type), Rectangle -фактичний (actual type)
        //c1-c2-c3-c4..cn
        // методи класу Object
        // об'єкти - посилальний тип, == перевіряє чи посилання звертається на одне  і те саме місце
        figure2.test();
        circle.test();
        int i =5;
        long l = i;
        byte b = (byte)i;


    }


}
