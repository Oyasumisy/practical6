import java.util.Scanner;

public class practic6z2 {
    //Ракітенко Артем Кн-21
    //Завдання 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Кількість кутів багатокута
        System.out.print("Скількі кутів у багатокута: ");
        int n = scanner.nextInt();

        // Створення масиву для кутів багатокута
        int[] angles = new int[n];
        int sumOfAngles = 0;

        // Значення кутів
        System.out.println("Значення кутів: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Кут " + (i + 1) + ": ");
            angles[i] = scanner.nextInt();
            sumOfAngles += angles[i];
        }

        // Перевірка теореми багатокута
        int expectedSum = 180 * (n - 2);
        if (sumOfAngles == expectedSum) {
            System.out.println("Багатокут з такими кутами може існувати.");
        } else {
            System.out.println("Багатокут з такими кутами не може існувати.");
        }

        scanner.close();
    }
}
