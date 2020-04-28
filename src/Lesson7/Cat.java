package Lesson7;

public class Cat {
    String name;
    final int APPETITE =10;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        System.out.println("Cat " + name + " eat...");
        plate.decreaseFood(APPETITE);
    }

    public void fear(Dog dog){
        System.out.println(name + " fear..." + dog.name);
    }
}
