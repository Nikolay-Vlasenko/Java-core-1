package ru.geekbrains.java1.Lesson5;

import java.util.Arrays;

public class HomeWorkApp5 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Ivanov Ivan","Director","aaa@mail.ru",8900, 50000,50),
                new Employee("Sidorova Elena","Accountant","bbb@mail.ru",8800,49000,45),
                new Employee("Sidorov Petya","Carpenter","ddd@mail.ru",8700,45000,39),
                new Employee("Petrov Vasya","Driver","fff@mail.ru",8600,43000,35),
                new Employee("Smirnov Aleksey","Seller","ccc@mail.ru",8500, 40000,30),
        };
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() >= 40);
            }
//        System.out.println(Arrays.deepToString(employees)); // Не пойму как мне вывести нужные данные
        // Надо было создать отдельный метод, там пробежатся циклом и там получить данные?
    }
}
