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
 * @author nikhil
 */
public class NGOOrganization extends Organization {

    private String name;

    public NGOOrganization(String name) {
        super(name);
        this.name = name;
        ngo = name;
    }

    private String ngo;

    public String getNgo() {
        return ngo;
    }

    public void setNgo(String ngo) {
        this.ngo = ngo;
    }

   
    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
}
