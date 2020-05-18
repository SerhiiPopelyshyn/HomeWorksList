package JC_Lesson1.JC2_Lesson1_Obstacle;

import JC_Lesson1.JC2_Lesson1_Competitors.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}