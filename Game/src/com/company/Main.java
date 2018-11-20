package com.company;

import java.util.Scanner;

public class Main {
    Location attic;
    Location room;
    Location garden;
    Player player;
    Scanner scanner = new Scanner(System.in, "cp1251");

    public static void main(String[] args) {

        new Main(). initLoc();
    }
    public void setLocation(Location location, String name,String description) {
        location.setName(name);
        location.setDescription(description);
    }

    public void initLoc() {
        setLocation(attic,"чердак", "Вы на чердаке старого дома.\nВ углу видна гигантская горелка.\nВниз ведет лестница.\n");
        setLocation(room,"комната", "Вы находитесь в гостиной в доме волшебника.\nА вот и он сам - громко храпит на кровати.\nНа западе от вас есть дверь, рядом - лестница наверх.\n");
        setLocation(garden,"сад", "Вы в прекрасном саду.\nПрямо по курсу находится колодец.\nНа востоке - дверь в дом.\n");
    }
    private void initLocPaths() {
        room.setPaths(new Path[]{
                new Path("запад", garden),
                new Path("наверх", attic)
        });
        attic.setPaths(new Path[]{
                new Path("вниз", room)
        });
        garden.setPaths(new Path[]{
                new Path("восток", room)
        });
    }
    private void initLocItems() {
        attic.inventory.items.toString();
    }
    public void init() {
        initLoc();
    }
    }
