/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Scene.SceneDirectory;
import java.util.HashSet;

/**
 *
 * @author purva
 */
public class DisasterOrganization extends Organization {

    SceneDirectory sceneDirectory;
    private String name;

    public DisasterOrganization(String name) {
        super(name);
        this.name = name;
        disasterName = name;

    }

    public SceneDirectory getSiteDirectory() {
        return sceneDirectory;
    }

    public void setSiteDirectory(SceneDirectory siteDirectory) {
        this.sceneDirectory = sceneDirectory;
    }

    private String disasterName;

    public String getDisasterName() {
        return disasterName;
    }

    public void setDisasterName(String disasterName) {
        this.disasterName = disasterName;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }

}
