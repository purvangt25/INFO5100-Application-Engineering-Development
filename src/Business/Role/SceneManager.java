
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DisasterOrganization;
import Business.Organization.Organization;
import Business.Scene.Scene;
import Business.UserAccount.UserAccount;
import UI_Scene_Management.Scene_ManagePanel;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public class SceneManager extends Role {

    Scene scene;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @Override
    public String toString() {
        return (RoleType.SceneManager.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new Scene_ManagePanel(userProcessContainer, account, organization, enterprise, network, business); //To change body of generated methods, choose Tools | Templates.
    }

}
