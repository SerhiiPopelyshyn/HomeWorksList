package JC_Lesson1;

import JC_Lesson1.JC2_Lesson1_Competitors.*;
import JC_Lesson1.JC2_Lesson1_Obstacle.*;
public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("Serhii", 3000, 1000, 2),
                new Kitty("Carapka", 1500, 0, 1),
                new Robot("Terminator", 10000, 15, 4),
                new Human("Ruslana", 2300, 1100, 3),
                new Kitty("Fluffy", 2000, 15, 2),
                new Robot("Transformer", 5000, 1500, 5)
        };

        Obstacle[] obstacles = {
                new RunMachine(500),
                new Water(100),
                new Wall(1)
        };

        for (Competitor c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor c:competitors ) {
            c.info();
        }

    }
}
