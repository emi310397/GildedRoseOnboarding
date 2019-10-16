package com.company;

public class CommonItem extends Item implements Updatable {

    protected final int SIMPLE_DEGRADATION = -1;
    protected final int DOUBLE_DEGRADATION = -2;

    protected int sellIn;

    public CommonItem(String name, int quality, int sellIn) {
        super(name, quality);
        this.sellIn = sellIn;
    }

    @Override
    public String toString() {
        return super.toString() + ", sell in: " + this.sellIn + " day/s";
    }

    @Override
    public void update() {
        if (sellIn > 0) {
            updateQuality(SIMPLE_DEGRADATION);
        } else {
            updateQuality(DOUBLE_DEGRADATION);
        }
        sellIn--;
    }

    /*Updates the quality of the item by the "value" parameter.
    * the value cannot be less than the MINUMUM_QUALITY value and
    * no more than the MAXIMUM_QUALITY value*/
    protected void updateQuality(int value) {
        if ((quality + value) <= MINIMUM_QUALITY) {
            quality = MINIMUM_QUALITY;
        } else if ((quality + value) >= MAXIMUM_QUALITY) {
            quality = MAXIMUM_QUALITY;
        } else {
            quality += value;
        }
    }
}
