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
import UI_VoluntaryTeam_Hospital.Hospital_WorkPanel;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */

public class HospitalAdmin extends Role {

    @Override
    public String toString() {
        return (RoleType.HospitalAdmin.getValue());
    }
    
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new Hospital_WorkPanel(userProcessContainer, account, organization, enterprise, network, business);
    }

}
