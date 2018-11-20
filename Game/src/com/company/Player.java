package com.company;

public class Player {
    Location location;
    Inventory inventory;

    public void lookAround() {
        System.out.println(location.getDescription().toString() + "Здесь находятся:" + location.inventory.show());
    }

    public void go(String direction) {

        boolean isRightDirection = false;

        for (Path path : location.getPaths()) {
            if (direction.equals(path.getDirection())) {
                location = path.getLocation();
                isRightDirection = true;
                lookAround();
                break;
            }
        }

        if (!isRightDirection) {
            System.out.println("Вы не можете туда пойти.");
        }
    }
    public void take(String itemName) {
        boolean takeI = false;
        for (int i = 0; i < location.inventory.show().length(); i++) {
            if (location.inventory.items != null) {
                if (location.inventory.find(itemName)!=-1) {
                    inventory.add(location.inventory.items.get(location.inventory.find(itemName)));
                    location.inventory.remove(itemName);
                    takeI=true;
                }
            }
        }
        if (takeI==false){
            System.out.println("Здесь нет данного предмета ");

        }
    }



    public void inventory() {
        inventory.show();
    }
}
