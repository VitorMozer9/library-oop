package io.github.vitormozer9.view;
import java.util.Scanner;

public class MainView {

    Scanner readOption = new Scanner(System.in);
    
    public int showAvailableOptions(){
        System.out.println("1  - Book registrtion");
        System.out.println("2  - Authors registration");
        System.out.println("3  - Loan Registration");
        System.out.println("4  - Exit");
        System.out.println("Write where you want to go \n");
        
        return readOption.nextInt();    
    }
    
}
