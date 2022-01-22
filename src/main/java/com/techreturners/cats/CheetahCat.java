package com.techreturners.cats;

public class CheetahCat extends AnimalAbstract {
    CheetahCat() {
        super("Zzzzzzz", "wild", 1100);
    }

    @Override
    public String eat() {
        return this.eat;
    }
}
