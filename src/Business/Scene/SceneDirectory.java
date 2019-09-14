/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Scene;

import java.util.ArrayList;
import Business.Scene.Scene;

/**
 *
 * @author purva
 */
public class SceneDirectory {
    
    private ArrayList<Scene> sceneList;

    public ArrayList<Scene> getSceneList() {
        return sceneList;
    }

    public void setSceneList(ArrayList<Scene> sceneList) {
        this.sceneList = sceneList;
    }


    public SceneDirectory(){
        sceneList= new ArrayList<Scene>();
                
    }
    
     public Scene addScene() {
        Scene scene = new Scene();
        sceneList.add(scene);
        return scene;
    }
    
    //Removing an Employee from the Directory
    public void removeSite(Scene scene) {
        sceneList.remove(scene);
    }

    
}
