/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ManagementBook {
    ArrayList<Document> documents;

    public ManagementBook() {
        documents = new ArrayList<Document>();
    }

    public void add(Document doc){
        this.documents.add(doc);
    }
    public void delete( String a){
        for (int i = 0; i < documents.size(); i++) {
            if(a.compareToIgnoreCase(documents.get(i).getCode())==0){
                documents.remove(i);
                break;
            }
        }
    }
    
    public void display(){
        boolean temp = false;
        for (int i = 0; i < documents.size() ; i++) {
            System.out.println("Document "+i+ ":" + documents.get(i) );
            temp = true;
        }
        if ( temp == false) {
            System.out.println("List empty!");
        }
    }
    public void searchBook(Document a , String c){
        boolean temp = false;
        for (int i = 0; i < documents.size() ; i++) {
            if(c.compareToIgnoreCase(documents.get(i).getCode())==0){
                if(a instanceof Book) {
                    System.out.println("Book " +i+ ":"+documents.get(i));
                    temp = true;
                    break;
                } else {
                }
            }
        }
        if(temp == false){
            System.out.println("Error! Not found Book");
        }
    }
    public void searchJournal(Document a , String c){
        boolean temp = false;
        for (int i = 0; i < documents.size() ; i++) {
            if(c.compareToIgnoreCase(documents.get(i).getCode())==0){
                if(a instanceof Journal) {
                    System.out.println("Journal " +i+ ":"+documents.get(i));
                    temp = true;
                    break;
                } else {
                }
            }
        }
        if(temp == false){
            System.out.println("Error! Not found Journal");
        }
    }
    public void searchNewspaper(Document a , String c){
        boolean temp = false;
        for (int i = 0; i < documents.size() ; i++) {
            if(c.compareToIgnoreCase(documents.get(i).getCode())==0){
                if(a instanceof Newspaper) {
                    System.out.println("Newspaper " +i+ ":"+documents.get(i));
                    temp = true;
                    break;
                } else {
                }
            }
        }
        if(temp == false){
            System.out.println("Error! Not found Newspaper");
        }
    }
}
