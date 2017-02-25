/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import java.util.Scanner;

/**
 *
 * @author Shaelyn
 */
public class HelpMenuView {
    
    private String helpMenu;
        void displayView() {
        this.helpMenu = "\n"
                  + "\n--------------------------------------"
                  + "\n| Help Menu                           |"
                  + "\n--------------------------------------"
                  + "\nP How to Play"
                  + "\nR Return"
                  + "\nQ Quit"
                  + "\n--------------------------------------";
        }
        
     public void displayHelpMenuView() {
        
        boolean done = false; //set flag to none
        do {
            //prompt for and get players name
            String menuOption = this.getHelpMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
                
        }while (!done);
    }

    private String getHelpMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get inflie for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println(this.helpMenu);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break; //end the loop
        }
        return value; //return the value entered   

    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            case "P": //show how to play
                this.howToPlay();
                break;
            case "R": //return to where they just were
                this.returnToHome();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
        }
        return false;
    }
    
    private void howToPlay() {
        System.out.println("\n*** howToPlay function called ***");
    }
    private void returnToHome() {
        System.out.println("\n*** returmToHome function called ***");
    }
}