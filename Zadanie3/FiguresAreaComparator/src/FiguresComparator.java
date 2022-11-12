import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiguresComparator {
    public static void main(String[] args) {
        int lineA = 123;
        int lineB = 3451;

        if (lineA > lineB) {
            System.out.println("Dluzsza linia ma dlugosc: " + lineA);
        } else {
            System.out.println("Dluzsza linia ma dlugosc: " + lineB);
        }

        int rectangleSideA = 4;
        int rectangleSideB = 3;
        int squareSide = 4;

        if (rectangleSideA * rectangleSideB > squareSide * squareSide) {
            System.out.println("Najwieksze pole prostokata");
        } else if (squareSide * squareSide > rectangleSideA * rectangleSideB) {
            System.out.println("Najwieksze pole kwadratu");
        } else {
            System.out.println("Pola sa sobie rowne");
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj numbe: ");
        int number = 0;
        try {                                           //Ta linia na razie nas nie interesuje
            number = Integer.parseInt(in.readLine());
        } catch (IOException e) {                       //Ta linia na razie nas nie interesuje
            e.printStackTrace();                        //Ta linia na razie nas nie interesuje
        }                                               //Ta linia na razie nas nie interesuje

        if (number % 2 == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }

        int numberOne = -1;
        int numberTwo = -3;

        if (numberOne < 0 && numberTwo < 0) {
            if (numberOne < numberTwo) {
                System.out.println("Blizej zera: " + numberTwo);
            } else {
                System.out.println("Blizej zera: " + numberOne);
            }
        } else if (numberOne > 0 && numberTwo > 0) {
            if (numberOne < numberTwo) {
                System.out.println("Blizej zera: " + numberOne);
            } else {
                System.out.println("Blizej zera: " + numberTwo);
            }
        }

    }
}
