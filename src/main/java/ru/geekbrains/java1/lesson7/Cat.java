package ru.geekbrains.java1.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private final int satiety;
    private int drinkwater;

    public Cat(String name, int appetite, int satiety,int drinkwater) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        this.drinkwater = drinkwater;
    }

    public void eat (BowlFood bowlFood) {
        while (appetite <= satiety && appetite != satiety) {
            bowlFood.decreaseFood(this.appetite);
            System.out.printf("Котик %s покушал еды: %d\n", this.name, this.appetite);

            if (appetite >= satiety && appetite == satiety)
                System.out.printf("Котик %s сыт \n", this.name, this.appetite);
            break;
        }
    }

    public void water (BowlWater bowlWater) {
        bowlWater.decreaseWater(this.drinkwater);
        System.out.printf("Котик %s выпил воды: %d\n", this.name, this.drinkwater);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                ", drinkwater=" + drinkwater +
                '}';
    }
}
