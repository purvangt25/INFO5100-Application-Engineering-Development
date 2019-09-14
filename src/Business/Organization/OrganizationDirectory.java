/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Position;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author shash
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type, String name, Position position) {
        Organization organization = null;
        if (type.getValue().equals(Type.Collection.getValue())) {
            organization = new CollectionOrganization();
            organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Company.getValue())) {
            organization = new CompanyOrganization(name);
            CompanyOrganization company = (CompanyOrganization) organization;
            company.setComp(name);
            organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGO.getValue())) {
            organization = new NGOOrganization(name);
            NGOOrganization ngo = (NGOOrganization) organization;
            ngo.setNgo(name);
            organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Personal.getValue())) {
           organization = new PersonalOrganization(name);
          PersonalOrganization personal = (PersonalOrganization) organization;
           personal.setPersonal(name);
            organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Hospital.getValue())) {
            organization = new HospitalOrganization(name);
          HospitalOrganization hospital = (HospitalOrganization) organization;
           hospital.setHospital(name);
            organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Police.getValue())) {
            organization = new PoliceOrganization(name);
            PoliceOrganization police = (PoliceOrganization) organization;
           police.setPolice(name);
            organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FireSafety.getValue())) {
            organization = new FiresafetyOrganization(name);
           FiresafetyOrganization fireSafety = (FiresafetyOrganization) organization;
           fireSafety.setFireSafety(name);
            organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Medicines.getValue())) {
            organization = new MedicalOrganization(name);
            MedicalOrganization medical = (MedicalOrganization) organization;
            medical.setMedicenes(name);
            organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ReportingAgency.getValue())) {
            organization = new ReportOrganization(name);
            ReportOrganization report = (ReportOrganization) organization;
            report.setReport(name);
            organization.setPosition(position);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DisasterManagementTeam.getValue())) {
            organization = new DisasterOrganization(name);
            DisasterOrganization disaster = (DisasterOrganization) organization;
            disaster.setDisasterName(name);
            organization.setPosition(position);
            organizationList.add(organization);
        }
        return organization;
    }
}
