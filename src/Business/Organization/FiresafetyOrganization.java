/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author purva
 */
public class FiresafetyOrganization extends Organization {
    private String name;

    public FiresafetyOrganization(String name) {
        super(name);
        this.name = name;
        fireSafety=name;
    }
    
    private String fireSafety;

    public String getFireSafety() {
        return fireSafety;
    }

    public void setFireSafety(String fireSafety) {
        this.fireSafety = fireSafety;
    }

   

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    
}
}

