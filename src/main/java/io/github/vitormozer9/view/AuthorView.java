package io.github.vitormozer9.view;

import java.util.Scanner;

public class AuthorView {
    Scanner readOption = new Scanner(System.in);

    public int showAuthorOptions(){
        System.out.println("Write de option: ");
        System.out.println("1 - Include a Author");
        System.out.println("2 - Edit a Author");
        System.out.println("3 - Remove a Author");
        System.out.println("4 - Show a Author inofrmations");
        System.out.println("5 - Exit");

        int opcao = readOption.nextInt();
        readOption.nextLine();
        return opcao;
    }

    public String getAuthorName(){
        System.out.println("Enter name of the Author: ");
        return readOption.nextLine();
    }

    public int getAuthorID(){
        System.out.println("Enter the ID of the Author: ");
        return readOption.nextInt();
    }

    public String getDateOfBirth(){
        System.out.println("Enter the date (format dd/MM/yyyy): ");
        return readOption.nextLine();
    }

    public int removeAuthor(){
        System.out.println("Enter the ID of to be removed Author: ");
        return readOption.nextInt();
    }

    public int editAuthor(){
        System.out.println("Enter the ID of to be edit Author: ");
        return readOption.nextInt();
    }

    public String catchingNewNameAuthor(){
        System.out.println("Enter the new name Author, please: ");
        return readOption.nextLine();
    }
    
}
