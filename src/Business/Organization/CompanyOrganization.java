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
public class CompanyOrganization extends Organization {

    private String name;

     public CompanyOrganization(String name) {
        super(name);
        this.name = name;
         comp = name;
    }

    private String comp;

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

 
    @Override
    public HashSet<Role> getSupportedRole() {

        return null;
    }

}
