/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author purva
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> WorkRequestList;

    public WorkQueue() {
        WorkRequestList = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return WorkRequestList;
    }
}