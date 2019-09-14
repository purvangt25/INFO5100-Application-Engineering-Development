/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author shash
 */
public class CollectionOrganization extends Organization{

    public CollectionOrganization() {
        super(Organization.Type.Collection.getValue());
    }


    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }

    
}
