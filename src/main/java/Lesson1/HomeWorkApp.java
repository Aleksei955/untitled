package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        drawSquare();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void drawSquare() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int planA = 10;
        int planB = 5;
        if (planA + planB >= 0) {
            System.out.println("Сумма положительная");
        } else if (planB + planA <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }
        private static void printColor () {
            int value = 99;

            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100) {
                System.out.println("Жёлтый");
            } else if (value > 100) {
                System.out.println("Зелёный");
            }
        }


        private static void compareNumbers () {
            int nameA = 60;
            int nameB = 60;

            if (nameA >= nameB) {
             System.out.println("A>=B");
            } else if (nameA < nameB)
             System.out.println("A<B");
        }

}
