package io.github.vitormozer9.model;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBooksInList(Book book){
        this.books.add(book);
    }
    
    public String getAllBooks() {
        return books.toString();
    }

    public int searchBookById(int id){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getIdBook() == id){
                return i;
            }           
        }
        return -1;
    }

    public String showABook(int id){
        for(Book searchBook : books){
            if(searchBook.getIdBook() == id){
                return searchBook.toString();
            }           
        }
        return null;
    }   

    public void removeBookThisArray(int id){
        int bookRemoved = searchBookById(id);

        if (bookRemoved >= 0){
           books.remove(bookRemoved); 
        }
    }

    public void editThisBook(int idBook, String newTitleBook){
        int bookEdited = searchBookById(idBook);
        
        if (bookEdited >= 0){
            books.get(bookEdited).setTitleBook(newTitleBook);
        }
    }

    public void addAuthorsInList(Author author){
        this.authors.add(author);
    }
    
    public String getAllAuthors() {
        return authors.toString();
    }

    public int searchAuthorById(int id){
        for(int i = 0; i < authors.size(); i++){
            if(authors.get(i).getIdAuthor() == id){
                return i;
            }           
        }
        return -1;
    }

    public void addLoansInList(Loan loan){
        this.loans.add(loan);
    }
    
    public String getAllLoans() {
        return loans.toString();
    }

    public int searchLoanById(int id){
        for(int i = 0; i < loans.size(); i++){
            if(loans.get(i).getIdLoan() == id){
                return i;
            }           
        }
        return -1;
    }

    public String searchLoanBookName(String bookName){
        for(int i = 0; i < loans.size(); i++){
            String compareBookLoan = books.get(i).getTitleBook();
            if(compareBookLoan == bookName){
                return compareBookLoan;
            }           
        }
        return null;
    }

     public Book searchLoanBookNameButReturnLoan(String bookName){
        for(Book book : books){
            if(book.getTitleBook().trim().equalsIgnoreCase(bookName.trim())){
                return book;
            }           
        }
        return null;
    }

    public void removeLoanThisArray(int id){
        int loanRemoved = searchLoanById(id);

        if (loanRemoved >= 0){
           loans.remove(loanRemoved); 
        }
    }

    public void editThisAuthor(int idAuthor, String newAuthorName){
        int AuthorEdited = searchAuthorById(idAuthor);
        
        if (AuthorEdited >= 0){
            authors.get(AuthorEdited).setName(newAuthorName);
        }
    }

    public void removeAuthorThisArray(int id){
        int authorRemoved = searchAuthorById(id);

        if (authorRemoved >= 0){
           authors.remove(authorRemoved); 
        }
    }

    public String showAuthor(int id){
        for(Author searchAuthor : authors){
            if(searchAuthor.getIdAuthor() == id){
                return searchAuthor.toString();
            }           
        }
        return null;
    }

    public Book searchBookByIdButReturnBook(int id){
        for(Book book : books){
            if(book.getIdBook() == id){
                return book;
            }           
        }
        return null;
    }

     public Author searchAuthorByIdButReturnAuthor(int id){
        for(Author author : authors){
            if(author.getIdAuthor() == id){
                return author;
            }           
        }
        return null;
    }

    public String showLoan(int id){
        for(Loan searchLoan : loans){
            if(searchLoan.getIdLoan() == id){
                return searchLoan.toString();
            }           
        }
        return null;
    }

}
