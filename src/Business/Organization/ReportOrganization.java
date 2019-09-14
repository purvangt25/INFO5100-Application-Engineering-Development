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
 * @author purva
 */
public class ReportOrganization extends Organization {
    private String name;

    public ReportOrganization(String name) {
        super(name);
        this.name = name;
        report = name;
    }

    private String report;

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
        

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
}
