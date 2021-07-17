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
public class Document {
    private String code;
    private String company;
    private int amount;

    public Document() {
    }

    public Document(String code, String company, int amount) {
        this.code = code;
        this.company= company;
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String author) {
        this.company = company;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return code + ", " + company + ", " + amount;
    }
    
}
