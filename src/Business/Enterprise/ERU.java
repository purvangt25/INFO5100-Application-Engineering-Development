/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.DisasterSceneHead;
import Business.Role.FireSafetyHead;
import Business.Role.MedicalAgencySupervisor;
import Business.Role.Police;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author shash
 */
public class ERU extends Enterprise {

    public ERU(String name) {
        super(name, Enterprise.EnterpriseType.ERU);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles = new HashSet<Role>();
        roles.add(new FireSafetyHead());
        roles.add(new Police());
        roles.add(new MedicalAgencySupervisor());
       roles.add(new DisasterSceneHead());
        return roles;
    }

}
