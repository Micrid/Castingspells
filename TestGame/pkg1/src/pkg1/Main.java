package pkg1;

import java.util.Scanner;

public class Main {

    Location currentLocation;
    Location attic;
    Location room;
    Location garden;
    
    Player player;
    Scanner scanner = new Scanner(System.in, "cp1251");

    public static void main(String[] args) {
        new Main().init();

    }

    public void setLocations() {

        attic = new Location("чердак", "Вы на чердаке старого дома.\nВ углу видна гигантская горелка.\nВниз ведет лестница.\n");
        room = new Location("комната", "Вы находитесь в гостиной в доме волшебника.\nА вот и он сам - громко храпит на кровати.\nНа западе от вас есть дверь, рядом - лестница наверх.\n");
        garden = new Location("сад", "Вы в прекрасном саду.\nПрямо по курсу находится колодец.\nНа востоке - дверь в дом.\n");

    }

    public void init() {

        setLocations();
        setLocationsPaths();
        setItems();
        player = new Player(room);
//        bucket = new Item("ведро");
//        whisky = new Item("бутылка виски");
//        nothing = new Item("");
//        frog = new Item("лягушка");
//        chain = new Item("цепь");
//        room.setItem(bucket, 0);
//        room.setItem(whisky, 1);
//        attic.setItem(nothing, 4);
//        garden.setItem(frog, 2);
//        garden.setItem(chain, 3);

        System.out.println(player.currentLocation.getDescription());
        start();

    }

    private void setItems() {

        room.setItem(new Item("ведро"),0);
        room.setItem(new Item("виски"),1);

        
        attic.setItem(new Item(""),4);

        garden.setItem(new Item("лягушка"),2);
        garden.setItem(new Item("цепь"),3);
};
    

    private void setLocationsPaths() {

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

    public void start() {

        
        boolean isDone = false;
        while (!isDone) {
            System.out.print("Введите команду\n" + ">");
            switch (scanner.next()) {

                case "закончить":
                    isDone = true;
                    break;
                case "осмотреться":
                    player.lookAround();
                    break;
                case "инвентарь":
                    System.out.println("Здесь находятся:" + player.inv.ItemToString());
                    break;
                case "взять":
                    player.take(scanner.next());
                    break;
                case "бросить":
                    player.drop(scanner.next());
                    break;
                case "идти":
                    String direction = scanner.next();
                    player.move(direction);
                    break;
                default:
                    System.out.println("Недопустимая команда.");
            }
        }

    }

}
