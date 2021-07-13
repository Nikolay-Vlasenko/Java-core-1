package ru.geekbrains.java1.lesson7;

public class BowlFood {
    private int amountFood;

    public void putFood (int amount) {
        this.amountFood += amount;
    }

    public boolean decreaseFood (int amount) {
        if (this.amountFood >= amount) {
            this.amountFood -= amount;
            return true;
        }
        System.out.println("Кот не смог поесть");
        return false;
    }

    public int getAmountFood() {
        return amountFood;
    }
}
