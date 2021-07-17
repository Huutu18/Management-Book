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
public class Newspaper extends Document{
    private int releasedate;

    public Newspaper() {
    }

    public Newspaper(String code, String company, int amount, int releasedate) {
        super(code, company, amount);
        this.releasedate = releasedate;
    }

    public int getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(int releasedate) {
        this.releasedate = releasedate;
    }

    @Override
    public String toString() {
        return super.toString() +", "+ releasedate;
    }
    
}
