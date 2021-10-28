/**
 * Java 1. Homework 7
 *
 * @author Juliya Veyukova
 * @version 28.10.2021
 */
public class Lesson7 {


        public static void main(String[] args) {

            Cat[] cat = new Cat[3];
            cat[0] = new Cat("Мурзик", 150);
            cat[1] = new Cat("Васька", 100);
            cat[2] = new Cat("Пушок", 300);
            Plate plate = new Plate(500);
            System.out.println("В миске " + plate.getFood());
            System.out.println("Коты пошли есть");
            for (Cat i : cat) {
                if (!i.getFullness()) {
                    do {
                        System.out.println((i.eat(plate)) ? "Кот " + i.getName() + " съел " + i.getAppetite() + " осталось " + plate.getFood()
                                : "Кот " + i.getName() + " не поел. Мало еды. Всего " + plate.getFood());
                        if (!i.getFullness()) plate.increaseFood(20);
                    }while (!i.getFullness());
                }
            }

        }
    }


