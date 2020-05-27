package JC_Lesson1.JC2_Lesson1_Competitors;

public class Kitty implements Competitor{

    String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private int maxJumpHeight;

    private boolean onDistance;

    public Kitty( String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }
    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(" " + name + " легко пробежал " + dist + " метров");
        } else {
            System.out.println(" " + name + " сдался и не смог пробежать " + dist + " метров");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(" " + name + " вообще не умеет плавать");
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(" " + name + " запросто проплыл " + dist + " метров");
        } else {
            System.out.println(" " + name + " не может " + dist + " метров плавать");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(" " + name + " хватко перепрыгнул " + height + " метров");
        } else {
            System.out.println(" " + name + " не может " + height + " метров прыгнуть");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(" " + name + " " +
                (onDistance ? " на дистанции" : " выбыл из соревнований"));
    }
}