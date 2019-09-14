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
import UI_VoluntaryTeam_Personal.Personal_ViewRequestPanel;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public class PersonalAdmin extends Role {

    @Override
    public String toString() {
        return (RoleType.PersonalAdmin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new Personal_ViewRequestPanel(userProcessContainer, account, organization, enterprise, network, business);
    }

}
