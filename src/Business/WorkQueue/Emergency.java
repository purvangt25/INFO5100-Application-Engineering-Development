/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author purva
 */
public class Emergency extends WorkRequest {

    private int Qty;
    private String RequestOrg;
    private String RequestType;
    private int remainingQty;

    public int getRemainingQuantity() {
        return remainingQty;
    }

    public void setRemainingQuantity(int remainingQuantity) {
        this.remainingQty = remainingQuantity;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int quantity) {
        this.Qty = quantity;
    }

    public String getRequestOrg() {
        return RequestOrg;
    }

    public void setRequestOrg(String requestOrg) {
        this.RequestOrg = requestOrg;
    }

    public String getRequestType() {
        return RequestType;
    }

    public void setReqType(String requestType) {
        this.RequestType = requestType;
    }

}
