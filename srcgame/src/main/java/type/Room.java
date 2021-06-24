/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type;

import java.util.ArrayList;
import java.util.List;
import utility.Floor;

/**
 *
 * @author rino
 */
public class Room {

    private final int id;

    private String name;

    private String description;

    //private String look;

    private boolean visible = true;

    private Room south = null;

    private Room north = null;

    private Room east = null;

    private Room west = null;
    
    private Floor floor = null;
    
    private final List<VarObject> objects=new ArrayList<>();

    public Room(int id,String description) {
        this.id = id;
        this.description = description;
    }

    public Room(int id, String name, String description,Floor floor) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public List<VarObject> getObjects() {
        return objects;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
    

  

}