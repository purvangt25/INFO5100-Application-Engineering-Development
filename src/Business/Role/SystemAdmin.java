/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI_SystemAdmin.System_AdminPanel;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public class SystemAdmin extends Role {

    @Override
    public String toString() {
        return (RoleType.SystemAdmin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system) {
        return new System_AdminPanel(userProcessContainer,network, system);
    }

}
