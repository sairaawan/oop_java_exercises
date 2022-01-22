package com.techreturners.cats;

public class DomesticCat extends AnimalAbstract {
    DomesticCat() {
        super("Purrrrrrr", "domestic", 23);
    }

    @Override
    public String eat() {
        return this.eat;
    }
}
