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
public class HospitalOrganization extends Organization {

    private String name;
    public HospitalOrganization(String name) {
        super(name);
        this.name = name;
        hospital = name;
    }

    private String hospital;

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;

    }
}
