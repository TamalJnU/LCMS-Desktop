package com.gov.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MenuItem extends javax.swing.JPanel {

    private boolean selected;

    
    public MenuItem(ModelMenu data) {
        initComponents();
        setOpaque(false);
        if(data.getType() == ModelMenu.menuType.MENU){
            miIcon.setIcon(data.toIcon());
            miName.setText(data.getName());
        }else if(data.getType() == ModelMenu.menuType.TITLE){
            miIcon.setText(data.getName());
            miIcon.setFont(new Font("sansserif", 1, 12));
            miName.setVisible(false);
        }else{
            miName.setText(" ");
        }
        
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miIcon = new javax.swing.JLabel();
        miName = new javax.swing.JLabel();

        miName.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(miIcon)
                .addGap(18, 18, 18)
                .addComponent(miName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(miName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphs) {
        if(selected){
            Graphics2D gp2 = (Graphics2D) grphs;
            gp2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            gp2.setColor(new Color(255, 255, 255, 80));
            gp2.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
        }
        
        super.paintComponent(grphs); 
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel miIcon;
    private javax.swing.JLabel miName;
    // End of variables declaration//GEN-END:variables
}
