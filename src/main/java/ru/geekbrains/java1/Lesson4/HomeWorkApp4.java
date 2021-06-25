package ru.geekbrains.java1.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    private static Scanner SCANNER = new Scanner(System.in);
    private static Random RANDOM = new Random();
    private static char CHIP_HUMAN = 'X';
    private static char CHIP_COMPUTER = 'O';
    private static char CHIP_EMPTY = '.';

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char [][] field;

    private static int scoreHuman;
    private static int scoreComputer;


    public static void main(String[] args) {
        while (true) {
            playRound();
            System.out.printf("Счет игры : Компьютер     Вы\n                 %d        %d", scoreComputer, scoreHuman);
            System.out.println("Следующая игра? Да или Нет?  -> ");
            if (!SCANNER.next().toLowerCase().equals("Да")) break;
        }
    }

    private static void playRound() {
        initField(3,3);
        printField();
        while (true) {
            humanChoice();
            printField();
        if (gameCheck(CHIP_HUMAN)) break;
           ComputerChoice();
           printField();
        if (gameCheck(CHIP_COMPUTER)) break;
        }
    }

    //Создание поля игры
    private static void initField(int SizeY,int SizeX) {
        fieldSizeY = SizeY;
        fieldSizeX = SizeX;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = CHIP_EMPTY;
            }
        }
    }
//Разметка поля
    private static void printField () {
            System.out.print("+");
            for (int x = 0; x < fieldSizeX * 2 + 1; x++) {
                System.out.print((x % 2 == 0) ? "-" : x / 2 + 1);
            }
            System.out.println();

            for (int y = 0; y < fieldSizeY; y++) {
                System.out.print(y + 1 + "|");
                for (int x = 0; x < fieldSizeX; x++) {
                    System.out.print(field[y][x] + "|");
                }
                System.out.println();
            }
            for (int x = 0; x < fieldSizeX * 2 + 1; x++) {
                System.out.print("-");
            }
            System.out.println();
    }
//Ход человека
    private static void humanChoice () {
        int y, x;
        do {
            System.out.print("Укажите координату Вашего хода по осям X и Y через пробел -> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(y,x) || !isCellEmpty(y,x));
        field[x][y] = CHIP_HUMAN;

    }
//Ход компьютера
    private static void ComputerChoice () {
        int y, x;
        do {
            y = RANDOM.nextInt(fieldSizeY);
            x = RANDOM.nextInt(fieldSizeX);
        } while (!isCellEmpty(y,x));
        field[y][x] = CHIP_COMPUTER;

    }

//Проверка ячейки на пустоту
    private static boolean isCellEmpty (int y, int x) {
        return field[y][x] == CHIP_EMPTY;
    }

//Проверка, что введенные данные указаны в диапазоне игрового поля
    private static boolean isCellValid (int y, int x) {
        return x >=0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

//Проверка условия победы
    private static boolean checkWin (char chip) {
        if (field[0][0] == chip && field[0][1] == chip && field[0][2] == chip) return true;
        if (field[1][0] == chip && field[1][1] == chip && field[1][2] == chip) return true;
        if (field[2][0] == chip && field[2][1] == chip && field[2][2] == chip) return true;

        if (field[0][0] == chip && field[1][0] == chip && field[2][0] == chip) return true;
        if (field[0][1] == chip && field[1][1] == chip && field[2][1] == chip) return true;
        if (field[0][2] == chip && field[1][2] == chip && field[2][2] == chip) return true;

        if (field[0][0] == chip && field[1][1] == chip && field[2][2] == chip) return true;
        if (field[0][2] == chip && field[1][1] == chip && field[2][0] == chip) return true;

        return false;
    }
//Проверка условий на ничью
    private static boolean checkDwaw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y,x)) return false;
            }
        }
        return true;
    }
//Проверка условий на победителя и на ничью
    private static boolean gameCheck (char chip) {
        if (checkDwaw()) {
            System.out.println("У Вас ничья");
            return true;
        }
        if (checkWin(chip)) {
            if (chip == CHIP_HUMAN){
                System.out.println("Вы победили");
                scoreHuman++;
            } else {
                System.out.println("Компьютер победил");
                scoreComputer++;
            }
            return true;
        }
        return false;
    }

}

