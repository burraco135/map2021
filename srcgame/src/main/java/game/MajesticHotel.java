/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import db.DataHandler;
import static game.Main.listItem;
import type.NPC;

import java.io.IOException;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import type.Item;

/**
 *
 * @author giaco
 */
public class MajesticHotel extends DayDescription {

    public MajesticHotel(GameHandler gh) {
        super(gh);
    }

    NPC person = new NPC();
    Item element = new Item();
    List<String> Prestcot, J_Turner, Ramon, Jeff, Mark = new ArrayList<>();

    public void takeDanceDress() {
        gh.inv.getItem_3().setVisible(true);
        gh.inv.getItem_3().setIcon(new ImageIcon(getClass().getResource("/dressDance.png")));
        gh.inv.getItem_3().setText("");
        element = DataHandler.ItemFinder(listItem, "ball_dress");
        gh.getPlayer().addToInventory(element);

        gh.inv.getItem_4().setVisible(true);
        gh.inv.getItem_4().setIcon(new ImageIcon(getClass().getResource("/nail.png")));
        gh.inv.getItem_4().setText("");
        element = DataHandler.ItemFinder(listItem, "broken_nail");
        gh.getPlayer().addToInventory(element);

    }

    public void takeAdoptionDoc() {
        gh.inv.getItem_5().setVisible(true);
        gh.inv.getItem_5().setIcon(new ImageIcon(getClass().getResource("/doc_adozione.png")));
        gh.inv.getItem_5().setText("");

        element = DataHandler.ItemFinder(listItem, "adoption_doc");
        gh.getPlayer().addToInventory(element);
    }

    public void takeBillDoc() {
        gh.inv.getItem_6().setVisible(true);
        gh.inv.getItem_6().setIcon(new ImageIcon(getClass().getResource("/doc_estrattoConto.png")));
        gh.inv.getItem_6().setText("");

        element = DataHandler.ItemFinder(listItem, "mark_bill");
        gh.getPlayer().addToInventory(element);

        gh.form.setVisibleObject(12, 15, false);

    }

    public synchronized void knockRoom() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Clip clip = AudioSystem.getClip();
                AudioInputStream inputStream = AudioSystem.getAudioInputStream(MajesticHotel.this.getClass().getClassLoader().getResource("Knocking-on-door.wav"));
                clip.open(inputStream);
                clip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                System.err.println(e.getMessage());
                return;
            }
            gh.form.textBox[10].setVisible(true);
            gh.form.textAreaBox[10].setVisible(true);
            gh.form.textButton[10].setVisible(true);
            gh.form.textAreaBox[10].setText("Prego, chiunque lei sia può entrare, se una bella ragazza anche ben volentieri.");
        });
        t1.start();  
        
        State s = t1.getState();
        
        System.out.println("prima: " + s.name());
        
        if (t1.isAlive()) {            
            Thread.currentThread().interrupt(); 
            System.out.println("dopo interr: " + s.name());
        }
    }
}