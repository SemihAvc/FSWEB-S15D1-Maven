package org.example.models;

import java.util.ArrayList;
import java.util.Collections;

public class Grocery {
    public static ArrayList<String> groceryList;

    public Grocery() {
        groceryList = new ArrayList<>();
    }

    public static void addItems(String items) {
        String[] splitItems = splitItem(items);
        for (String item : splitItems) {
            String trimmedItem = item.trim();
            if (checkItemIsInList(trimmedItem)) {
                System.out.println(trimmedItem + " already exists");
            } else {
                Grocery.groceryList.add(trimmedItem);
            }
        }
        sortItems();
    }

    public static void removeItems(String items) {
        String[] splitItems = splitItem(items);
        for (String item : splitItems) {
            String trimmedItem = item.trim();
            if (!checkItemIsInList(trimmedItem)) {
                System.out.println(trimmedItem + " does not exist in the list");
            } else {
                Grocery.groceryList.remove(trimmedItem);
            }
        }
    }

    public static void printSorted() {
    }

    private static void sortItems() {
        Collections.sort(groceryList);
    }

    private static boolean checkItemIsInList(String trimmedItem) {
        return groceryList.contains(trimmedItem);
    }

    private static String[] splitItem(String items) {
        return items.split(",");
    }

    public void printedSorted() {
        System.out.println("Mevcut pazar listesi:");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }
}
