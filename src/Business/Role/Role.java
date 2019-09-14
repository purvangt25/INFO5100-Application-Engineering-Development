/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author nikhil
 */
public abstract class Role {

    public enum RoleType {

        SystemAdmin("SystemAdmin"),
        HospitalAdmin("HospitalAdmin"),
        ERUAdmin("ERUAdmin"),
        VoluntaryTeamAdmin("VoluntaryTeamAdmin"),
        ReportingAgencyHead("ReportingAgencyHead"),
        Doctor("Doctor"),
        ResourceHead("ResourceHead"),
        CompanyManager("CompanyManager"),
        NGOAdmin("NGOAdmin"),
        PersonalAdmin("PersonalAdmin"),
        Police("Police"),
        FireSafetyHead("FireSafetyHead"),
        MedicalAgencySupervisor("MedicalAgencySupervisor"),
        ReportHead("ReportHead"),
        DisasterSceneHead("DisasterSceneHead"),
        SceneManager("SceneManager");
        

        private String value;

        public String getValue() {
            return value;
        }

        private RoleType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
