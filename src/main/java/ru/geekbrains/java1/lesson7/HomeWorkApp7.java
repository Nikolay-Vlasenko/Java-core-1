package ru.geekbrains.java1.lesson7;

public class HomeWorkApp7 {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik",10,20,1);
        Cat cat1 = new Cat("Vaska",15,20,1);
        Cat cat2 = new Cat("Murzik",20,40,1);
        BowlWater bowlWater = new BowlWater();
        bowlWater.putWater(10);
        BowlFood bowlFood = new BowlFood();
        bowlFood.putFood(40);

//        System.out.printf("В миске есть %d еды\n", bowlFood.getAmountFood());
//        System.out.printf("В миске есть %d воды\n", bowlWater.getAmountWater());
//        cat.eat(bowlFood);
//        cat.water(bowlWater);
//        System.out.printf("В миске есть %d еды\n", bowlFood.getAmountFood());
//        System.out.printf("В миске есть %d воды\n", bowlWater.getAmountWater());
//        cat1.eat(bowlFood);
//        cat1.water(bowlWater);
//        System.out.printf("В миске есть %d еды\n", bowlFood.getAmountFood());
//        System.out.printf("В миске есть %d воды\n", bowlWater.getAmountWater());
//        cat2.eat(bowlFood);
//        cat2.water(bowlWater);
//        System.out.printf("В миске есть %d еды\n", bowlFood.getAmountFood());
//        System.out.printf("В миске есть %d воды\n", bowlWater.getAmountWater());



/**        Не пойму как остановить проедание тарелки, что только не пробовал, подскажите, пожалуйста.
 *         И как в тарелке еды (класс тарелки), я могу обратится к имени кота (класс кота)? Смысл в чём -
 *         как я могу сказать, что такой - то кот - уже сыт.
*/

        Cat[] catArray = new Cat[] {
                new Cat("Baks",10,20,1),
                new Cat("Oskar",15,20,1),
                new Cat("Tom",20,40,1),
        };
        BowlWater bowlWater1 = new BowlWater();
        bowlWater1.putWater(10);
        BowlFood bowlFood1 = new BowlFood();
        bowlFood1.putFood(40);
        for (Cat cat3 :catArray) {
            cat3.eat(bowlFood1);
            cat3.water(bowlWater1);
            System.out.printf("В миске есть %d еды \n", bowlFood1.getAmountFood());
            System.out.printf("В миске есть %d воды \n", bowlWater1.getAmountWater());
        }

    }
}


