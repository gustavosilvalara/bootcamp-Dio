package Java.abstractwithclassandencapsulation.car.domain;

public class Car {

    private boolean carOn;
    private int acceleration;
    private int gearCar;

    public Car() {
        carOn = false;
        acceleration = 0;
        gearCar = 0;
    }

    public String startTheCar() {
        if (carOn) {
            return "The car is on!!";
        } else {
            carOn = true;
            return "Car on";
        }
    }

    public String turnOffTheCar() {
        if (!carOn) {
            return "The car is off!!";
        } else if (gearCar != 0 && acceleration > 0) {
            return "Put it in neutral gear and stop the accelerator";
        } else {
            carOn = false;
            return "Car off";
        }
    }

    public String accelerate() {
        if (carOn) {
            if (gearCar == 0 && acceleration == 0) {
                return "Engage the first gear";
            }
            if (gearCar == 1 && acceleration >= 0 && acceleration < 20) {
                acceleration++;
                return "Accelerating " + acceleration;
            }else if (gearCar == 1 && acceleration >= 20){
                return "Change the clutch";
            }
            if (gearCar == 2 && acceleration >= 20 && acceleration < 40) {
                acceleration++;
                return "Accelerating " + acceleration;
            }else if (gearCar == 2 && acceleration >= 40){
                return "Change the clutch";
            }
            if (gearCar == 3 && acceleration >= 40 && acceleration < 60) {
                acceleration++;
                return "Accelerating " + acceleration;
            }else if (gearCar == 3 && acceleration >= 60){
                return "Change the clutch";
            }
            if (gearCar == 4 && acceleration >= 60 && acceleration < 80) {
                acceleration++;
                return "Accelerating " + acceleration;
            }else if (gearCar == 4 && acceleration >= 80){
                return "Change the clutch";
            }
            if (gearCar == 5 && acceleration >= 80 && acceleration < 100) {
                acceleration++;
                return "Accelerating " + acceleration;
            }else if (gearCar == 5 && acceleration >= 100){
                return "Change the clutch";
            }
            if (gearCar == 6 && acceleration >= 100 && acceleration <= 120) {
                acceleration++;
                return "Accelerating " + acceleration;
            }else if (gearCar == 6 && acceleration >= 120){
                return "impossible accelerating";
            }

            if (acceleration < 0) {
                return "impossible slow down";
            }
        }
        return "Turn on the car";
    }

    public String slowDown() {
        if (carOn) {
            acceleration--;
            return "Slow down = " + acceleration + "km/h";
        } else {
            return "Turn on car";
        }
    }

    public String left() {
        if (carOn) {
            if (acceleration < 1 || acceleration > 40) {
                return "Adjust velocity";
            } else {
                return "Turning left";
            }
        } else {
            return "Turn on the car";
        }
    }

    public String right() {
        if (carOn) {
            if (acceleration < 1 || acceleration > 40) {
                return "Adjust velocity";
            } else {
                return "Turning Left";
            }
        } else {
            return "Turn on the car";
        }
    }

    public String changeGears() {
        if (carOn) {
            if (gearCar == 0 && acceleration == 0) {
                gearCar = 1;
                return "put in gear 1";
            } else if (gearCar == 1 && acceleration >= 20 && acceleration < 40) {
                gearCar = 2;
                return "put in gear 2";
            } else if (gearCar == 2 && acceleration >= 40 && acceleration < 60) {
                gearCar = 3;
                return "put in gear 3";
            } else if (gearCar == 3 && acceleration >= 60 && acceleration < 80) {
                gearCar = 4;
                return "put in gear 4";
            } else if (gearCar == 4 && acceleration >= 80 && acceleration < 100) {
                gearCar = 5;
                return "put in gear 5";
            } else if (gearCar == 5 && acceleration >= 100 && acceleration < 120) {
                gearCar = 6;
                return "put in gear 6";
            } else {
                return "Impossible gear";
            }

        } else {
            return "Turn on the car";
        }
    }
}
