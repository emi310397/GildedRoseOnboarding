package com.company;

public class BackstagePassesItem extends CommonItem {

    protected final int SIMPLE_INCREASE = 1;
    protected final int DOUBLE_INCREASE = 2;
    protected final int TRIPLE_INCREASE = 3;

    public BackstagePassesItem(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void update() {
        if (sellIn > 10) {
            updateQuality(SIMPLE_INCREASE);
        } else if (sellIn > 5) {
            updateQuality(DOUBLE_INCREASE);
        } else if (sellIn > 0) {
            updateQuality(TRIPLE_INCREASE);
        } else {
            setQuality(0);
        }
        sellIn--;
    }
}
