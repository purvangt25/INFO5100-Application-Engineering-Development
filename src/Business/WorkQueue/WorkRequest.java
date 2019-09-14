/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author purva
 */
public abstract class WorkRequest {

    private String msg;
    private UserAccount Sender;
    private UserAccount Receiver;
    private String Status;
    private Date RequestDate;
    private Date ResolveDate;
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UserAccount getSender() {
        return Sender;
    }

    public void setSender(UserAccount Sender) {
        this.Sender = Sender;
    }

    public UserAccount getReceiver() {
        return Receiver;
    }

    public void setReceiver(UserAccount Receiver) {
        this.Receiver = Receiver;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getRequestDate() {
        return RequestDate;
    }

    public void setRequestDate(Date RequestDate) {
        this.RequestDate = RequestDate;
    }

    public Date getResolveDate() {
        return ResolveDate;
    }

    public void setResolveDate(Date ResolveDate) {
        this.ResolveDate = ResolveDate;
    }

    

    
    @Override
    public String toString() {
        return Status;
    }
}
