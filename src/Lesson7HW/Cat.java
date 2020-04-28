package Lesson7HW;

public class Cat {
    public String name;
    public int APPETITE;
    public boolean fullness;

    public Cat(String name, int APPETITE, boolean fullness) {
        this.name = name;
        this.APPETITE = APPETITE;
        this.fullness = fullness;
    }

    public void eat(Plate plate) {

        plate.decreaseFood(APPETITE);
    }
}
