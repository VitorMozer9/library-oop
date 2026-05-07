package io.github.vitormozer9.view;

import java.util.Scanner;

public class LoanView {
    
   /*private int idLoan;
    private Book book;
    private String clientName;
    private Date loanDate;
    private Date returnDate; */

    Scanner readOption = new Scanner(System.in);

    public int showOptionLoan(){
        System.out.println("Write de option: ");
        System.out.println("1 - Include a Loan");
        System.out.println("2 - Remove a Loan");
        System.out.println("3 - Show a Loan inofrmations");
        System.out.println("4 - Exit");

        int opcao = readOption.nextInt();
        readOption.nextLine();
        return opcao;
    }

    public String getBookLoanName(){
        System.out.println("Enter the name of the loan book: ");
        return readOption.nextLine();
    }

    public int getLoanID(){
        System.out.println("Enter the ID of the Loan: ");
        return readOption.nextInt();
    }

    public String getClientName(){
        System.out.println("Enter the client name");
        return readOption.nextLine();
    }

    public String getLoanDate(){
        System.out.println("Enter the loan date (format dd/MM/yyyy): ");
        return readOption.nextLine();
    }

    public String getLoanReturn(){
        System.out.println("Enter the loan date return(format dd/MM/yyyy): ");
        return readOption.nextLine();
    }

    public int removeLoan(){
        System.out.println("Enter the ID of to be removed loan: ");
        return readOption.nextInt();
    }
    
}
