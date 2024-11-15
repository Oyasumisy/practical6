import java.util.Random;
import java.util.Scanner;

public class practic6z5 {
    //Ракітенко Артем Кн-21
    //Завдання 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Розмір масиву
        System.out.print("Розмір масиву: ");
        int size = scanner.nextInt();

        // Створення масиву і генерація випадкових
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Випадкове число
        }

        // Вибір перевірки, зростання або спадання
        System.out.print("Перевірити на зростання (1) або спадання (2): ");
        int choice = scanner.nextInt();
        boolean isOrdered = true;

        for (int i = 1; i < size; i++) {
            if ((choice == 1 && array[i] < array[i - 1]) || (choice == 2 && array[i] > array[i - 1])) {
                isOrdered = false;
                break;
            }
        }

        System.out.println(isOrdered ? "Впорядкований." : "Не впорядкований.");
        scanner.close();
    }
}
