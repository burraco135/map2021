
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package type;

/**
 *
 * @author ester
 */
public class Map {
    private int id;
    private String name;
    private String description;
    private int chapter;
    
    public Map(int id, String name, String description, int chapter) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.chapter = chapter;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setChapter(int chapter) {
        this.chapter = chapter;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getChapter() {
        return chapter;
    }
}