package JC_Lesson1.JC2_Lesson1_Competitors;

public interface Competitor {
    void run(int dist);
    void swim(int dist);
    void jump(int height);
    boolean isOnDistance();
    void info();
}
