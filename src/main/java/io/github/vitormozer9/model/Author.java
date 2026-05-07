package io.github.vitormozer9.model;
import java.util.Date;

public class Author {
    private static int counterIdBook = 1;

    private int idAuthor;
    private String name;
    private Date date;

    public Author(String name,Date date){
        this.idAuthor = counterIdBook++;
        this.name = name;
        this.date = date;
    }

    public int getIdAuthor(){
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor){
        this.idAuthor = idAuthor;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public String toString() {
 
        return "ID: " + idAuthor + "\n" +
               "Name: " + name + "\n" +
               "Date: " + date;
    }
}
