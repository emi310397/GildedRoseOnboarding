package com.company;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        createItems();

        showItemsInConsole();

        updateItems();

        System.out.println("--------------------------");

        showItemsInConsole();
    }

    private static void createItems() {
        ItemFactory itemFactory = new ItemFactory();

        try {
            items.add(itemFactory.getItem(ItemFactory.COMMON_ITEM, "common item", 21, 15));
            items.add(itemFactory.getItem(ItemFactory.AGED_BRIE_ITEM, "aged brie", 21, 15));
            items.add(itemFactory.getItem(ItemFactory.BACKSTAGE_PASSES_ITEM, "backstage passes", 21, 15));
            items.add(itemFactory.getItem(ItemFactory.SULFURAS_ITEM, "sulfuras", 15, 0));
            items.add(itemFactory.getItem(ItemFactory.CONJURED_ITEM, "conjured", 21, 15));
            items.add(itemFactory.getItem(ItemFactory.COMMON_ITEM, "common item 2", 21, 15));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void updateItems() {
        for (Item item : items) {
            if (item instanceof Updatable) {
                ((Updatable) item).update();
            }
        }
    }

    private static void showItemsInConsole() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
