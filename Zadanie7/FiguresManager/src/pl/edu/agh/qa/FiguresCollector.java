package pl.edu.agh.qa;

import pl.edu.agh.qa.figures.Circle;
import pl.edu.agh.qa.figures.Square;
import pl.edu.agh.qa.general.Figure;


public class FiguresCollector {
    public static void main(String[] args) {
        //Do obiektu typu Figure można przypisać obiekt każdej klasy, która dziedziczy z klasy Figure(Square, Circle)
        Figure[] figuresArray = {new Square(1, 1, 5), new Square(10, 10, 3), new Circle(2, 5, 3), new Circle(0, 0, 8)};

        for (Figure figure : figuresArray) {
            figure.move(-1, -1);
            System.out.println(figure.name() + " na pozycji " + figure.position() + " ma pole " + figure.area());
        }


    }
}
