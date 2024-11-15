public class practic6z4 {
    //Ракітенко Артем Кн-21
    //Завдання 4
    public static void main(String[] args) {
        // Таблиця синусів значень від 0 до 90 градусів з кроком 1 градус
        int count = 0;
        for (int i = 0; i <= 90; i++) {
            System.out.printf("sin(%d) = %.4f\t", i, Math.sin(Math.toRadians(i)));
            count++;
            // Вивести 10 значень
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
