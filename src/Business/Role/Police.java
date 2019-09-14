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
import UI_Police_Admin_Panel.Police_Admin_Panel;
import javax.swing.JPanel;

/**
 *
 * @author purva
 */
public class Police extends Role {

    @Override
    public String toString() {
        return (RoleType.Police.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new Police_Admin_Panel(userProcessContainer, account, organization, enterprise, network, business);
    }

}
