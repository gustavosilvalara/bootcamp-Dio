package Java.inheritanceandpolymorphism.clock.domain;

public non-sealed class BRLClock extends  Clock{



    @Override
    Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock -> this.hour = (usClock.getPeriod().equals("PM")) ?
                                    usClock.getHour() + 12 :
                                    usClock.getHour();

            case BRLClock brlClock -> this.hour = brlClock.getHour();

        }
        return this;
    }

}
