package Lesson7;

public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void voice(Cat cat){
        System.out.println(name + " GAV GAV!!! " + cat.name);
        cat.fear(this);
    }
}
