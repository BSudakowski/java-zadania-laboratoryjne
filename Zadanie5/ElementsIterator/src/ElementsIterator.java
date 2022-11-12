public class ElementsIterator {
    public static void main(String[] args) {
        int iterator1 = 1;
        System.out.println("Zadanie IV - 3");
        while (iterator1 <= 10) {
            System.out.println(iterator1++);
        }

        System.out.println("\nZadanie IV - 4");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nZadanie IV - 5");
        String[] tags = {"news", "sport", "weather forecast"};

        System.out.println("\nZadanie IV - 6");
        System.out.println(tags[0]);
        System.out.println(tags[tags.length - 1]);

        System.out.println("\nZadanie IV - 7");
        for (String tag : tags) {
            System.out.println(tag);
        }

        System.out.println("\nZadanie IV - 8");
        for (int i = tags.length - 1; i >= 0; i--) {
            System.out.print(tags[i] + ", ");
        }

        System.out.println("\n\nZadanie IV - 8 *wersja trudniejsza ale nie dodaje przecinka po ostatnim elemencie)");
        for (int i = tags.length - 1; i >= 0; i--) {
            System.out.print(tags[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}
