package com.techreturners.cats;

public class LionCat extends AnimalAbstract {
    LionCat() {
        super("Roar!!!!", "wild", 1100);
    }

    @Override
    public String eat() {
        return this.eat;
    }

}

