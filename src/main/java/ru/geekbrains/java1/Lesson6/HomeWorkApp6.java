package ru.geekbrains.java1.Lesson6;

public class HomeWorkApp6 {

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik") {
        };
        cat.DistanceRun(2);
        cat.DistanceSwim(1);
        System.out.println("У насть есть " +cat.getCounter() + " Кот(ов)");

        Dog dog = new Dog("Tuzik") {
        };
        dog.DistanceRun(10);
        dog.DistanceSwim(5);
        System.out.println("У насть есть " +dog.getCounter() + " Собак(а)");


    }
}