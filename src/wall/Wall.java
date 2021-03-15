package wall;

import obstacle.Obstacle;
import participant.Participant;

public class Wall extends Obstacle {

    public Wall(int height) {
        super(height);
    }

    @Override
    public boolean isPossible(Participant participant) {
        return participant.jump(super.value);
    }
}
