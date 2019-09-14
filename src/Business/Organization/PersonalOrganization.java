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
public class PersonalOrganization extends Organization {

    private String name;
    public PersonalOrganization(String name) {
        super(name);
        this.name = name;
        personal = name;

    }

    private String personal;

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;

    }
}
