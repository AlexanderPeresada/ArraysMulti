package arraysmulti;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        // Оголошення та створення масиву
        // 4 рядки, 4 стовпці
        int[][] tickets = {
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {100, 356, 777, 666},
                {137, 658, 888, 999},
        };

        //Оголошення лічильників
        int searchCount = 0;
        int countOfTry = 0;


        // Умови виграшу
        System.out.print("Для того щоб вгадати число,у вас є 3 спроби, нехай щастить!\n");

        // Цикл спроб для гри
        while (countOfTry < 3) {
            // Ввод шукогомого числа за допомогою Scanner
            Scanner sc = new Scanner(System.in);
            System.out.print("Введіть число: ");
            int inputNum = sc.nextInt();
            //Пошук введеного числа методом for-each в масиві tickets
            for (int[] searchArray : tickets) {
                for (int searchNum : searchArray) {
                    if (searchNum == inputNum) {
                        searchCount++;

                    }
                }

            }
            // підрахунок кількоісті спроб
            countOfTry++;
            // Аналіз резульати пошуку числа в масиві
            if (searchCount > 0) {
                System.out.println("Вітаємо! Ви виграли!\n" +
                        "Кількість спроб " + searchCount);
                break;
            }
            if (countOfTry < 3) {
                int resultOfTry = 3 - countOfTry;
                System.out.println("Нжаль не вгадали, спробуйте ще раз. Кількість доступних спробу " + resultOfTry);

            } else System.out.println("Нажаль програли. Пощастить іншим разом :) ");
        }

    }
}
