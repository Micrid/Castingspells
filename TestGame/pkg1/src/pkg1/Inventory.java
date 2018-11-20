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
public class Inventory {

    private String name;
    public Item[] items;

    public void setItem(Item[] item) {
        this.items = item;
    }

    public Item[] getItem() {
        return items;
    }

    public String ItemToString() {
        String Its = "";
        
        if (items==null){
        System.out.println("У вас ничего нет.");}
        else{
        for (int i = 0; i < items.length; i++) {
            if (items[i]!=null){
                Its = Its + items[i].name;

            if ((i<items.length-1)&(items[i]!=null)) {
                Its = Its + ", ";}
            }
        }
        }
        return Its;
        
    }
    Inventory(String name) {
        this.name = name;
        items = new Item[5];
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setItem(Item item, int index) {
        items[index] = item;
    }
}
