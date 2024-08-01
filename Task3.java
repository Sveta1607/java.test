public class Task3 {
    public static void main(String[] args) {
        // Задан массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Чётные числа из массива:");

        // Проходим по каждому элементу массива
        for (int number : numbers) {
            // Проверяем, является ли число чётным
            if (number % 2 == 0) {
                // Выводим чётное число
                System.out.println(number);
            }
        }
    }
}