package JC_Lesson1.JC2_Lesson1_Obstacle;

import JC_Lesson1.JC2_Lesson1_Competitors.Competitor;

public class Water extends Obstacle {
    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(dist);
    }
}
