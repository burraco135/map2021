/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import db.DataHandler;
import static game.Main.listItem;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import type.Item;

/**
 *
 * @author tom
 */
public class InventoryDialog extends javax.swing.JDialog {

    GameHandler gh;

    Item autopsy = DataHandler.ItemFinder(listItem, "autopsy");
    Item dress1 = DataHandler.ItemFinder(listItem, "white_dress");
    Item dress2 = DataHandler.ItemFinder(listItem, "ball_dress");
    Item broken_nail = DataHandler.ItemFinder(listItem, "broken_nail");
    Item adoption_doc = DataHandler.ItemFinder(listItem, "adoption_doc");
    Item mark_bill = DataHandler.ItemFinder(listItem, "mark_bill");

    JButton ArrayButton[];

    /**
     * Creates new form InventoryDialog
     *
     * @param parent
     * @param modal
     * @param gh
     */
    public InventoryDialog(java.awt.Frame parent, boolean modal, GameHandler gh) {
        super(parent, modal);
        this.gh = gh;
        initComponents();
        setDefaultVisible();

        this.ArrayButton = new JButton[]{item_1, item_2, item_3, item_4, item_5, item_6};
    }

    private void setDefaultVisible() {
        item_1.setVisible(false);
        item_2.setVisible(false);
        item_3.setVisible(false);
        item_4.setVisible(false);
        item_5.setVisible(false);
        item_6.setVisible(false);

    }

    public JButton getItem_1() {
        return item_1;
    }

    public JButton getItem_2() {
        return item_2;
    }

    public JButton getItem_3() {
        return item_3;
    }

    public void setItem_1(JButton item_1) {
        this.item_1 = item_1;
    }

    public void setItem_2(JButton item_2) {
        this.item_2 = item_2;
    }

    public JButton getItem_4() {
        return item_4;
    }

    public void setItem_4(JButton item_4) {
        this.item_4 = item_4;
    }

    public JButton getItem_5() {
        return item_5;
    }

    public void setItem_5(JButton item_5) {
        this.item_5 = item_5;
    }

    public JButton getItem_6() {
        return item_6;
    }

    public void setItem_6(JButton item_6) {
        this.item_6 = item_6;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        item_1 = new javax.swing.JButton();
        item_2 = new javax.swing.JButton();
        item_3 = new javax.swing.JButton();
        item_4 = new javax.swing.JButton();
        item_5 = new javax.swing.JButton();
        item_6 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventario");
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item_1.setForeground(new java.awt.Color(255, 255, 255));
        item_1.setText("ITEM 1");
        item_1.setBorder(null);
        item_1.setContentAreaFilled(false);
        item_1.setMinimumSize(new java.awt.Dimension(128, 128));
        item_1.setPreferredSize(new java.awt.Dimension(128, 128));
        item_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_1ActionPerformed(evt);
            }
        });
        getContentPane().add(item_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 170, 160));

        item_2.setForeground(new java.awt.Color(255, 255, 255));
        item_2.setText("ITEM 2");
        item_2.setBorder(null);
        item_2.setContentAreaFilled(false);
        item_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_2ActionPerformed(evt);
            }
        });
        getContentPane().add(item_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 190, 180));

        item_3.setForeground(new java.awt.Color(255, 255, 255));
        item_3.setText("ITEM 3");
        item_3.setBorder(null);
        item_3.setContentAreaFilled(false);
        item_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_3ActionPerformed(evt);
            }
        });
        getContentPane().add(item_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 170, 180));

        item_4.setForeground(new java.awt.Color(255, 255, 255));
        item_4.setText("ITEM 4");
        item_4.setBorder(null);
        item_4.setContentAreaFilled(false);
        item_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_4ActionPerformed(evt);
            }
        });
        getContentPane().add(item_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 160, 160));

        item_5.setForeground(new java.awt.Color(255, 255, 255));
        item_5.setText("ITEM 5");
        item_5.setToolTipText("");
        item_5.setBorder(null);
        item_5.setContentAreaFilled(false);
        item_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_5ActionPerformed(evt);
            }
        });
        getContentPane().add(item_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 180, 170));

        item_6.setForeground(new java.awt.Color(255, 255, 255));
        item_6.setText("ITEM 6");
        item_6.setBorder(null);
        item_6.setContentAreaFilled(false);
        item_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_6ActionPerformed(evt);
            }
        });
        getContentPane().add(item_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 170, 160));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brown-leather.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_1ActionPerformed
        createPopup("Osserva", autopsy, "autopsy", item_1, 1);
    }//GEN-LAST:event_item_1ActionPerformed

    private void item_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_2ActionPerformed
        createPopup("Osserva", dress1, "white_dress", item_2, 2);
    }//GEN-LAST:event_item_2ActionPerformed

    private void item_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_3ActionPerformed
        createPopup("Osserva", dress2, "ball_dress", item_3, 3);
    }//GEN-LAST:event_item_3ActionPerformed

    private void item_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_5ActionPerformed
        createPopup("Osserva", adoption_doc, "adoption_doc", item_5, 5);
    }//GEN-LAST:event_item_5ActionPerformed

    private void item_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_6ActionPerformed
        createPopup("Osserva", mark_bill, "mark_bill", item_6, 6);
    }//GEN-LAST:event_item_6ActionPerformed

    private void item_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_4ActionPerformed
        createPopup("Osserva", broken_nail, "broken_nail", item_4, 4);
    }//GEN-LAST:event_item_4ActionPerformed

    public void createPopup(String choice1Name, Item item, String itemName, JButton itemButton, int index) {

        // CREATE POP MENU
        JPopupMenu popupMenu = new JPopupMenu();
        // CREATE POP MENU ITEMS
        JMenuItem menuItem[] = new JMenuItem[3];
        menuItem[1] = new JMenuItem(choice1Name);
        menuItem[1].addActionListener((ActionEvent e) -> {
            observeItem(item, itemName);
        });

        popupMenu.add(menuItem[1]);

        if (DataHandler.ItemFinder(gh.getPlayer().getInventory(), itemName) != null) {
            int i = gh.getPlayer().getInventory().indexOf(item);
            i += index;
            ArrayButton[i].setComponentPopupMenu(popupMenu);
        }
    }

    public void createObject(int objx, int objy, int objWidth, int objHeight, String objFileName,
            String choice1Name, String choice2Name, String choice1Command, String Choice2Command, ActionHandler actHandler, JButton item) {

        // CREATE POP MENU
        JPopupMenu popMenu = new JPopupMenu();
        // CREATE POP MENU ITEMS
        JMenuItem menuItem[] = new JMenuItem[3]; // Use [1],[2],[3]
        menuItem[1] = new JMenuItem(choice1Name);
        menuItem[1].addActionListener(actHandler);
        menuItem[1].setActionCommand(choice1Command);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choice2Name);
        menuItem[2].addActionListener(actHandler);
        menuItem[2].setActionCommand(Choice2Command);
        popMenu.add(menuItem[2]);

        // CREATE OBJECTS
        item.setBounds(objx, objy, objWidth, objHeight);
        item.setOpaque(false);
        //objectLabel.setBackground(Color.blue);

        ImageIcon objectIcon = new ImageIcon(getClass().getResource(objFileName));
        item.setIcon(objectIcon);

        item.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    popMenu.show(item, e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });

    }

    public void observeItem(Item item, String itemName) {
        //TODO file
        item = DataHandler.ItemFinder(listItem, itemName);
        JOptionPane.showMessageDialog(this, item.getDescription(), "Informazioni reperto", JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    public javax.swing.JButton item_1;
    private javax.swing.JButton item_2;
    private javax.swing.JButton item_3;
    private javax.swing.JButton item_4;
    private javax.swing.JButton item_5;
    private javax.swing.JButton item_6;
    // End of variables declaration//GEN-END:variables
}
