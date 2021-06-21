package ru.geekbrains.java1.Lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        arr();
        arr1();
        arr2();
        arr3();

    }
// Задание 1
    public static void arr () {
        int [] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1) {
                arr[i] = 0;
            }
            else if (arr [i] <= 1) {
                arr[i] =1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }



//Задание 2
    public static void arr1 () {
        int [] arr1 = new int[100];
//      for (int i = 0; i < arr1.length; i++) - без шага, по порядку
        for (int i = 0; i < arr1.length; i += 2) {
            arr1 [i] = i;
        }
        System.out.println(Arrays.toString(arr1));
    }

//Задание 3
    public static void arr2 () {
        int [] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] = arr2[i] * 2; {
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

//Задание 4
    public static void arr3 () {
        int [][] arr3 = new int[3][3];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if ((i == j) || (i == arr3.length - 1 - j)) {
                    arr3[i][j] =1;
                    }
                }
            }
        System.out.print(Arrays.deepToString(arr3));
        }

}

