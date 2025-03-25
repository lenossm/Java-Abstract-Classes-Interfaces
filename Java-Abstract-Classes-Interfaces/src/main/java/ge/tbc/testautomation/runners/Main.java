package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.abstractClassesInterfaces.Circle;
import ge.tbc.testautomation.abstractClassesInterfaces.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3, 9, 10);

        circle.printPackageName();
        triangle.printPackageName();

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Triangle Area: " + triangle.getArea());

        circle.doubleSize();
        System.out.println("New Circle Radius: " + circle.getArea());

        triangle.customSize(1.5);
        System.out.println("New Triangle Area: " + triangle.getArea());
    }
}
