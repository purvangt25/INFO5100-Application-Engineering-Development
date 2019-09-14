/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Department.Department.Type;
import Business.Organization.CollectionOrganization;
import Business.Organization.CompanyOrganization;
import Business.Organization.PersonalOrganization;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.Organization.FiresafetyOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.MedicalOrganization;
import Business.Organization.PoliceOrganization;
import Business.Organization.ReportOrganization;
import java.util.ArrayList;

/**
 *
 * @author purva
 */
public class DepartmentDirectory {
     private ArrayList<Department> departmentlist;

    public ArrayList<Department> getDepartmentlist() {
        return departmentlist;
    }
     
      public DepartmentDirectory() {
        departmentlist = new ArrayList<Department>();
}
public Department createdeptartment(Department.Type type, String name) {
        Department department = null;
        if (type.getValue().equals(Type.cardio.getValue())) {
            department = new CardioDepartment();
            departmentlist.add(department);
             } else if (type.getValue().equals(Type.bones.getValue())) {
            department = new BonesDepartment();
            departmentlist.add(department);
        } else if (type.getValue().equals(Type.brain.getValue())) {
            department = new BrainDepartment();
            departmentlist.add(department);
        } else if (type.getValue().equals(Type.neuro.getValue())) {
            department = new NeuroDepartment();
            departmentlist.add(department);
        
        }
        
return department;

}
}


   

