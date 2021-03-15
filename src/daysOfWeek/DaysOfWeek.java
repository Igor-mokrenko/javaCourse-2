package daysOfWeek;

public enum DaysOfWeek {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    private final int dayCount;

    DaysOfWeek(int dayCount){
        this.dayCount = dayCount;
    }

    public int getDayCount() {
        return this.dayCount;
    }
}
