package pkg1;

public class Location {

    public String name;
    public String description;
    public Item[] items;
    public Path[] paths;

    public void setItem(Item[] item) {
        this.items = item;
    }

    public Item[] getItem() {
        return items;
    }

    public String ItemToString() {
        String Its = "";
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if (items[i] != null) {
                    Its = Its + items[i].name;
                }
                if ((items[i] != null)) {
                    if ((i < items.length - 1)) {
                        Its = Its + ", ";
                    }
                }
            }
        }
        return Its;
    }

    Location(String name, String description) {
        this.name = name;
        this.description = description;
        items = new Item[5];
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setItem(Item item, int index) {
        items[index] = item;
    }

    public void setPaths(Path[] directions) {
        this.paths = directions;
    }

    public Path[] getPaths() {
        return paths;
    }
}
