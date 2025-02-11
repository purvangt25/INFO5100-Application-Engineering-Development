/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_VoluntaryTeam_Personal;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.PersonalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Resource;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public class Personal_ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form Personal_ViewPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    Organization organization;
    EcoSystem system;
    UserAccount account;
    Resource workRequest;
    private Personal_ViewRequestPanel individualViewRequestJPanel;

    public Personal_ViewPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system, Resource workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.network = network;
        this.workRequest = workRequest;

        reqManagerTextField.setText(workRequest.getSender().getUsername());
        reqTypeTextField.setText(workRequest.getReqType());
        statusTextField.setText(workRequest.getStatus());
        reqUnitsTextField.setText(String.valueOf(workRequest.getRemainingQty()));
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        reqManagerTextField = new javax.swing.JTextField();
        reqTypeTextField = new javax.swing.JTextField();
        statusTextField = new javax.swing.JTextField();
        reqUnitsTextField = new javax.swing.JTextField();
        availUntsTextField = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Individual Admin View Details");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 41, 380, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Requested Manager:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Request Type:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Status:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Requested Number of Units:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Available Number of Units:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        reqManagerTextField.setEditable(false);
        reqManagerTextField.setForeground(new java.awt.Color(102, 0, 102));
        add(reqManagerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 150, -1));

        reqTypeTextField.setEditable(false);
        reqTypeTextField.setForeground(new java.awt.Color(102, 0, 102));
        add(reqTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 150, 20));

        statusTextField.setEditable(false);
        statusTextField.setForeground(new java.awt.Color(102, 0, 102));
        add(statusTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 150, -1));

        reqUnitsTextField.setEditable(false);
        reqUnitsTextField.setForeground(new java.awt.Color(102, 0, 102));
        add(reqUnitsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 150, -1));

        availUntsTextField.setForeground(new java.awt.Color(102, 0, 102));
        add(availUntsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 150, -1));

        updateBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(102, 0, 102));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        backBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(102, 0, 102));
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons/man-helping-saving-life-rescue_gg64425313.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int requiredUnits;
        int availableUnits = Integer.parseInt(availUntsTextField.getText());
        int requestedUnits = Integer.parseInt(reqUnitsTextField.getText());
        if (availableUnits <= requestedUnits) {
            requiredUnits = (requestedUnits - availableUnits);
            workRequest.setRemainingQty(requiredUnits);
            workRequest.setStatus("Allocated");
            JOptionPane.showMessageDialog(null, "Details updated Successfully");
            availUntsTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Available volunteers cannot be more than Required Volunteers");
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        Personal_ViewRequestPanel individualViewRequestJPanel = (Personal_ViewRequestPanel) component;
        individualViewRequestJPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availUntsTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField reqManagerTextField;
    private javax.swing.JTextField reqTypeTextField;
    private javax.swing.JTextField reqUnitsTextField;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
