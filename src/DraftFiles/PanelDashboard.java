package DraftFiles;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class PanelDashboard extends javax.swing.JPanel {
    
    public PanelDashboard() {
        initComponents();
        setOpaque(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    protected void paintComponent(Graphics grphs) {
        Graphics2D gp2 = (Graphics2D) grphs;
        gp2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gp2.setColor(getBackground());
        gp2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintComponent(grphs); 
    }
}
