/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import db.DataHandler;
import db.DialogHandler;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import static game.Main.listRoom;
import static game.Main.listNPC;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import type.NPC;
import type.Room;

/**
 *
 * @author tom
 */
public class Day2_Form extends javax.swing.JFrame {

    Day1 d1;
    int i=0; //va avanti dialoghi
    NPC dolly,j_marple,corpse,lorrimer,a_bantry,haydock,b_blake = new NPC();
    Room ballRoom,hallwayHM,reception,jeffersonRoom,balcony = new Room();
    File file = new File(DialogHandler.dir + "\\src\\main\\resources\\dialogs\\a_bantry.txt");
    //TODO spostare in DAY1
    ActionHandler2 actHandler = new ActionHandler2(this);
    InventoryDialog inv = new InventoryDialog(this, true);

    /**
     * Creates new form Day1_Form
     */
    public JPanel bgPanel[] = new JPanel[20];
    public JLabel bgLabel[] = new JLabel[20];

    //TODO FORSE si può fare senza creare array e creandoli manualmente ogni scena, come il BACKPACK         
    public JLabel textBox[] = new JLabel[10];
    public JTextArea textAreaBox[] = new JTextArea[10];
    public JTextArea textAreaBox2[] = new JTextArea[10];
    public JButton textButton[] = new JButton[10];
    public JButton continueDialogue[] = new JButton[10];
    public JRadioButton dialogueButton1[] = new JRadioButton[10];
    public JRadioButton dialogueButton2[] = new JRadioButton[10];
    public JRadioButton dialogueButton3[] = new JRadioButton[10];
    public JRadioButton dialogueButton4[] = new JRadioButton[10];

    public JRadioButton dialogue2Button1[] = new JRadioButton[10];
    public JRadioButton dialogue2Button2[] = new JRadioButton[10];
    public JRadioButton dialogue2Button3[] = new JRadioButton[10];
    public JRadioButton dialogue2Button4[] = new JRadioButton[10];

    public Day2_Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        continua2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        background2.setBackground(new java.awt.Color(0, 0, 0));
        background2.setForeground(new java.awt.Color(255, 255, 255));
        background2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Lussoso Hotel dove è rinvenuto il secondo cadavere");
        jTextField1.setBorder(null);
        background2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Californian FB", 3, 48)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("St. Mary Mead,   Ottobre 1982");
        jTextField2.setToolTipText("");
        jTextField2.setBorder(null);
        background2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 677, -1));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Californian FB", 1, 48)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Majestic Hotel");
        jTextField3.setBorder(null);
        background2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 329, -1));

        continua2.setBackground(new java.awt.Color(0, 0, 0));
        continua2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        continua2.setForeground(new java.awt.Color(255, 255, 255));
        continua2.setText("Continua");
        continua2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        continua2.setContentAreaFilled(false);
        continua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continua2ActionPerformed(evt);
            }
        });
        background2.add(continua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 600, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, 1587, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continua2ActionPerformed
        generateScenes();
        background2.setVisible(false);
        bgPanel[1].setVisible(true);
    }//GEN-LAST:event_continua2ActionPerformed

    //TODO SPOSTARE IN DAY 2
    public void goToScene1() {          //RECEPTION
        bgPanel[2].setVisible(false);
        bgPanel[1].setVisible(true);
    }

    public void goToScene2FromScene1() {//REC -> HALL
        bgPanel[1].setVisible(false);
        bgPanel[2].setVisible(true);
    }

    public void goToScene2FromScene3() {//CORRIDOIO SUP -> HALL
        bgPanel[3].setVisible(false);
        bgPanel[2].setVisible(true);
    }

    public void goToScene3FromScene2() {//HALL -> CORRIDOIO SUP
        bgPanel[2].setVisible(false);
        bgPanel[3].setVisible(true);
    }

    public void goToScene4FromScene3() {//CORRIDOIO SUP -> CAMERA LETTO
        bgPanel[3].setVisible(false);
        bgPanel[4].setVisible(true);
    }

    public void goToScene3FromScene4() {//CAMERA LETTO -> CORRIDOIO SUP
        bgPanel[4].setVisible(false);
        bgPanel[3].setVisible(true);
    }

    public void goToScene5() {          //CAMERA LETTO -> VERANDA
        bgPanel[4].setVisible(false);
        bgPanel[5].setVisible(true);
    }

    public void goToScene4FromScene5() { //VERANDA -> CAMERA LETTO
        bgPanel[5].setVisible(false);
        bgPanel[4].setVisible(true);
    }

    public void observeScene1() {
        textBox[2].setVisible(true);
        textAreaBox[2].setVisible(true);
        textButton[2].setVisible(true);
        //TODO file
        ballRoom = DataHandler.RoomFinder(listRoom, "ballRoom");
        textAreaBox2[2].setText("Qui di seguito si trova la sala da ballo dell'hotel.");
    }

    public void observeScene3() {
        textBox[2].setVisible(true);
        textAreaBox[2].setVisible(true);
        textButton[2].setVisible(true);
        //TODO file
        textAreaBox2[2].setText("Da qui sembra portare al soggiorno.");
    }

    public void observeScene5() {
        textBox[4].setVisible(true);
        textAreaBox[4].setVisible(true);
        textButton[4].setVisible(true);
        //TODO file
        textAreaBox[4].setText("Questo sembra essere lo studio del signor Bantry.");
    }

    public void observeOwner() {
        textBox[1].setVisible(true);
        textAreaBox[1].setVisible(true);
        textButton[1].setVisible(true);
        //TODO file
        textAreaBox[1].setText("L'uomo dietro al bancone suppongo sia semplicemente un receptionist.");
    }

    public void observeRamon() {
        textBox[2].setVisible(true);
        textAreaBox[2].setVisible(true);
        textButton[2].setVisible(true);
        //TODO file
        textAreaBox[2].setText("Che bel uaglione");
    }

    public void observeJosephine() {
        textBox[2].setVisible(true);
        textAreaBox[2].setVisible(true);
        textButton[2].setVisible(true);
        //TODO file
        textAreaBox[2].setText("Anvedi che freg-");
    }

    public void observeJefferson() {
        textBox[4].setVisible(true);
        textAreaBox[4].setVisible(true);
        textButton[4].setVisible(true);
        //TODO file
        textAreaBox[4].setText("Quel vecchio mi sta imbruttendo brutto...");
    }

    public void observeMark() {
        textBox[5].setVisible(true);
        textAreaBox[5].setVisible(true);
        textButton[5].setVisible(true);
        //TODO file
        textAreaBox[5].setText("Napoli?!");
    }

    public void talkOwner() throws FileNotFoundException {
        textBox[1].setVisible(true);
        textAreaBox[1].setVisible(true);
        textButton[1].setVisible(true);
        textAreaBox2[1].setVisible(true);
        dialogueButton1[1].setVisible(true);
        dialogueButton2[1].setVisible(true);
        dialogueButton3[1].setVisible(true);
        dialogueButton4[1].setVisible(true);
        textAreaBox[1].setText("");
        textAreaBox2[1].setText("");
        
    }

    public void talkJosephine() {
        textBox[2].setVisible(true);
        textAreaBox[2].setVisible(true);
        textButton[2].setVisible(true);
        dialogueButton1[2].setVisible(true);
        dialogueButton2[2].setVisible(true);
        dialogueButton3[2].setVisible(true);
        dialogueButton4[2].setVisible(true);

        textAreaBox[2].setText("");
    }

    public void talkJefferson() {
        textBox[4].setVisible(true);
        textAreaBox[4].setVisible(true);
        textButton[4].setVisible(true);
        dialogueButton1[4].setVisible(true);
        dialogueButton2[4].setVisible(true);
        dialogueButton3[4].setVisible(true);
        dialogueButton4[4].setVisible(true);

        textAreaBox[4].setText("");
    }

    public void talkMark() {
        textBox[5].setVisible(true);
        textAreaBox[5].setVisible(true);
        textButton[5].setVisible(true);
        dialogueButton1[5].setVisible(true);
        dialogueButton2[5].setVisible(true);
        dialogueButton3[5].setVisible(true);
        dialogueButton4[5].setVisible(true);

        textAreaBox[5].setText("");
    }

    public void talkRamon() {
        textBox[2].setVisible(true);
        textAreaBox[2].setVisible(true);
        textButton[2].setVisible(true);
        dialogue2Button1[2].setVisible(true);
        dialogue2Button2[2].setVisible(true);
        dialogue2Button3[2].setVisible(true);
        dialogue2Button4[2].setVisible(true);

        textAreaBox[2].setText("");
    }

    public void choice1Owner() throws FileNotFoundException {
        dialogueButton1[1].setVisible(false);
        dialogueButton2[1].setVisible(false);
        dialogueButton3[1].setVisible(false);
        dialogueButton4[1].setVisible(false);
        List<String> Owner =new ArrayList<String>();
        Owner = DialogHandler.SelectDialogOption(file, DialogHandler.FIRST_DIALOG_START, DialogHandler.FIRST_DIALOG_END);
        System.out.println(Owner.get(1));

    }

    public void choice2Owner() {
        dialogueButton1[1].setVisible(false);
        dialogueButton2[1].setVisible(false);
        dialogueButton3[1].setVisible(false);
        dialogueButton4[1].setVisible(false);

        textAreaBox[1].setText("jamm bell uè");
    }

    public void choice3Owner() {
        dialogueButton1[1].setVisible(false);
        dialogueButton2[1].setVisible(false);
        dialogueButton3[1].setVisible(false);
        dialogueButton4[1].setVisible(false);

        textAreaBox[1].setText("a fess e sort");
    }

    public void choice4Owner() {
        dialogueButton1[1].setVisible(false);
        dialogueButton2[1].setVisible(false);
        dialogueButton3[1].setVisible(false);
        dialogueButton4[1].setVisible(false);

        textAreaBox[1].setText("sfacimm x2");
    }

    public void choice1Josephine() {
        dialogueButton1[2].setVisible(false);
        dialogueButton2[2].setVisible(false);
        dialogueButton3[2].setVisible(false);
        dialogueButton4[2].setVisible(false);

        textAreaBox[2].setText("sfacimm");
    }

    public void choice2Josephine() {
        dialogueButton1[2].setVisible(false);
        dialogueButton2[2].setVisible(false);
        dialogueButton3[2].setVisible(false);
        dialogueButton4[2].setVisible(false);

        textAreaBox[2].setText("jamm bell uè");
    }

    public void choice3Josephine() {
        dialogueButton1[2].setVisible(false);
        dialogueButton2[2].setVisible(false);
        dialogueButton3[2].setVisible(false);
        dialogueButton4[2].setVisible(false);

        textAreaBox[2].setText("jamm bell uè");

    }

    public void choice4Josephine() {
        dialogueButton1[2].setVisible(false);
        dialogueButton2[2].setVisible(false);
        dialogueButton3[2].setVisible(false);
        dialogueButton4[2].setVisible(false);

        textAreaBox[2].setText("jamm bell uè");

    }

    public void choice1Ramon() {
        dialogue2Button1[2].setVisible(false);
        dialogue2Button2[2].setVisible(false);
        dialogue2Button3[2].setVisible(false);
        dialogue2Button4[2].setVisible(false);

        textAreaBox[2].setText("sfacimm");
    }

    public void choice2Ramon() {
        dialogueButton1[2].setVisible(false);
        dialogueButton2[2].setVisible(false);
        dialogueButton3[2].setVisible(false);
        dialogueButton4[2].setVisible(false);

        textAreaBox[2].setText("jamm bell uè");
    }

    public void choice3Ramon() {
        dialogueButton1[2].setVisible(false);
        dialogueButton2[2].setVisible(false);
        dialogueButton3[2].setVisible(false);
        dialogueButton4[2].setVisible(false);

        textAreaBox[2].setText("jamm bell uè");

    }

    public void choice4Ramon() {
        dialogueButton1[2].setVisible(false);
        dialogueButton2[2].setVisible(false);
        dialogueButton3[2].setVisible(false);
        dialogueButton4[2].setVisible(false);

        textAreaBox[2].setText("jamm bell uè");

    }

    public void choice1Jefferson() {
        dialogueButton1[4].setVisible(false);
        dialogueButton2[4].setVisible(false);
        dialogueButton3[4].setVisible(false);
        dialogueButton4[4].setVisible(false);

        textAreaBox[4].setText("sfacimm");
    }

    public void choice2Jefferson() {
        dialogueButton1[4].setVisible(false);
        dialogueButton2[4].setVisible(false);
        dialogueButton3[4].setVisible(false);
        dialogueButton4[4].setVisible(false);

        textAreaBox[4].setText("sfacimm");
    }

    public void choice3Jefferson() {
        dialogueButton1[4].setVisible(false);
        dialogueButton2[4].setVisible(false);
        dialogueButton3[4].setVisible(false);
        dialogueButton4[4].setVisible(false);

        textAreaBox[4].setText("sfacimm");
    }

    public void choice4Jefferson() {
        dialogueButton1[4].setVisible(false);
        dialogueButton2[4].setVisible(false);
        dialogueButton3[4].setVisible(false);
        dialogueButton4[4].setVisible(false);

        textAreaBox[4].setText("sfacimm");
    }

    public void choice1Mark() {
        dialogueButton1[5].setVisible(false);
        dialogueButton2[5].setVisible(false);
        dialogueButton3[5].setVisible(false);
        dialogueButton4[5].setVisible(false);

        textAreaBox[5].setText("sfacimm");
    }

    public void choice2Mark() {
        dialogueButton1[5].setVisible(false);
        dialogueButton2[5].setVisible(false);
        dialogueButton3[5].setVisible(false);
        dialogueButton4[5].setVisible(false);

        textAreaBox[5].setText("sfacimm");
    }

    public void choice3Mark() {
        dialogueButton1[5].setVisible(false);
        dialogueButton2[5].setVisible(false);
        dialogueButton3[5].setVisible(false);
        dialogueButton4[5].setVisible(false);

        textAreaBox[5].setText("sfacimm");
    }

    public void choice4Mark() {
        dialogueButton1[5].setVisible(false);
        dialogueButton2[5].setVisible(false);
        dialogueButton3[5].setVisible(false);
        dialogueButton4[5].setVisible(false);

        textAreaBox[5].setText("sfacimm");
    }

    public void takeDress() {
        JButton item = new JButton();
        Component[] object = bgPanel[2].getComponents();
        object[21].setVisible(false);
        //inv.getItem_1().setIcon(new ImageIcon(getClass().getResource("/dress1.png")));
    }

    public void knockRoom() {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    getClass().getClassLoader().getResource("Knocking-on-door.wav")
            );
            clip.open(inputStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.err.println(e.getMessage());
        }

        textBox[3].setVisible(true);
        textAreaBox[3].setVisible(true);
        textButton[3].setVisible(true);
        //TODO file
        textAreaBox[3].setText("Prego, chiunque lei sia può entrare, se una bella ragazza anche ben volentieri.");
    }

    public void closeTextBox(int bgNum) {
        textBox[bgNum].setVisible(false);
        textAreaBox[bgNum].setVisible(false);
        textButton[bgNum].setVisible(false);
        dialogueButton1[bgNum].setVisible(false);
        dialogueButton2[bgNum].setVisible(false);
        dialogueButton3[bgNum].setVisible(false);
        dialogueButton4[bgNum].setVisible(false);
    }

    public void createScene(int bgNum, int x, int y, String bgFileName) {

        //panel
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(0, 0, 1920, 1080);
        bgPanel[bgNum].setBackground(Color.black);
        bgPanel[bgNum].setLayout(null);
        bgPanel[bgNum].setVisible(false);

        //sfondo
        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(x, y, 1920, 1080);
        ImageIcon bgIcon = new ImageIcon(getClass().getResource(bgFileName));
        bgLabel[bgNum].setIcon(bgIcon);

        //backpack - inventory
        JButton backpack = new JButton();
        backpack.setBounds(1700, 10, 200, 200);
        backpack.setContentAreaFilled(false);
        ImageIcon arrowIcon = new ImageIcon(getClass().getResource("/backpack_inventory.png"));
        backpack.setBackground(null);
        backpack.setFocusPainted(false);
        backpack.setIcon(arrowIcon);
        backpack.addActionListener(actHandler);
        backpack.setActionCommand("openInventory");
        backpack.setBorderPainted(false);
        bgPanel[bgNum].add(backpack);

        this.add(bgPanel[bgNum]);
    }

    public void createTextBox(int bgNum, String npcName, String choice1, String choice2, String choice3, String choice4) {
        //TODO FARE PIù PICCOLA TEXT_BOX

        //creazione componenti
        textBox[bgNum] = new JLabel();
        textAreaBox[bgNum] = new JTextArea();
        textAreaBox2[bgNum] = new JTextArea();
        textButton[bgNum] = new JButton();
        continueDialogue[bgNum] = new JButton();

        ImageIcon boxIcon = new ImageIcon(getClass().getResource("/text_box.png"));
        textBox[bgNum].setIcon(boxIcon);
        textBox[bgNum].setBounds(300, 680, 1300, 320);
        textAreaBox[bgNum].setBackground(new Color(0, 0, 0, 0));
        textAreaBox[bgNum].setOpaque(false);
        textAreaBox[bgNum].setBounds(400, 740, 1000, 200);
        textAreaBox[bgNum].setFont(new java.awt.Font("Courier New", 0, 30));
        textAreaBox[bgNum].setForeground(Color.yellow);
        textAreaBox[bgNum].setBorder(null);
        textAreaBox[bgNum].setEditable(false);
        textAreaBox[bgNum].setWrapStyleWord(true);
        textAreaBox[bgNum].setLineWrap(true);
        textAreaBox2[bgNum].setBackground(new Color(0, 0, 0, 0));
        textAreaBox2[bgNum].setOpaque(false);
        textAreaBox2[bgNum].setBounds(400, 790, 1000, 200);
        textAreaBox2[bgNum].setFont(new java.awt.Font("Courier New", 0, 30));
        textAreaBox2[bgNum].setForeground(Color.white);
        textAreaBox2[bgNum].setBorder(null);
        textAreaBox2[bgNum].setEditable(false);
        textAreaBox2[bgNum].setWrapStyleWord(true);
        textAreaBox2[bgNum].setLineWrap(true);

        textButton[bgNum].setBackground(new Color(0, 0, 0));
        textButton[bgNum].setBounds(1438, 920, 64, 26);
        textButton[bgNum].setFont(new Font("Segoe UI", 2, 14)); // NOI18N
        textButton[bgNum].setForeground(new Color(255, 255, 255));
        textButton[bgNum].setText("Chiudi");
        textButton[bgNum].setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED,
                Color.lightGray, Color.white, Color.lightGray, Color.white));
        textButton[bgNum].setContentAreaFilled(false);
        textButton[bgNum].addActionListener(actHandler);
        textButton[bgNum].setActionCommand("closeTextScene" + bgNum);

        //DIALOGHI A SCELTA
        dialogueButton1[bgNum] = new JRadioButton(choice1);
        dialogueButton2[bgNum] = new JRadioButton(choice2);
        dialogueButton3[bgNum] = new JRadioButton(choice3);
        dialogueButton4[bgNum] = new JRadioButton(choice4);

        dialogueButton1[bgNum].setBounds(400, 750, 400, 50);
        dialogueButton2[bgNum].setBounds(950, 750, 400, 50);
        dialogueButton3[bgNum].setBounds(400, 880, 400, 50);
        dialogueButton4[bgNum].setBounds(950, 880, 400, 50);

        dialogueButton1[bgNum].setForeground(Color.white);
        dialogueButton2[bgNum].setForeground(Color.white);
        dialogueButton3[bgNum].setForeground(Color.white);
        dialogueButton4[bgNum].setForeground(Color.white);

        dialogueButton1[bgNum].setFont(new Font("Courier New", 0, 30));
        dialogueButton2[bgNum].setFont(new Font("Courier New", 0, 30));
        dialogueButton3[bgNum].setFont(new Font("Courier New", 0, 30));
        dialogueButton4[bgNum].setFont(new Font("Courier New", 0, 30));

        dialogueButton1[bgNum].addActionListener(actHandler);
        dialogueButton1[bgNum].setActionCommand("scelta1" + npcName);
        dialogueButton2[bgNum].addActionListener(actHandler);
        dialogueButton2[bgNum].setActionCommand("scelta2" + npcName);
        dialogueButton3[bgNum].addActionListener(actHandler);
        dialogueButton3[bgNum].setActionCommand("scelta3" + npcName);
        dialogueButton4[bgNum].addActionListener(actHandler);
        dialogueButton4[bgNum].setActionCommand("scelta4" + npcName);

        ButtonGroup group = new ButtonGroup();
        group.add(dialogueButton1[bgNum]);
        group.add(dialogueButton2[bgNum]);
        group.add(dialogueButton3[bgNum]);
        group.add(dialogueButton4[bgNum]);

        //visibility
        textBox[bgNum].setVisible(false);
        textAreaBox[bgNum].setVisible(false);
        textAreaBox2[bgNum].setVisible(false);
        textButton[bgNum].setVisible(false);
        continueDialogue[bgNum].setVisible(false);
        dialogueButton1[bgNum].setVisible(false);
        dialogueButton2[bgNum].setVisible(false);
        dialogueButton3[bgNum].setVisible(false);
        dialogueButton4[bgNum].setVisible(false);

        bgPanel[bgNum].add(dialogueButton4[bgNum]);
        bgPanel[bgNum].add(dialogueButton3[bgNum]);
        bgPanel[bgNum].add(dialogueButton2[bgNum]);
        bgPanel[bgNum].add(dialogueButton1[bgNum]);
        bgPanel[bgNum].add(continueDialogue[bgNum]);
        bgPanel[bgNum].add(textButton[bgNum]);
        bgPanel[bgNum].add(textAreaBox[bgNum]);
        bgPanel[bgNum].add(textAreaBox2[bgNum]);
        bgPanel[bgNum].add(textBox[bgNum]);
    }

    public void createTextBox2(int bgNum, String npcName, String choice1, String choice2, String choice3, String choice4) {
        //TODO FARE PIù PICCOLA TEXT_BOX

        //creazione componenti
        textBox[bgNum] = new JLabel();
        textAreaBox[bgNum] = new JTextArea();
        textButton[bgNum] = new JButton();
        continueDialogue[bgNum] = new JButton();

        ImageIcon boxIcon = new ImageIcon(getClass().getResource("/text_box.png"));
        textBox[bgNum].setIcon(boxIcon);
        textBox[bgNum].setBounds(300, 680, 1300, 320);
        textAreaBox[bgNum].setBackground(new Color(0, 0, 0, 0));
        textAreaBox[bgNum].setBounds(400, 740, 1000, 200);
        textAreaBox[bgNum].setFont(new java.awt.Font("Courier New", 0, 30));
        textAreaBox[bgNum].setForeground(Color.white);
        textAreaBox[bgNum].setBorder(null);
        textAreaBox[bgNum].setEditable(false);
        textAreaBox[bgNum].setWrapStyleWord(true);
        textAreaBox[bgNum].setLineWrap(true);

        textButton[bgNum].setBackground(new Color(0, 0, 0));
        textButton[bgNum].setBounds(1438, 920, 64, 26);
        textButton[bgNum].setFont(new Font("Segoe UI", 2, 14)); // NOI18N
        textButton[bgNum].setForeground(new Color(255, 255, 255));
        textButton[bgNum].setText("Chiudi");
        textButton[bgNum].setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED,
                Color.lightGray, Color.white, Color.lightGray, Color.white));
        textButton[bgNum].setContentAreaFilled(false);
        textButton[bgNum].addActionListener(actHandler);
        textButton[bgNum].setActionCommand("closeTextScene" + bgNum);

        //DIALOGHI A SCELTA
        dialogue2Button1[bgNum] = new JRadioButton(choice1);
        dialogue2Button2[bgNum] = new JRadioButton(choice2);
        dialogue2Button3[bgNum] = new JRadioButton(choice3);
        dialogue2Button4[bgNum] = new JRadioButton(choice4);

        dialogue2Button1[bgNum].setBounds(400, 750, 400, 50);
        dialogue2Button2[bgNum].setBounds(950, 750, 400, 50);
        dialogue2Button3[bgNum].setBounds(400, 880, 400, 50);
        dialogue2Button4[bgNum].setBounds(950, 880, 400, 50);

        dialogue2Button1[bgNum].setForeground(Color.white);
        dialogue2Button2[bgNum].setForeground(Color.white);
        dialogue2Button3[bgNum].setForeground(Color.white);
        dialogue2Button4[bgNum].setForeground(Color.white);

        dialogue2Button1[bgNum].setFont(new Font("Courier New", 0, 30));
        dialogue2Button2[bgNum].setFont(new Font("Courier New", 0, 30));
        dialogue2Button3[bgNum].setFont(new Font("Courier New", 0, 30));
        dialogue2Button4[bgNum].setFont(new Font("Courier New", 0, 30));

        dialogue2Button1[bgNum].addActionListener(actHandler);
        dialogue2Button1[bgNum].setActionCommand("scelta1" + npcName);
        dialogue2Button2[bgNum].addActionListener(actHandler);
        dialogue2Button2[bgNum].setActionCommand("scelta2" + npcName);
        dialogue2Button3[bgNum].addActionListener(actHandler);
        dialogue2Button3[bgNum].setActionCommand("scelta3" + npcName);
        dialogue2Button4[bgNum].addActionListener(actHandler);
        dialogue2Button4[bgNum].setActionCommand("scelta4" + npcName);

        ButtonGroup group = new ButtonGroup();
        group.add(dialogue2Button1[bgNum]);
        group.add(dialogue2Button2[bgNum]);
        group.add(dialogue2Button3[bgNum]);
        group.add(dialogue2Button4[bgNum]);

        //visibility
        textBox[bgNum].setVisible(false);
        textAreaBox[bgNum].setVisible(false);
        textButton[bgNum].setVisible(false);
        continueDialogue[bgNum].setVisible(false);
        dialogue2Button1[bgNum].setVisible(false);
        dialogue2Button2[bgNum].setVisible(false);
        dialogue2Button3[bgNum].setVisible(false);
        dialogue2Button4[bgNum].setVisible(false);

        bgPanel[bgNum].add(dialogue2Button4[bgNum]);
        bgPanel[bgNum].add(dialogue2Button3[bgNum]);
        bgPanel[bgNum].add(dialogue2Button2[bgNum]);
        bgPanel[bgNum].add(dialogue2Button1[bgNum]);
        bgPanel[bgNum].add(continueDialogue[bgNum]);
        bgPanel[bgNum].add(textButton[bgNum]);
        bgPanel[bgNum].add(textAreaBox[bgNum]);
        bgPanel[bgNum].add(textBox[bgNum]);
    }

    public void createArrowButton(int bgNum, int x, int y, String arrowFileName, String command) {

        ImageIcon arrowIcon = new ImageIcon(getClass().getResource(arrowFileName));

        JButton arrowButton = new JButton();
        arrowButton.setBounds(x, y, 150, 150);
        arrowButton.setBackground(null);
        arrowButton.setContentAreaFilled(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setIcon(arrowIcon);
        arrowButton.addActionListener(actHandler);
        arrowButton.setActionCommand(command);
        arrowButton.setBorderPainted(false);

        bgPanel[bgNum].add(arrowButton);
    }

    public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String objFileName,
            String choice1Name, String choice2Name, String choice3Name, String choice1Command, String Choice2Command, String Choice3Command) {

        // CREATE POP MENU
        JPopupMenu popMenu = new JPopupMenu();
        // CREATE POP MENU ITEMS
        JMenuItem menuItem[] = new JMenuItem[4]; // Use [1],[2],[3]
        menuItem[1] = new JMenuItem(choice1Name);
        menuItem[1].addActionListener(actHandler);
        menuItem[1].setActionCommand(choice1Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice2Name);
        menuItem[2].addActionListener(actHandler);
        menuItem[2].setActionCommand(Choice2Command);
        popMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(choice3Name);
        menuItem[3].addActionListener(actHandler);
        menuItem[3].setActionCommand(Choice3Command);
        popMenu.add(menuItem[3]);

        // CREATE OBJECTS
        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx, objy, objWidth, objHeight);
        //objectLabel.setOpaque(true);
        //objectLabel.setBackground(Color.blue);

        ImageIcon objectIcon = new ImageIcon(getClass().getResource(objFileName));
        objectLabel.setIcon(objectIcon);

        objectLabel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    popMenu.show(objectLabel, e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

        });

        bgPanel[bgNum].add(objectLabel);

    }

    public void generateScenes() throws FileNotFoundException {
        List<String> Owner1 = new ArrayList<String>();
        
        Owner1 = DialogHandler.SelectDialogOption(file, DialogHandler.DIALOG_OPTION_START, DialogHandler.DIALOG_OPTION_END);
       

        //SCENA 1 -> RECEPTION
        createScene(1, 0, -10, "/receptionhotel.png");
        createTextBox(1, "owner", Owner1.get(0), Owner1.get(1), Owner1.get(2), Owner1.get(3));
        createArrowButton(1, 10, 500, "/left_arrow.png", "goToHallFromReception");
        createObject(1, 1000, 250, 200, 400, "", "Parla", "Osserva", "", "TalkOwner", "ObserveOwner", "");
        bgPanel[1].add(bgLabel[1]);

        //SCENA 2 -> SALA DA BALLO
        createScene(2, 0, 0, "/hall.png");
        createTextBox(2, "josephine", "anvedi che fre-", "uWu", "kawaii", "Cock rating?");
        createTextBox2(2, "ramon", "a", "u", "kakarotto", "Cock rating?");
        createArrowButton(2, 1750, 500, "/right_arrow.png", "goToReceptionFromHall");
        createArrowButton(2, 10, 500, "/left_arrow.png", "StaircaseUP2");
        createObject(2, 330, 600, 150, 330, "", "Parla", "Osserva", "", "TalkJosephine", "ObserveJosephine", "");
        createObject(2, 1430, 600, 150, 330, "", "Parla", "Osserva", "", "TalkRamon", "ObserveRamon", "");
        createObject(2, 1000, 700, 160, 226, "/dressDance.png", "Osserva", "Raccogli", "", "ObserveDress", "TakeDress", "");
        bgPanel[2].add(bgLabel[2]);

        //SCENA 3 -> CORRIDOIO
        createScene(3, 352, -10, "/corridoiohotel.png");
        createTextBox(3, "", "", "", "", "");
        createArrowButton(3, 850, 850, "/down_arrow.png", "StaircaseDown2");
        createObject(3, 360, 100, 200, 850, "", "Bussa", "Entra (senza bussare è maleducazione...)", "", "KnockRoom", "goToRoomFromCorridor", "");
        bgPanel[3].add(bgLabel[3]);

        //SCENA 4 -> ROOM
        createScene(4, 0, -10, "/bedroom.png");
        createTextBox(4, "jefferson", "", "", "", "");
        createArrowButton(4, 10, 500, "/left_arrow.png", "goToVeranda");
        createArrowButton(4, 1750, 500, "/right_arrow.png", "goToCorridor");
        createObject(4, 650, 200, 200, 700, "", "Parla", "Osserva", "", "TalkJefferson", "ObserveJefferson", "");
        bgPanel[4].add(bgLabel[4]);

        //SCENA 5 -> VERANDA
        createScene(5, 0, -10, "/veranda.png");
        createTextBox(5, "mark", "", "", "", "");
        createArrowButton(5, 1750, 500, "/right_arrow.png", "goToRoomFromVeranda");
        createObject(5, 200, 70, 200, 830, "", "Parla", "Osserva", "", "TalkMark", "ObserveMark", "");
        bgPanel[5].add(bgLabel[5]);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Day2_Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day2_Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day2_Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day2_Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Day2_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background2;
    private javax.swing.JButton continua2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}