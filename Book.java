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
public class Book extends Document{
    private String author;
    private int pages;

    public Book() {
    }

    public Book(String code, String company, int amount, String author, int pages) {
        super(code, company, amount);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString()+", " + author + ", " + pages;
    }
    
}
