package com.techreturners.cats;

abstract class AnimalAbstract implements Cat {
    public String eat;
    private String setting;
    private int height;
    private boolean sleeping = false;

    AnimalAbstract(String eat, String setting, int height) {
        this.eat = eat;
        this.setting = setting;
        this.height = height;
    }

    public boolean isAsleep() {
        return this.sleeping;
    }

    public String getSetting() {
        return this.setting;
    }

    public void wakeUp() {
        this.sleeping = false;

    }

    public void goToSleep() {
        this.sleeping = true;
    }

    public int getAverageHeight() {
        return this.height;
    }

    public abstract String eat();

}
