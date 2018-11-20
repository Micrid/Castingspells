package com.company;

import java.util.List;

public class Inventory {


    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> items;

    public void add(String name, String description,boolean moveable) {
        Item item=new Item();
        item.setName(name);
        item.setDescription(description);
        item.setMoveable(moveable);
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
        Item item=new Item();
        if (items == null) {
            return "Ничего нет.";
        } else {
            return item.getName();
        }
    }
}