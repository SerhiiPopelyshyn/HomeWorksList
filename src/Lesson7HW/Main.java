package Lesson7HW;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int actFood;
        Cat[] allCats = new Cat[5];
        allCats[0] = new Cat("Javier", 10, false);
        allCats[1] = new Cat("Bruno", 11, false);
        allCats[2] = new Cat("Miguel", 12, false);
        allCats[3] = new Cat("Hugo", 13, false);
        allCats[4] = new Cat("Francisco", 15, false);

        Plate plate = new Plate(45);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].fullness == false && allCats[i].APPETITE < plate.food){
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Пушыстик " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Пушыстику " + allCats[i].name + " не хватило еды!");
            }
        }
        plate.info();
        System.out.println("Добавим еды");
        actFood = sc.nextInt();
        plate.increaseFood(actFood);
        plate.info();

    }
}
