/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import type.NPC;

/**
 *
 * @author tom
 */
public class ActionHandler1 extends ActionHandler {

    GameHandler gh;

    //TODO SPOSTARE DA QUA, metterli in DAY 1
    NPC dolly, j_marple, corpse, lorrimer, a_bantry, haydock, b_blake = new NPC();
    List<String> D_bantry, Jane_marple, Lorri, Corp, Arthur, Doc, Basil = new ArrayList<>();

    public ActionHandler1(GameHandler gh) {
        this.gh = gh;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String eventCommand = e.getActionCommand();

        switch (eventCommand) {
            case "goToCorridorFromDRoom":
                gh.day.goToSceneXtoY(1, 2);  //DINING ROOM -> CORRIDOIO INF.
                break;

            case "WestRoomCorridor1":
                gh.day.goToSceneXtoY(2, 1);  //CORRIDOIO INF -> DINING ROOM
                break;

            case "EastRoomCorridor1":
                gh.day.goToSceneXtoY(2, 3);  //LIVING ROOM
                break;

            case "goToCorridorFromLRoom":
                gh.day.goToSceneXtoY(3, 2); //LIVING ROOM -> CORRIDOIO
                break;

            case "StaircaseUP1":
                gh.day.goToSceneXtoY(2, 4); //CORRIDOIO INF -> SUP
                break;

            case "StaircaseDown1":
                gh.day.goToSceneXtoY(4, 2); //CORRIDOIO SUP -> INF
                break;

            case "WestRoomCorridor2":
                gh.day.goToSceneXtoY(4, 5);  //STUDY
                break;

            case "EastRoomCorridor2":
                gh.day.goToSceneXtoY(4, 6); //LIBRARY
                break;

            case "goToCorridorFromStudy":
                gh.day.goToSceneXtoY(5, 4); //STUDIO -> CORRIDOIO SUP.
                break;

            case "goToCorridorFromLibrary":
                gh.day.goToSceneXtoY(6, 4); //LIBRARY -> CORRIDOIO SUP.
                break;

            case "goToHotel":
                gh.day.goToSceneXtoY(2, 7);
                break;

            case "openInventory":
                gh.form.inv.setVisible(true);
                break;

            case "continueTextScene1":
                gh.day.closeTextBox(1);
                break;

            case "continueTextScene2":
                gh.day.closeTextBox(2);
                break;

            case "continueTextScene3":
                gh.day.closeTextBox(3);
                break;

            case "continueTextScene4":
                gh.day.closeTextBox(4);
                break;

            case "continueTextScene5":
                gh.day.closeTextBox(5);
                break;

            case "continueTextScene6":
                gh.day.closeTextBox(6);
                break;

            case "continueDialog1":
                gh.day.continueDialogue(1);
                break;

            case "continueDialog2":
                gh.day.continueDialogue(2);
                break;

            case "continueDialog3":
                gh.day.continueDialogue(3);
                break;

            case "continueDialog5":
                gh.day.continueDialogue(5);
                break;

            case "continueDialog6":
                gh.day.continueDialogue(6);
                break;

            case "ObserveDiningRoom":
                gh.day.observeSceneX(2, "Da qui sembra portare alla sala da pranzo di Gossington Hall.");
                break;

            case "ObserveLivingRoom":
                gh.day.observeSceneX(2, "Da qui sembra portare al soggiorno.");
                break;

            case "ObserveStudy":
                gh.day.observeSceneX(4, "Questo sembra essere lo studio del signor Bantry.");
                break;

            case "ObserveLibrary":
                gh.day.observeSceneX(4, "Di qui c'è l'imponente biblioteca di Gossington Hall.");
                break;

            case "ObserveDolly":
                gh.day.observeNPC(1, dolly, "d_bantry");
                break;

            case "TalkDolly": 
                try {
                gh.day.talkNPC(1, "d_bantry.txt", D_bantry, "/IconDollyB.png", "d_bantry", true, this);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            break;

            case "scelta1d_bantry": 
                try {
                gh.day.choice1(1, "d_bantry", "d_bantry.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }

            break;

            case "scelta2d_bantry": 
                try {
                gh.day.choice2(1, "d_bantry", "d_bantry.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }

            break;

            case "scelta3d_bantry": 
                try {
                gh.day.choice3(1, "d_bantry", "d_bantry.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }

            break;

            case "scelta4d_bantry": 
                try {
                gh.day.choice4(1, "d_bantry", "d_bantry.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "ObserveJane":
                gh.day.observeNPC(1, j_marple, "j_marple");
                break;

            case "TalkJane": 
                try {
                gh.day.talkNPC(1, "j_marple.txt", Jane_marple, "/IconMarple.png", "j_marple", false, this);
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta1j_marple": 
                try {
                gh.day.choice1(1, "j_marple", "j_marple.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta2j_marple": 
                try {
                gh.day.choice2(1, "j_marple", "j_marple.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta3j_marple": 
                try {
                gh.day.choice3(1, "j_marple", "j_marple.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta4j_marple": 
                try {
                gh.day.choice4(1, "j_marple", "j_marple.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "ObserveLorrimer":
                gh.day.observeNPC(3, lorrimer, "lorrimer");
                break;

            case "TalkLorrimer": 
                try {
                gh.day.talkNPC(3, "lorrimer.txt", Lorri, "/IconLorrimer.png", "lorrimer", true, this);
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta1lorrimer": 
                try {
                gh.day.choice1(3, "lorrimer", "lorrimer.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta2lorrimer": 
                try {
                gh.day.choice2(3, "lorrimer", "lorrimer.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta3lorrimer": 
                try {
                gh.day.choice3(3, "lorrimer", "lorrimer.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta4lorrimer": 
                try {
                gh.day.choice4(3, "lorrimer", "lorrimer.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "ObserveBasil":
                gh.day.observeNPC(5, b_blake, "b_blake");
                break;

            case "TalkBasil": 
                try {
                gh.day.talkNPC(5, "b_blake.txt", Basil, "/IconBlake.png", "b_blake", true, this);
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta1b_blake": 
                try {
                gh.day.choice1(5, "b_blake", "b_blake.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta2b_blake": 
                try {
                gh.day.choice2(5, "b_blake", "b_blake.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta3b_blake": 
                try {
                gh.day.choice3(5, "b_blake", "b_blake.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta4b_blake": 
                try {
                gh.day.choice4(5, "b_blake", "b_blake.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "ObserveABantry":
                gh.day.observeNPC(5, a_bantry, "a_bantry");
                break;

            case "TalkABantry": 
                try {
                gh.day.talkNPC(5, "a_bantry.txt", Arthur, "/IconArthur.png", "a_bantry", false, this);
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta1a_bantry": 
                try {
                gh.day.choice1(5, "a_bantry", "a_bantry.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }

            break;

            case "scelta2a_bantry": 
                try {
                gh.day.choice2(5, "a_bantry", "a_bantry.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }

            break;

            case "scelta3a_bantry": 
                try {
                gh.day.choice3(5, "a_bantry", "a_bantry.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }

            break;

            case "scelta4a_bantry": 
                try {
                gh.day.choice4(5, "a_bantry", "a_bantry.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "ObserveHaydoc":
                gh.day.observeNPC(6, haydock, "haydock");
                break;

            case "TalkHaydoc": 
                try {
                gh.day.talkNPC(6, "haydock.txt", Doc, "/IconDoc.png", "haydock", false, this);
                gh.day1.takeAutopsy();

            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta1haydock": 
                try {
                gh.day.choice1(6, "haydock", "haydock.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }

            break;

            case "scelta2haydock": 
                try {
                gh.day.choice2(6, "haydock", "haydock.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta3haydock": 
                try {
                gh.day.choice3(6, "haydock", "haydock.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "scelta4haydock": 
                try {
                gh.day.choice4(6, "haydock", "haydock.txt");
            } catch (IOException ex) {
                Logger.getLogger(ActionHandler1.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;

            case "ObserveBody":
                gh.day.observeNPC(6, corpse, "corpse");
                break;

            case "AnalizeBody":
                gh.day1.analizeBody();
                break;

        }
    }
}
