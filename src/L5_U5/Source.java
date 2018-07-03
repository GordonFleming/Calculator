/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5_U5;

/**
 *
 * @author 24740
 */
public class Source {
    private String author;
    private String year;
    private String title;
    
    public Source(String a, String y, String t){
        author = a;
        year = y;
        title = t;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override                   
    public String toString(){                                                   
    return getAuthor() + "\t" + year.replaceAll("[\\(\\)]","") + "\t" + getTitle();
    }
}