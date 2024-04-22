public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid time values");
        }
        this.hour = hour;
        this.minute = minute;
    }

    public Time add(Time other) {
        int totalMinutes = this.minute + other.minute;
        int extraHours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        int totalHours = this.hour + other.hour + extraHours;
        int wrappedHours = totalHours % 24;
        return new Time(wrappedHours, remainingMinutes);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}