/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Reporting_Agency_AdminPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shash
 */
public class ReportingAgency_AdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportingAgency_AdminPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    UserAccount account;
    Organization organization;
    Network network;

    public ReportingAgency_AdminPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = business;
        this.account = account;
        this.network = network;

        enterpriseLabel.setText(enterprise.getName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageOrganizationsJButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageSitesJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons/Home_48px.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        manageOrganizationsJButton.setBackground(new java.awt.Color(255, 255, 255));
        manageOrganizationsJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        manageOrganizationsJButton.setForeground(new java.awt.Color(102, 0, 102));
        manageOrganizationsJButton.setText("Manage Organizations");
        manageOrganizationsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationsJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(manageOrganizationsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 210, 100));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons/Bridge_48px.png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        manageSitesJButton.setBackground(new java.awt.Color(255, 255, 255));
        manageSitesJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        manageSitesJButton.setForeground(new java.awt.Color(102, 0, 102));
        manageSitesJButton.setText("Manage Scene");
        manageSitesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSitesJButtonActionPerformed(evt);
            }
        });
        jPanel5.add(manageSitesJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 210, 110));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Reporting Agency Administrator Work Area");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 520, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Enterprise Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jPanel2.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 150, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/icons/imagesNP6OJXQC.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 260, 200));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 662, 417));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationsJButtonActionPerformed
        // TODO add your handling code here:

        ReportingAgency_Organization_ManagementPanel ramop = new ReportingAgency_Organization_ManagementPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("ReportingAgency_Organization_ManagementPanel", ramop);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationsJButtonActionPerformed

    private void manageSitesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSitesJButtonActionPerformed
        // TODO add your handling code here:

         ReportingAgency_Scene_ManagementPanel manageEnterpriseJPanel = new ReportingAgency_Scene_ManagementPanel(userProcessContainer, account, organization, enterprise, network, system);
         userProcessContainer.add("ReportingAgency_Scene_ManagementPanel", manageEnterpriseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageSitesJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton manageOrganizationsJButton;
    private javax.swing.JButton manageSitesJButton;
    // End of variables declaration//GEN-END:variables
}
