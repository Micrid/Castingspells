package com.company;

public class Location {
    public String name;
    Inventory inventory;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String description;
    public Path[] paths;
    public Path[] getPaths() {
        return paths;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public void setPaths(Path[] directions) {
        this.paths = directions;
    }

}
