package ge.tbc.testautomation.abstractClassesInterfaces;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Circle extends Figure implements IResizable, IValidFigure {
    private double radius;

    public Circle(double radius) {
        if (!validateFigure(radius)) {
            throw new IllegalArgumentException("Invalid radius value!");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }

    @Override
    public void doubleSize() {
        radius *= 2;
    }

    @Override
    public void customSize(double byValue) {
        radius *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return radius > 0;
    }

    private boolean validateFigure(double radius) {
        return radius > 0;
    }
System.out.println("Final merged version!");

}
