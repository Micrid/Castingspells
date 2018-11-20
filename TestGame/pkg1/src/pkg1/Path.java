/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 * Описание пути (направление -> локация)
 */
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
