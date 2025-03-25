package ge.tbc.testautomation.abstractClassesInterfaces;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizable;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidFigure;

public class Triangle extends Figure implements IResizable, IValidFigure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (!validateFigure(a, b, c)) {
            throw new IllegalArgumentException("Invalid triangle sides!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getLength() {
        return a + b + c;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackageName());
    }

    @Override
    public void doubleSize() {
        a *= 2;
        b *= 2;
        c *= 2;
    }

    @Override
    public void customSize(double byValue) {
        a *= byValue;
        b *= byValue;
        c *= byValue;
    }

    @Override
    public boolean validateFigure() {
        return validateFigure(a, b, c);
    }

    private boolean validateFigure(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a) && a > 0 && b > 0 && c > 0;
    }
}
