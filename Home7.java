public class Main {

    public static void main(String[] args) {
        // Створюємо масив з 20 елементів
        int[] arr = new int[20];
        
        // Заповнюємо масив випадковими числами в діапазоні від -100 до 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 201) - 100; // від -100 до 100
        }
        
        // Виводимо елементи масиву
        System.out.print("Елементи масиву: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Знаходимо суму всіх від'ємних чисел
        int negativeSum = 0;
        for (int num : arr) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);
        
        // Знаходимо кількість парних і непарних чисел
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
        
        // Знаходимо найбільший і найменший елемент та їх індекси
        int min = arr[0], max = arr[0], minIndex = 0, maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");
        
        // Знаходимо перше від'ємне число і рахуємо середнє арифметичне чисел після нього
        int firstNegativeIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        
        if (firstNegativeIndex != -1 && firstNegativeIndex < arr.length - 1) {
            int sum = 0;
            int count = 0;
            for (int i = firstNegativeIndex + 1; i < arr.length; i++) {
                sum += arr[i];
                count++;
            }
            double average = (double) sum / count;
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + average);
        } else if (firstNegativeIndex == -1) {
            System.out.println("Від'ємних чисел немає.");
        } else {
            System.out.println("Немає чисел після першого від'ємного числа.");
        }
    }
}

