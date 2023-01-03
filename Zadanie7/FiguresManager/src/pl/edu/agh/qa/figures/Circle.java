package pl.edu.agh.qa.figures;

import pl.edu.agh.qa.general.Figure;

public class Circle extends Figure {
    private double radius;
    private static final double PI = 3.14;


    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
        this.name = "Kolo";
    }

    @Override
    public double area() {
        return PI * radius * radius; //Tutaj lepszym rozwiązaniem by było użycie stałej java.lang.Math.PI
    }

    @Override
    public String name() {
        return name;
    }
}
