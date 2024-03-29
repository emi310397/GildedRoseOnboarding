package com.company;

public class ConjuredItem extends CommonItem {

    protected final int QUADRUPLE_DEGRADATION = -4;

    public ConjuredItem(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void update() {
        if (sellIn > 0) {
            updateQuality(DOUBLE_DEGRADATION);
        } else {
            updateQuality(QUADRUPLE_DEGRADATION);
        }
        sellIn--;
    }
}
