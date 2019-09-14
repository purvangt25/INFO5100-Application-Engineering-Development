/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author nikhil
 */
public class Resource extends WorkRequest {

    private String ReqType;

    public String getReqType() {
        return ReqType;
    }

    public void setReqType(String ReqType) {
        this.ReqType = ReqType;
    }
    private int Qty;
    private int RemainingQty;
    
    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public int getRemainingQty() {
        return RemainingQty;
    }

    public void setRemainingQty(int RemainingQty) {
        this.RemainingQty = RemainingQty;
    }

    

    
}
