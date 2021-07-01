package ru.geekbrains.java1.Lesson6;

public abstract class Dog extends Animal {
    private int counter;

    public Dog(String name) {
        super(name);
        counter++;
    }

    @Override
    public void DistanceRun (int lengths) {
        int catDistanceRunMax = 500;
        if ((lengths >= 0) && (lengths <= catDistanceRunMax)) {
            System.out.printf("Собачка %s пробежала дистанцию" + " " + lengths + " " + "метра(ов)\n",this.getName());
        }
        else {
            System.out.printf("Собачка %s не смогла пробежать дистанцию" + " " + lengths + " " + "метров\n",this.getName());
        }
    }

    @Override
    public void DistanceSwim (int lengths) {
        int catDistanceRunMax = 10;
        if ((lengths >= 0) && (lengths <= catDistanceRunMax)) {
            System.out.printf("Собачка %s проплыла дистанцию" + " " + lengths + " " + "метра(ов)\n",this.getName());
        }
        else {
            System.out.printf("Собачка %s не смогла проплыть дистанцию" + " " + lengths + " " + "метров\n",this.getName());
        }
    }

    public int getCounter() {return counter;}
}
