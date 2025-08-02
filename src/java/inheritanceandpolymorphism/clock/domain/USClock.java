package java.inheritanceandpolymorphism.clock.domain;

public non-sealed class USClock extends Clock{

    private String period;

    public String getPeriod(){
        return period;
    }

    public void setAfterMidday(){
        this.period = "PM";
    }

    public void setBeforeMidday(){
        this.period = "AM";
    }


    @Override
    public void setHour(int hour) {
        if (hour >= 12 && hour <= 23){
            setAfterMidday();
            this.hour = hour - 12;
        }else if (hour >= 24){
            setBeforeMidday();
            this.hour = 0;
        }else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock ->{
                this.hour = usClock.getHour();
                this.period = usClock.getPeriod();
            }

            case BRLClock brlClock -> this.setHour(brlClock.getHour());


        }
        return this;
    }
}
