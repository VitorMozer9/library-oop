package io.github.vitormozer9.model;
import java.util.Date;

public class Book {
    private int idBook;
    private String titleBook;
    private Author author;
    private boolean available;
    private Date registerDate;
    private Date updateDate;
    private int stock;

    private static int counterIdBook = 1;

    public Book(String titleBook, Author author, boolean available, Date registerDate,Date updateDate){
        this.idBook = counterIdBook++;
        this.titleBook = titleBook;
        this.author = author;
        this.available = available;
        this.registerDate = registerDate;
        this.updateDate = updateDate;   
    }

    public int getIdBook(){
        return idBook;
    }

    public void setIdBook(int idBook){
        this.idBook = idBook;
    }

    public String getTitleBook(){
        return titleBook;
    }

    public void setTitleBook(String titleBook){
        this.titleBook = titleBook;
    }

    public Author getAuthor(){
        return author;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public Date getRegisterDate(){
        return registerDate;
    }

    public void setRegisterDate(Date registerDate){
        this.registerDate = registerDate;
    }

    public Date getUpdateDate(){
        return updateDate;
    }

    public void setUpdateDate(Date updateDate){
        this.updateDate = updateDate;
    }

    public int getStrock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public boolean verifyStock(){
        if (stock <= 0){
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
 
        return "ID: " + idBook + "\n" +
               "Name: " + titleBook + "\n" +
               "Author: " + author.getName() + "\n" +
               "Date: " + registerDate + "\n" +
               "Available: " + available + "\n" +
               "Stock: " + stock;
    }

}
