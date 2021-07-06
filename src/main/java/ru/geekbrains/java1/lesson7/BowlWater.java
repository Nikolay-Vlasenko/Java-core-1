package ru.geekbrains.java1.lesson7;

public class BowlWater {
    private int amountWater;


    public void putWater (int amount) {
        this.amountWater += amount;
    }

    public void decreaseWater (int amount) {
        this.amountWater -= amount;
    }

    public int getAmountWater() {
        return amountWater;
    }
}
