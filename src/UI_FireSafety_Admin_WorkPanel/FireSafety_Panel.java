/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_FireSafety_Admin_WorkPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FiresafetyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Emergency;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author purva
 */
public class FireSafety_Panel extends javax.swing.JPanel {

    /**
     * Creates new form FireSafety_Panel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    Organization organization;
    EcoSystem system;
    UserAccount account;
    Emergency workRequest;

    public FireSafety_Panel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        this.system = system;
        this.account = account;
        this.workRequest = workRequest;

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblFire.getModel();
        model.setRowCount(0);
               for (WorkRequest w : organization.getWorkQueue().getWorkRequestList()) {
            if (w instanceof Emergency) {
                Object[] row = new Object[5];
                row[0] = w.getSender();
                row[1] = ((Emergency) w).getRequestOrg();
                row[2] = ((Emergency) w).getRequestType();
                row[3] = w;
                row[4] = ((Emergency) w).getRemainingQuantity();
                model.addRow(row);

            }
            
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFire = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        viewDetailsBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Work Request Management - Fire Safety Admin ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 21, 420, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Request Received");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        tblFire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reuested Manager", "Requested Organization", "Request Type", "Status", "Number of Units"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFire);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 99, 690, 182));

        btnAssign.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(102, 0, 102));
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 110, 30));

        btnComplete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnComplete.setForeground(new java.awt.Color(102, 0, 102));
        btnComplete.setText("Serve");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 100, 30));

        viewDetailsBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        viewDetailsBtn.setForeground(new java.awt.Color(102, 0, 102));
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });
        add(viewDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons/fireman.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 580, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFire.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Emergency p = (Emergency) tblFire.getValueAt(selectedRow, 3);

            if (p.getStatus().equals("Requested")) {
                p.setStatus("Pending");
                p.setReceiver(account);

                populateTable();

            } else {
                JOptionPane.showMessageDialog(null, "Already assigned");
            }

        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFire.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Emergency p = (Emergency) tblFire.getValueAt(selectedRow, 3);
            if (p.getStatus().equals("Allocated")) {

                p.setStatus("Complete");
                JOptionPane.showMessageDialog(null, "You have successfully completed the request");
                populateTable();

            } else {
                JOptionPane.showMessageDialog(null, "Please assign first");
            }

        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFire.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Emergency p = (Emergency) tblFire.getValueAt(selectedRow, 3);
            if (p.getStatus().equals("Pending")) {
                FireSafety_ViewPanel ramop = new FireSafety_ViewPanel(userProcessContainer, account, organization, enterprise, network, system, p);
                userProcessContainer.add("FireSafety_ViewPanel", ramop);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            if (p.getStatus().equals("Requested")) {
                JOptionPane.showMessageDialog(null, "Please ensure the request is assigned to self", "Warning", JOptionPane.WARNING_MESSAGE);
            }

    }//GEN-LAST:event_viewDetailsBtnActionPerformed
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFire;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
