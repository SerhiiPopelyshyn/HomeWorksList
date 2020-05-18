package JC_Lesson1.JC2_Lesson1_Obstacle;

import JC_Lesson1.JC2_Lesson1_Competitors.Competitor;

public class RunMachine extends Obstacle {

    private int dist;
    private Competitor competitor;

    public RunMachine(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        this.competitor = competitor;
        competitor.run(dist);
    }
}

