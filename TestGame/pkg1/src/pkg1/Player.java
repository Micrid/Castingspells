/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author begin
 */
public class Player {

    Location currentLocation;
    Inventory inv;

    public Player(Location currentLocation) {
        this.currentLocation = currentLocation;
        inv = new Inventory("Инвентарь");
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void lookAround() {
        System.out.println(currentLocation.getDescription() + "Здесь находятся:" + currentLocation.ItemToString());
    }

    public void move(String direction) {

        boolean isRightDirection = false;

        for (Path path : currentLocation.getPaths()) {
            if (direction.equals(path.getDirection())) {
                currentLocation = path.getLocation();
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
        for (int i = 0; i < currentLocation.items.length; i++) {
            if (currentLocation.items[i] != null) {
                if (currentLocation.items[i].name.equals(itemName)) {
                    inv.setItem(new Item(itemName), i);
                    currentLocation.items[i] = null;
                            takeI=true;
                }

            } 
        }   
        if (takeI==false){
                System.out.println("Здесь нет данного предмета ");
                
            }
    }

    public void drop(String itemName) {

 boolean dropI = false;
//        for (int i = 0; i < inv.items.length; i++) {
//            if (inv.items[i] != null) {
//                if (inv.items[i].name.equals(itemName)) {
//                    inv.items[i] = null;
//                    currentLocation.setItem(new Item(itemName), i);
//                    System.out.println(itemName);
//                    dropI = true;
//                    if (dropI == true) {
//                        break;
//                    }
//                }
//            } else {
//                System.out.println("У вас нет данного предмета ");
//            }
//        }

        for (int i = 0; i < inv.items.length; i++) {
            if (inv.items[i] != null) {
                if (inv.items[i].name.equals(itemName)) {
                    inv.items[i] = null;
                    currentLocation.setItem(new Item(itemName), i);
                    dropI= true;
                }

            }
        }
        if (dropI==false){
                    System.out.println("У вас нет данного предмета ");

                }
    }
}
