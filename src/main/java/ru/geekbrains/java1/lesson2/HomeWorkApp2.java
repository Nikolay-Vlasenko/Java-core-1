package ru.geekbrains.java1.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {

        System.out.println(checkSumMetod(7, 8));
        isNegativePositive(0);
        System.out.println(isPositiveNegative(-1));
        metod();
        System.out.println(year(2200));
    }

    // 1) Задание
    public static boolean checkSumMetod(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    // 2) Задание
    public static void isNegativePositive(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 3) Задание
    public static boolean isPositiveNegative(int a) {
        if (a <= 0) {
            return true;
        }
        return false;
    }

    // 4) Задание
    public static void metod() {
        for (int i = 0; i < 5; i++) {
            System.out.print('#');
        }
        System.out.println();
    }

    // 5) Задание
    public static boolean year(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            return true;
        }
        return false;
        }


}
