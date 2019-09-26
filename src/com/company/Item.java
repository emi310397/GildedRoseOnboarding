package com.company;

public abstract class Item{

    protected final int MINIMUM_QUALITY = 0;
    protected final int MAXIMUM_QUALITY = 50;

    protected String name;
    protected int quality;

    public Item(String name, int quality) {
        this.name = name;
        this.quality = quality;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getQuality() {
        return quality;
    }

    protected void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", quality: " + this.quality;
    }
}
