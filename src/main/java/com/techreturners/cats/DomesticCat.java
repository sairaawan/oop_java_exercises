package com.techreturners.cats;

public class DomesticCat implements Cat {

    private boolean sleeping = false;

    public boolean isAsleep() {
        return this.sleeping;
    }

    public String getSetting() {
        return "domestic";
    }

    public void wakeUp() {
        this.sleeping = false;

    }

    public void goToSleep() {
        this.sleeping = true;
    }

    public int getAverageHeight() {
        return 23;
    }

    public String eat() {
        return "Purrrrrrr";
    }
}
