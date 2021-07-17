/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author Admin
 */
public class Journal extends Document{
    private int deliverynumber;
    private int deliverymonth;

    public Journal() {
    }

    public Journal(String code, String company, int amount, int deliverynumber, int deliverymonth) {
        super(code, company, amount);
        this.deliverynumber = deliverynumber;
        this.deliverymonth = deliverymonth;
    }

    public int getDeliverynumber() {
        return deliverynumber;
    }

    public void setDeliverynumber(int deliverynumber) {
        this.deliverynumber = deliverynumber;
    }

    public int getDeliverymonth() {
        return deliverymonth;
    }

    public void setDeliverymonth(int deliverymonth) {
        this.deliverymonth = deliverymonth;
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + deliverynumber + ", " + deliverymonth;
    }
    
}
