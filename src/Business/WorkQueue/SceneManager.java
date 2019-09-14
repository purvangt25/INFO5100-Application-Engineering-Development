/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author shash
 */
public class SceneManager extends WorkRequest {
    private String RequestQty;
    private boolean Add;
    private String RequestType;
    private String RequestOrg;
    private String RequestId;
    private static int wCount=0;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }


    public String getRequestOrg() {
        return RequestOrg;
    }

    public void setRequestOrg(String reqOrg) {
        this.RequestOrg = reqOrg;
    }

    public String getRequestType() {
        return RequestType;
    }

    public void setRequestType(String reqType) {
        this.RequestType = reqType;
    }

    public String getRequestQty() {
        return RequestQty;
    }

    public void setRequestQuantity(String requestQty) {
        this.RequestQty = requestQty;
    }

    public boolean isAdd() {
        return Add;
    }

    public void setAdd(boolean add) {
        this.Add = add;
    }
    
    public SceneManager(){
        Add = false;
        RequestId= "RQ"+ (++wCount);
    }
    
}
