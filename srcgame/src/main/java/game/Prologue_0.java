/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author tom
 */
public class Prologue_0 extends javax.swing.JFrame {

    /**
     * Creates new form Prologue_0
     */
    
    int i = 1;

    Clip clipRain;
    Clip clipJazz;
    
    GameHandler gh;

    public Prologue_0(Clip clipJazz, GameHandler gh) {
        initComponents();
        playSound();
        this.clipJazz = clipJazz;
        this.gh = gh;
    }

    private void playSound() {
        try {
            clipRain = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    getClass().getClassLoader().getResource("rain1.wav")
            );
            clipRain.open(inputStream);
            clipRain.start();
            clipRain.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        continua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        testoPrologo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setMinimumSize(new java.awt.Dimension(1920, 1080));
        background.setPreferredSize(new java.awt.Dimension(1920, 1080));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        continua.setBackground(new java.awt.Color(0, 0, 0));
        continua.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        continua.setForeground(new java.awt.Color(255, 255, 255));
        continua.setText("Continua");
        continua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white));
        continua.setContentAreaFilled(false);
        continua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuaActionPerformed(evt);
            }
        });
        background.add(continua, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, -1, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        testoPrologo.setEditable(false);
        testoPrologo.setBackground(new java.awt.Color(0, 0, 0));
        testoPrologo.setColumns(20);
        testoPrologo.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        testoPrologo.setForeground(new java.awt.Color(255, 255, 255));
        testoPrologo.setLineWrap(true);
        testoPrologo.setRows(5);
        testoPrologo.setText("\t   Era una notte buia e tempestosa...");
        testoPrologo.setToolTipText("");
        testoPrologo.setWrapStyleWord(true);
        testoPrologo.setBorder(null);
        testoPrologo.setCaretColor(new java.awt.Color(102, 102, 255));
        jScrollPane1.setViewportView(testoPrologo);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 895, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2331, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuaActionPerformed

        //TODO Usare file per testi + aggiust. struttura
        String text1 = "           Era una notte buia e tempestosa...\n\n"
                + "La pioggia e il fragore dei tuoni"
                + " non facevano altro che accentuare l’inquietudine di quel momento.";

        String text2 = "           Era una notte buia e tempestosa...\n\n"
                + "La pioggia e il fragore dei tuoni"
                + " non facevano altro che accentuare l’inquietudine di quel momento."
                + "\n\nRientrai subito nella mia Berlina per schiarirmi le idee e schermarle dalle intemperie.";

        switch (i) {
            case 1:
                testoPrologo.setText(text1);
                i++;
                break;
            case 2:
                testoPrologo.setText(text2);
                i++;
                break;
            case 3:                
                goToScene1();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_continuaActionPerformed

    //TODO SPOSTARE SCENA 1 QUI
    public void goToScene1() {
        background.setVisible(false);
        Scene1 scene1 = new Scene1(this, clipRain, clipJazz, gh);

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton continua;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea testoPrologo;
    // End of variables declaration//GEN-END:variables
}
