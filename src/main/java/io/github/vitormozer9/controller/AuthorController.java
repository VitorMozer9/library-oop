package io.github.vitormozer9.controller;

import io.github.vitormozer9.model.Author;
import io.github.vitormozer9.model.Library;
import io.github.vitormozer9.utils.DateConversion;
import io.github.vitormozer9.view.AuthorView;

public class AuthorController {
    private DateConversion conversionDateToString = new DateConversion();
    private AuthorView authorView = new AuthorView();
    private Library libraryObj;

    public AuthorController(Library libraryObj) {
        this.libraryObj = libraryObj;
    }
    
    public void execAuthorMenu(){
        int optionOnAuthorMenu = authorView.showAuthorOptions();
        
        switch(optionOnAuthorMenu){
            case 1: {
            Author newAuthor = new Author(authorView.getAuthorName(),
                                      conversionDateToString.converterStringOnDate(authorView.getDateOfBirth()));
               libraryObj.addAuthorsInList(newAuthor);
               System.out.println("Author registered successfully!");
               break;   
            }
            case 2: {
                int idEditAuthor= authorView.editAuthor();
                String newTitleBook = authorView.catchingNewNameAuthor();
                libraryObj.editThisAuthor(idEditAuthor, newTitleBook);
                break;
            }
            case 3: {
                int removedAuthor = authorView.removeAuthor();

                    if (removedAuthor != -1){
                        libraryObj.removeAuthorThisArray(removedAuthor);
                    }
                    else {
                        System.out.println("Author ID not found! Please try again");
                    }
                break;
            }
            case 4: {
               String authorInfo = libraryObj.showAuthor(authorView.getAuthorID());
               if (authorInfo != null){
                  System.out.println(authorInfo);
               }
               else{
                System.out.println("Author ID not found! Please try again");
               }
                break;
            }
        }
    }
}
