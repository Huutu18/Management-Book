/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) { 
        ManagementBook managementBook = new ManagementBook();
        Scanner sc = new Scanner(System.in);
       
        do{
        System.out.println("1.  Add New Document");
        System.out.println("2.  Display Document Information");
        System.out.println("3.  Delete Document By Code");
        System.out.println("4.  Search Document By Code");
        System.out.println("0.  Exit");
        System.out.print("Enter TC (0,1,2,3,4) : ");
        int sum;
        sum = sc.nextInt();
        switch(sum){
            case 1:{
                System.out.println("a.  Add Book");
                System.out.println("b.  Add Jornal");
                System.out.println("c.  Add Newspaper");
                System.out.print("Enter TC (a, b ,c) :");
                String check;
                check = sc.next();
                switch(check){
                    case "a":{
                        String code , company , author;
                        int amount , pages;
                        System.out.print("Enter code :");
                        code = sc.next();
                        System.out.print("Enter company : ");
                        company = sc.next();
                        System.out.print("Enter amount : ");
                        amount = sc.nextInt();
                        System.out.print("Enter author : ");
                        author = sc.next();
                        System.out.print("Enter pages : ");
                        pages = sc.nextInt();
                        Document book = new Book(code, company, amount, author, pages);
                        managementBook.add(book);
                        System.out.println(book);
                        break;
                    }
                    case "b":{
                        String code , company;
                        int amount , deliverynumber , deliverymonth;
                        System.out.print("Enter code :");
                        code = sc.next();
                        System.out.print("Enter company : ");
                        company = sc.next();
                        System.out.print("Enter amount : ");
                        amount = sc.nextInt();
                        System.out.print("Enter delivery number : ");
                        deliverynumber = sc.nextInt();
                        System.out.print("Enter delivery month : ");
                        deliverymonth = sc.nextInt();
                        Document journal = new Journal(code, company, amount, deliverynumber, deliverymonth);
                        managementBook.add(journal);
                        System.out.println(journal);
                        break;
                    }
                    case "c":{
                        String code , company;
                        int amount, releasedate;
                        System.out.print("Enter code :");
                        code = sc.next();
                        System.out.print("Enter company : ");
                        company = sc.next();
                        System.out.print("Enter amount : ");
                        amount = sc.nextInt();
                        System.out.print("Enter release date : ");
                        releasedate = sc.nextInt();
                        Document newspaper = new Newspaper(code, company, amount, releasedate);
                        managementBook.add(newspaper);
                        System.out.println(newspaper);
                        break;
                    }
                }
                break;
            }
            case 4:{
                String tmp;
                System.out.println("d.  Search Book");
                System.out.println("e.  Search Journal");
                System.out.println("f.  Search Newspaper");
                System.out.print("Enter TC (d, e ,f) ");
                tmp = sc.next();
                switch(tmp){
                    case "d":{
                        Book book = new Book();
                        String code;
                        System.out.print("Enter code :");
                        code = sc.next();
                        managementBook.searchBook(book, code);
                        break;
                    }
                    case "e":{
                        Journal journal = new Journal();
                        String code;
                        System.out.print("Enter code :");
                        code = sc.next();
                        managementBook.searchJournal(journal, code);
                        break;
                    }
                    case "f":{
                        Newspaper newspaper = new Newspaper();
                        String code;
                        System.out.print("Enter code :");
                        code = sc.next();
                        managementBook.searchNewspaper(newspaper, code);
                        break;
                    }
                }
                break;
            }
            case 3:{
                String a;
                System.out.print("Enter code :");
                a = sc.next();
                managementBook.delete(a);
                break;
            }
            case 2:{
                managementBook.display();
                break;
            }
            case 0:{
                System.exit(sum);
                break;
            }
        }
        } while(true);
    }
}
