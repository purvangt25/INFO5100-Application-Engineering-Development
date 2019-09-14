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
public class PoliceOrganization extends Organization {
    private String name;

    public PoliceOrganization(String name) {
        super(name);
        this.name = name;
        Police = name;
    }

    private String Police;

    public String getPolice() {
        return Police;
    }

    public void setPolice(String Police) {
        this.Police = Police;
    }

       @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
}
