package com.company;

public class AgedBrieItem extends CommonItem {

    protected final int SIMPLE_INCREASE = 1;

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        updateQuality(SIMPLE_INCREASE);
        sellIn--;
    }
}
