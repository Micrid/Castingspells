package com.company;

public class Path
{
    private String direction;   // Имя направления, куда можно идти
    private Location location;  // Локация, в которую можно перейти

    public Path(String direction, Location location)
    {
        this.direction = direction;
        this.location = location;
    }

    public String getDirection()
    {
        return direction;
    }

    public Location getLocation()
    {
        return location;
    }
}

