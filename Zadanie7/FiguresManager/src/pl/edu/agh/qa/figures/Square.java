package pl.edu.agh.qa.figures;

import pl.edu.agh.qa.general.Figure;

public class Square extends Figure {
    private double sideLength;

    public Square(int x, int y, double sideLength) {
        super(x, y);
        this.sideLength = sideLength;
        this.name = "Kwadrat";
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public String name() {
        return name;
    }

}
