package com.company;

import java.util.ArrayList;

public class Main {

    static ArrayList<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        createItems();

        showItemsInConsole();

        updateItems();

        showItemsInConsole();
    }

    public static void createItems() {
        items.add(new CommonItem("common item", 21, 15));
        items.add(new AgedBrieItem("aged brie", 21, 15));
        items.add(new BackstagePassesItem("backstage passes", 21, 15));
        items.add(new SulfurasItem("sulfuras", 15));
        items.add(new ConjuredItem("conjured", 21, 15));
        items.add(new CommonItem("common item 2", 21, 15));
    }

    public static void updateItems() {
        for (Item item : items) {
            if (item instanceof Updatable){
                ((Updatable) item).update();
            }
        }
    }

    public static void showItemsInConsole() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
