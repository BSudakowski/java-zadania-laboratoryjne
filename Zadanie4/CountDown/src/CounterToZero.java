public class CounterToZero {
    public static void main(String[] args) {
        int counterStartPoint = 4;

        switch (counterStartPoint) {
            case 3:
                System.out.println("Trzy");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 1:
                System.out.println("Jeden");
                break;
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Za duza liczba");
        }

        switch (counterStartPoint) {
            default:
            case 3:
                System.out.println("Trzy");
            case 2:
                System.out.println("Dwa");
            case 1:
                System.out.println("Jeden");
            case 0:
                System.out.println("Zero");
        }
    }
}
