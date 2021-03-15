package obstacle;

import participant.Participant;

abstract public class Obstacle {
    protected final int value;

    public Obstacle(int value) {
        this.value = value;
    }

    public abstract boolean isPossible(Participant participant);
}
