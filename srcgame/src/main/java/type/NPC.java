/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type;

/**
 *
 * @author giaco
 */
public class NPC {
    private int id;
    
    private String name;
    
    private String surname;
    
    private String description; //show when you click on the object
    
    private Room position = null;
    
    private boolean clickable;

    //For primary character
    public NPC(int id, String name, String surname, String description, boolean clickable) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.clickable = clickable;
        
    }
    
    //For servant character

    public NPC(int id, String description, boolean clickable) {
        this.id = id;
        this.description = description;
        this.clickable = clickable;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setPosition( Room position){
        this.position = position;
    }
    
    public Room getPosition (Room position){
        return position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isClickable() {
        return clickable;
    }

    public void setClickable(boolean clickable) {
        this.clickable = clickable;
    }
    
}
