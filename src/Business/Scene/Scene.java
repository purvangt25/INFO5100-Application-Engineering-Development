/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Scene;

import Business.Position;

/**
 *
 * @author purva
 */
public class Scene {

    private String sceneName;
    private String sceneId;
    private static int sCount = 0;
    private int num_victims;
    private String area_affected;
    private String loss_estimation;
    private int zipcode;
    private Position latLong;

    public Position getLatLong() {
        return latLong;
    }

    public void setLatLong(Position latLong) {
        this.latLong = latLong;
    }

    public Scene() {
        sceneId = "SCENE" + (++sCount);
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public static int getsCount() {
        return sCount;
    }

    public static void setsCount(int sCount) {
        Scene.sCount = sCount;
    }

    public int getNum_victims() {
        return num_victims;
    }

    public void setNum_victims(int num_victims) {
        this.num_victims = num_victims;
    }

    public String getArea_affected() {
        return area_affected;
    }

    public void setArea_affected(String area_affected) {
        this.area_affected = area_affected;
    }

    public String getLoss_estimation() {
        return loss_estimation;
    }

    public void setLoss_estimation(String loss_estimation) {
        this.loss_estimation = loss_estimation;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    
    @Override
    public String toString() {
        return sceneName;
    }

}
