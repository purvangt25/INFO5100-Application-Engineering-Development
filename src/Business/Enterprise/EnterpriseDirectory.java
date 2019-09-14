/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author purva
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

       public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if (type == Enterprise.EnterpriseType.VoluntaryTeam) {
            enterprise = new VoluntaryTeamER(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.ERU) {
            enterprise = new ERU(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.ReportingAgencyEnterprice) {
            enterprise = new ReportingAgencyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
