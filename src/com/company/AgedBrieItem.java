package com.company;

public class AgedBrieItem extends CommonItem {

    protected final int SIMPLE_INCREASE = 1;

    public AgedBrieItem(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void update() {
        updateQuality(SIMPLE_INCREASE);
        sellIn--;
    }
}
