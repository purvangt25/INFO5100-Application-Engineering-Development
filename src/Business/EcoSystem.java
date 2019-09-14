package Business;


import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdmin;
import Business.Scene.SceneDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;
import Business.Role.HospitalAdmin;

/**
 *
 * @author shash
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private SceneDirectory sceneList;

    public SceneDirectory getSceneList() {
        return sceneList;
    }

    public void setSceneList(SceneDirectory sceneList) {
        this.sceneList = sceneList;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        sceneList = new SceneDirectory();

    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(EcoSystem system) {
        business = system;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new HospitalAdmin());
        roles.add(new SystemAdmin());
        
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

          for (Network network : business.getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(username)) {
                        return false;
                    }
                }

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equals(username)) {
                            return false;
                        }
                    }
                }
            }
        }

              return true;
    }
}