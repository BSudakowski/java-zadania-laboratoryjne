package pl.edu.agh.qa;

import pl.edu.agh.qa.figuresmanager.Figure;

public class FiguresPlayground {
    public static void main(String[] args) {
        Figure[] figures = {new Figure("Square", 20),
                new Figure("Circle", 10),
                new Figure("Triangle", 23)};

        Figure biggest = figures[0];
        for(Figure figure : figures) {
            if (figure.getArea() > biggest.getArea()) {
                biggest = figure;
            }
        }
        System.out.println("Biggest is " + biggest);

        for(Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
