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
import javax.swing.JOptionPane;

/**
 * Schermata iniziale, da cui si inizia il gioco.
 *
 * @author giaco
 */
public class Start extends javax.swing.JFrame {    
    
    /*
    clip musicale
    */
    Clip clipJazz;
    
    /*
    Prima e unica volta che viene creata la classe GameHandler.
    */
    GameHandler gh = new GameHandler();
    
    public Start() {
        initComponents();
        playSound();
    }
    
    private void playSound() {
        try {
            clipJazz = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    getClass().getClassLoader().getResource("jazz.wav")
            );
            clipJazz.open(inputStream);
            clipJazz.start();
            clipJazz.loop(Clip.LOOP_CONTINUOUSLY);

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
        esci = new javax.swing.JButton();
        gioca = new javax.swing.JButton();
        titolo = new javax.swing.JLabel();
        credits = new javax.swing.JButton();
        silhouette = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The body in the library");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setLayout(null);

        esci.setFont(new java.awt.Font("Courier New", 2, 48)); // NOI18N
        esci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit-door.png"))); // NOI18N
        esci.setToolTipText("Esci dal gioco");
        esci.setBorder(null);
        esci.setContentAreaFilled(false);
        esci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esciActionPerformed(evt);
            }
        });
        background.add(esci);
        esci.setBounds(924, 605, 145, 143);

        gioca.setFont(new java.awt.Font("Courier New", 2, 48)); // NOI18N
        gioca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magnifying-glass.png"))); // NOI18N
        gioca.setToolTipText("Inizia le indagini");
        gioca.setBorder(null);
        gioca.setContentAreaFilled(false);
        gioca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giocaActionPerformed(evt);
            }
        });
        background.add(gioca);
        gioca.setBounds(924, 366, 145, 143);

        titolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/titolo2.gif"))); // NOI18N
        background.add(titolo);
        titolo.setBounds(514, 172, 958, 77);

        credits.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        credits.setForeground(new java.awt.Color(255, 255, 255));
        credits.setText("Credits");
        credits.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        credits.setContentAreaFilled(false);
        credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsActionPerformed(evt);
            }
        });
        background.add(credits);
        credits.setBounds(1779, 897, 78, 34);

        silhouette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silhouette.png"))); // NOI18N
        background.add(silhouette);
        silhouette.setBounds(52, 294, 450, 679);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giocaActionPerformed
        this.dispose();
        new Prologue_0(clipJazz, gh).setVisible(true);
    }//GEN-LAST:event_giocaActionPerformed

    private void esciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esciActionPerformed
        System.exit(0);
    }//GEN-LAST:event_esciActionPerformed

    private void creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsActionPerformed
        JOptionPane.showMessageDialog(this, "Molinari Ester, Signorile Giacomo e Perniola Tommaso", "Autori", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_creditsActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton credits;
    private javax.swing.JButton esci;
    private javax.swing.JButton gioca;
    private javax.swing.JLabel silhouette;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
