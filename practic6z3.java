import java.util.Random;
import java.util.Scanner;

public class practic6z3 {
    //Ракітенко Артем Кн-21
    //Завдання 3
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

        // Значення для заміни
        System.out.print("Значення для заміни: ");
        int valueToFind = scanner.nextInt();
        System.out.print("Нове значення: ");
        int newValue = scanner.nextInt();

        // Заміна першого знайденого
        for (int i = 0; i < size; i++) {
            if (array[i] == valueToFind) {
                array[i] = newValue;
                break;
            }
        }

        // Результати
        System.out.println("Масив після заміни: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
