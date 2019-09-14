/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Role.CompanyManager;
import Business.Role.HospitalAdmin;
import Business.Role.PersonalAdmin;

import Business.Role.NGOAdmin;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author nikhil
 */

public class VoluntaryTeamER extends Enterprise {

    public VoluntaryTeamER(String name) {
        super(name, Enterprise.EnterpriseType.VoluntaryTeam);
    }

    
    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<Role>();
        roles.add(new CompanyManager());
        roles.add(new PersonalAdmin());
        roles.add(new HospitalAdmin());
        roles.add(new NGOAdmin());
        return roles;
    }
}
