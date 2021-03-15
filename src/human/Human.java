package human;

import participant.Participant;

public class Human implements Participant {

    private final String name;
    private final int maxDistance;
    private final double maxJumpHeight;

    public Human(String name, int maxDistance, double maxJumpHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        boolean result = distance <= this.maxDistance;
        System.out.println(this.name + (result ? " пробежал " : " не может пробежать ") + distance + "м.");
        return result;
    }

    @Override
    public boolean jump(int height) {
        boolean result = height <= this.maxJumpHeight;
        System.out.println(this.name + (result ? " прыгнул на " : " не может прыгнуть на ") + height + "м.");
        return result;
    }
}
