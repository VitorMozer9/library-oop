package io.github.vitormozer9.controller;

import io.github.vitormozer9.model.Book;
import io.github.vitormozer9.model.Library;
import io.github.vitormozer9.model.Loan;
import io.github.vitormozer9.utils.DateConversion;
import io.github.vitormozer9.view.LoanView;

public class LoanController {
    private DateConversion conversionDateToString = new DateConversion();
    private LoanView loanView = new LoanView();
    private Library libraryObj;

    public LoanController(Library libraryObj) {
        this.libraryObj = libraryObj;
    }
    
    public void execLoanMenu(){
        int optionOnLoanMenu = loanView.showOptionLoan();
        
        switch(optionOnLoanMenu){
            case 1: {
                String bookName = loanView.getBookLoanName();

                Book selectedBook = libraryObj.searchLoanBookNameButReturnLoan(bookName);

                if (selectedBook == null) {
                    System.out.println("Book not found! Please try again.");
                    break;
                }

            Loan newLoan = new Loan(
                                        selectedBook,
                                        loanView.getClientName(),
                                        conversionDateToString.converterStringOnDate(loanView.getLoanDate()),
                                    null
            );

            libraryObj.addLoansInList(newLoan);

                System.out.println("Loan registered successfully!");
                break;
            }
            case 2: {
                int removedLoan = loanView.removeLoan();

                    if (removedLoan != -1){
                        libraryObj.removeLoanThisArray(removedLoan);
                    }
                    else {
                        System.out.println("Loan ID not found! Please try again");
                    }
                break;
            }
            case 3: {
               String loanInfo = libraryObj.showLoan(loanView.getLoanID());
               if(loanInfo != null ){
                  System.out.println(loanInfo);
               }
               else{
                System.out.println("Loan ID not found! Please try again");
               }
                break;
            }
        }
    }
}    

