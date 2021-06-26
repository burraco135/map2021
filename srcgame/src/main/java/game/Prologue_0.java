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
    Thread t2;

    public Prologue_0() {
        initComponents();
        playSound();
    }

    //TODO si può fare senza thread!! (vedere scene1)
    public synchronized void playSound() {
        t2 = new Thread(new Runnable() { //TODO wrapper thread            
            @Override
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                            getClass().getClassLoader().getResource("rain1.wav")
                    );
                    clip.open(inputStream);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                    System.err.println(e.getMessage());
                }
            }
        });
        t2.start();
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

        background.setBackground(new java.awt.Color(0, 0, 0));

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

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(1003, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(433, 433, 433))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(continua)
                        .addGap(909, 909, 909))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(continua)
                .addContainerGap(481, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        if (i == 1) {
            testoPrologo.setText(text1);
            i++;
        } else if (i == 2) {
            testoPrologo.setText(text2);
            i++;
        } else if (i == 3) {
            background.setVisible(false);
            goToScene2();           
        }
    }//GEN-LAST:event_continuaActionPerformed

    public void goToScene2() {

        Scene1 scene1 = new Scene1(this);

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
            java.util.logging.Logger.getLogger(Prologue_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prologue_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prologue_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prologue_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prologue_0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton continua;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea testoPrologo;
    // End of variables declaration//GEN-END:variables
}
