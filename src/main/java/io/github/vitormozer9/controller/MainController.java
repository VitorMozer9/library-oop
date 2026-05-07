package io.github.vitormozer9.controller;
import io.github.vitormozer9.model.Library;
import io.github.vitormozer9.view.MainView;

public class MainController{

    private MainView startView = new MainView();
    Library libraryObj = new Library();
    private BookController bookControllerObj = new BookController(libraryObj);
    private AuthorController authorController = new AuthorController(libraryObj);
    private LoanController loanController = new LoanController(libraryObj);

    public void startSystem(){
        boolean loop = true;

        while(loop){
            int availableOption = startView.showAvailableOptions();

            switch (availableOption) {
                case 1:
                    bookControllerObj.execBookMenu();
                    break;
                case 2:
                    authorController.execAuthorMenu();
                    break;
                case 3: {
                    loanController.execLoanMenu();
                    break;
                }
                case 4: {
                    System.out.println("Closing system...");
                    loop = false;
                    break;
                }

                default:
                    System.out.println("Invalid option! Try again.");
                    break;
            }    
        }
    }
}