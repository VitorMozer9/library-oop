package io.github.vitormozer9.view;
import java.util.Scanner;
//import java.util.Date;

public class BookView{

    Scanner readOption = new Scanner(System.in);

    public int showBookOptions(){
        System.out.println("Write de option: ");
        System.out.println("1 - Include a book");
        System.out.println("2 - Edit a book");
        System.out.println("3 - Remove a book");
        System.out.println("4 - Show a book");
        System.out.println("5 - Exit");

        int opcao = readOption.nextInt();
        readOption.nextLine();
        return opcao;
    }

    public String getTitleBook(){
        System.out.println("Enter the title of the book: ");
        return readOption.nextLine();
    }

    public int getBookID(){
        System.out.println("Enter the ID of the book: ");
        return readOption.nextInt();
    }

    public int getBookStock(){
        System.out.println("How many units of this book we have?");
        return readOption.nextInt();
    }

    public void showStock(int amout){
        System.out.println("Current stock: " + amout);
    }

    public int getAuthor(){
        System.out.println("Enter the author ID: ");
        return readOption.nextInt();
    }

    public String getDate(){
        System.out.println("Enter the date (format dd/MM/yyyy): ");
        return readOption.nextLine();
    }

    public int removeABook(){
        System.out.println("Enter the ID of to be removed book: ");
        return readOption.nextInt();
    }

    public int editABook(){
        System.out.println("Enter the ID of to be edit book: ");
        return readOption.nextInt();
    }

    public String catchingNewNameBook(){
        System.out.println("Enter the new name book, please: ");
        return readOption.nextLine();
    }

    public int getAuthorID() {
        System.out.println("Enter the ID of the Author: ");
        int authorId = readOption.nextInt();
        readOption.nextLine();
        return authorId;
    }   


}