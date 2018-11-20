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
                int id = location.inventory.find(itemName);
                    if (id!=-1) {
                        Item  item = location.inventory.items.get(location.inventory.find(itemName));
                        inventory.add(item.getName(),item.getDescription(),item.getMoveable());
                        location.inventory.items.remove(id);
            }
            else {
                System.out.println("Здесь нет данного предмета ");

            }
        }



    public void inventory() {
        inventory.show();
    }
}
