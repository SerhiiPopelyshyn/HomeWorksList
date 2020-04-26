package LEsson6;

abstract class Animal {
    protected int _length;
    protected double _height;

    abstract void run(int length);

    abstract void jump(double height);

    static void showResult(Object obj, boolean result) {
        System.out.println(obj.getClass().getName() + " : " + result);
    }
}
