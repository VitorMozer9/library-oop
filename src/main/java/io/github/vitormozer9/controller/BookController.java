package io.github.vitormozer9.controller;
import io.github.vitormozer9.model.*;
import io.github.vitormozer9.view.*;
import java.util.Date;
import io.github.vitormozer9.utils.*;

public class BookController {
    private DateConversion conversionDateToString = new DateConversion();
    private BookView bookViewObj = new BookView();
    private Library libraryObj;

    public BookController(Library libraryObj) {
        this.libraryObj = libraryObj;
    }

    public void execBookMenu(){
        int optionOnBookMenu = bookViewObj.showBookOptions();
        switch(optionOnBookMenu){
            case 1: {
                String titleBook = bookViewObj.getTitleBook();

                int authorId = bookViewObj.getAuthorID();
                Author selectedAuthor = libraryObj.searchAuthorByIdButReturnAuthor(authorId);

                if (selectedAuthor == null) {
                    System.out.println("Author ID not found! Please register the author first.");
                    break;
                }

                String registerDateText = bookViewObj.getDate();

                Book newBook = new Book(
                    titleBook,
                    selectedAuthor,
                    true,
                    conversionDateToString.converterStringOnDate(registerDateText),
                    new Date()
                );

                libraryObj.addBooksInList(newBook);
                System.out.println("Book registered successfully!");
                break;  
            }
            case 2: {
                int idEditABook = bookViewObj.editABook();
                String newTitleBook = bookViewObj.catchingNewNameBook();
                libraryObj.editThisBook(idEditABook, newTitleBook);
                break;
            }
            case 3: {
                int removedBook = bookViewObj.removeABook();
                libraryObj.removeBookThisArray(removedBook);
                break;
            }
            case 4: {
               String bookInfo = libraryObj.showABook(bookViewObj.getBookID());
               if (bookInfo != null){
                  System.out.println(bookInfo);
               }
               else{
                System.out.println("Book not found!");
               }
                break;
            }
        }
    }

}
