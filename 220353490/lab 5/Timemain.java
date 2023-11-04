class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public Time add(Time otherTime) {
        Time sumTime = new Time();

        sumTime.seconds = this.seconds + otherTime.seconds;
        sumTime.minutes = this.minutes + otherTime.minutes + sumTime.seconds / 60;
        sumTime.hours = this.hours + otherTime.hours + sumTime.minutes / 60;

        sumTime.seconds %= 60;
        sumTime.minutes %= 60;
        sumTime.hours %= 24;

        return sumTime;
    }
}

public class Timemain {
    public static void main(String[] args) {
        Time time1 = new Time();  
        Time time2 = new Time(10, 30, 45); 

        System.out.println("Time 1:");
        time1.displayTime();

        System.out.println("Time 2:");
        time2.displayTime();

        Time sumTime = time1.add(time2);

        System.out.println("Sum of Time 1 and Time 2:");
        sumTime.displayTime();
    }
}
