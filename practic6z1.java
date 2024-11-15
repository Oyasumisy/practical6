import java.util.Random;
import java.util.Scanner;

public class practic6z1 {
    //Ракітенко Артем Кн-21
    //Завдання №1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Розмір масиву
        System.out.print("Розмір масиву: ");
        int size = scanner.nextInt();

        // Створення масиву і генерація випадкових
        int[] array = new int[size];
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Генерація випадкового числа
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Результати
        System.out.println("Кількість парних: " + evenCount);
        System.out.println("Кількість непарних: " + oddCount);

        scanner.close();
    }
}
