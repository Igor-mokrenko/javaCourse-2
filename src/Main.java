import cat.Cat;
import daysOfWeek.DaysOfWeek;
import human.Human;
import obstacle.Obstacle;
import participant.Participant;
import robot.Robot;
import runningTrack.RunningTrack;
import wall.Wall;

public class Main {

    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Bill", 100, 1),
                new Robot("Tetris", 10, 5),
                new Cat("Good boy", 20, 2)
        };

        Obstacle[] obstacles = {
                new Wall(2),
                new RunningTrack(10)
        };

        startChallenge(participants, obstacles);
        System.out.println(getWorkingHours(DaysOfWeek.Monday));
        System.out.println(getWorkingHours(DaysOfWeek.Friday));
        System.out.println(getWorkingHours(DaysOfWeek.Sunday));
    }

    static void startChallenge(Participant[] participants, Obstacle[] obstacles) {
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.isPossible(participant)) break;
            }
        }
    }

    static String getWorkingHours(DaysOfWeek dayOfWeek) {
        final int workingDaysCount = 5;

        if (dayOfWeek.getDayCount() > 5) return "Сегодня выходной!.";

        final int workingDayHours = 8;
        final int restWorkingHours = (workingDaysCount - (dayOfWeek.getDayCount() - 1)) * workingDayHours;

        return "Осталось работать " + restWorkingHours + " часов.";
    }

}
