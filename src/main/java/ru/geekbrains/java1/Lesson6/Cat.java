package ru.geekbrains.java1.Lesson6;

public class Cat extends Animal{
    private int counter;

    public Cat (String name) {
        super(name);
        counter++;

    }
    @Override
    public void DistanceRun (int lengths) {
        int catDistanceRunMax = 200;
        if ((lengths >= 0) && (lengths <= catDistanceRunMax)) {
            System.out.printf("Котик %s пробежал дистанцию" + " " + lengths + " " + "метра(ов)\n",this.getName());
        }
        else {
            System.out.printf("Котик %s не смог пробежать дистанцию" + " " + lengths + " " + "метров и упал без сил\n",this.getName());
        }
    }

    @Override
    public void DistanceSwim (int lengths) { // Как сделать условие if == 0 и если значение больше 0 или меньше 0, идём на else if
        int catDistanceSwim = 0;
        if (catDistanceSwim == 0) {
            System.out.printf("Котик %s не умеет плавать\n",this.getName());
        }
        else if ((catDistanceSwim < 0) && (catDistanceSwim >0)) {
            System.out.printf("Котик %s не умеет плавать и он утонул\n",this.getName());
        }
    }

    public int getCounter() {return counter;}
}
