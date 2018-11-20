package com.company;

import java.util.List;

public class Inventory {


    public List<Item> items;

    public void add(Item item) {
        items.add(item);
    }
    public int find(String itemName){
        return items.indexOf(items.contains(itemName));
        }

    public void remove(String itemName) {
        if (find(itemName) != -1) {
            items.remove(find(itemName));
        } else {
            System.out.println("Такого предмета здесь нет");
        }
    }

    public  String show() {
        String Its = "";

        if (items == null) {
            return "Ничего нет.";
        } else {
            return items.toString();
        }
    }
}