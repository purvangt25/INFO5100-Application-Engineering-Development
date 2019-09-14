/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.HashSet;
import Business.Scene.SceneDirectory;

/**
 *
 * @author shash
 */
public class ReportingAgencyEnterprise extends Enterprise {

    public SceneDirectory getSiteList() {
        return sceneList;
    }

    public void setSiteList(SceneDirectory sceneList) {
        this.sceneList = sceneList;
    }
    
    private SceneDirectory sceneList;
    
     public ReportingAgencyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.ReportingAgencyEnterprice);
    }
    
    
    @Override
    public HashSet<Role> getSupportedRole() {
         roles= new HashSet<Role>();
        return roles;
    }
}
    
    

