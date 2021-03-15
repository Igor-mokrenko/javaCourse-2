package runningTrack;

import obstacle.Obstacle;
import participant.Participant;

public class RunningTrack extends Obstacle {

    public RunningTrack(int distance) {
        super(distance);
    }

    @Override
    public boolean isPossible(Participant participant) {
        return participant.run(this.value);
    }
}
