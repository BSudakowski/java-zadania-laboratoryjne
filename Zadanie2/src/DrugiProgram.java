public class DrugiProgram {
    public static void main(String[] args) {
        System.out.println("Nowy tekst wypisany przez moj drugi program");

        //Poniżej jest rozwiązanie zadanie IIb
        int sideA = 5;
        int sideB = 12;

        int perimeter = 2 * sideA + 2 * sideB; //lub int perimeter = sideA + sideA + sideB + sideB;

        System.out.println("Obwod prostokata: " + perimeter);

        int area = sideA * sideB;

        System.out.println("Pole prostokata: " + area + ", obwod prostokata: " + perimeter);

        int iterator = 0;
        System.out.println(iterator++);     //wypisywane jest 0 a następnie wartość zwiększana do 1
        System.out.println(iterator);       //wypisana wartść 1
        System.out.println(++iterator);     //najpierw wartość jest zwiększona do 1 a później wypisane jest 1
        System.out.println(iterator);       //wypisana wartość 1

        System.out.println("Wynik zadania:");
        int iteratorExercise = 0;
        System.out.println(iteratorExercise++);
        System.out.println(--iteratorExercise);
        System.out.println(iteratorExercise++);
    }
}
