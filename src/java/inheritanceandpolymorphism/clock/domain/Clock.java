package java.inheritanceandpolymorphism.clock.domain;

public sealed abstract class Clock permits BRLClock, USClock {

    protected int hour;

    protected int minute;

    protected int second;


    protected int getHour() {
        return hour;
    }

    protected void setHour(int hour) {
        if (hour >= 24){
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    protected int getMinute() {
        return minute;
    }

    protected void setMinute(int minute) {
        if (minute >= 60){
            this.minute = 60;
            return;
        }
        this.minute = minute;
    }

    protected int getSecond() {
        return second;
    }

    protected void setSecond(int second) {
        if (second >= 60){
            this.second = 60;
            return;
        }
        this.second = second;
    }

    abstract Clock convert(Clock clock);

}
