package io.github.vitormozer9.model;
import java.util.Date;

public class Loan {
    
    private int idLoan;
    private Book book;
    private String clientName;
    private Date loanDate;
    private Date returnDate;

    private static int counterIdLoan = 1;

    public Loan(Book book, String clientName, Date loanDate, Date returnDate){
        this.idLoan = counterIdLoan++;
        this.book = book;
        this.clientName = clientName;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public int getIdLoan(){
        return idLoan;
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book book){
        this.book = book;
    }

    public String getClientName(){
        return clientName;
    }

    public void setClientName(String clientName){
        this.clientName = clientName;
    }

    public Date getLoanDate(){
        return loanDate;
    }

    public void setLoanDateBook(Date loanDate){
        this.loanDate = loanDate;
    }

    public Date getreturnDate(){
        return returnDate;
    }

    public void setReturnDate(Date returnDate){
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
 
        return "Loan ID: " + idLoan + "\n" +
               "Book: " + book.getTitleBook() + "\n" +
               "Loan Date: " + loanDate;
    }

}
