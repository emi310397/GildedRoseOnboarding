package com.company;

public class ItemFactory {

    public static final String COMMON_ITEM = "commonItem";
    public static final String AGED_BRIE_ITEM = "agedBrieItem";
    public static final String SULFURAS_ITEM = "sulfurasItem";
    public static final String BACKSTAGE_PASSES_ITEM = "bacstagePassesItem";
    public static final String CONJURED_ITEM = "conjuredItem";

    public Item getItem(String type, String name, int quality, int sellIn) throws NonExistentItemException {
        switch (type) {
            case COMMON_ITEM:
                return new CommonItem(name, quality, sellIn);
            case AGED_BRIE_ITEM:
                return new AgedBrieItem(name, quality, sellIn);
            case SULFURAS_ITEM:
                return new SulfurasItem(name, quality);
            case BACKSTAGE_PASSES_ITEM:
                return new BackstagePassesItem(name, quality, sellIn);
            case CONJURED_ITEM:
                return new ConjuredItem(name, quality, sellIn);
            default:
                throw new NonExistentItemException("The item type doesn't exist");
        }
    }
}
