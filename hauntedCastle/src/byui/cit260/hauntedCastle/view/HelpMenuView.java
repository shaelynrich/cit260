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
    public HelpMenuView() {
        this.helpMenu = "\n"
                  + "\n--------------------------------------"
                  + "\n| Help Menu                          |"
                  + "\n--------------------------------------"
                  + "\nP How to Play"
                  + "\nR Goal of the Game"
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
                this.goalOfTheGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
        }
        return false;
    }
    
    private void howToPlay() {
        System.out.println(   "\n***********************************************************************"
                            + "\n* How to play the game:                                               *"
                            + "\n*                                                                     *"
                            + "\n* The game will have challenges that you need to complete.            *"
                            + "\n* Some will require doing math, others will require exploring.        *"
                            + "\n* To give the commands, just follow the prompting in the screen.      *"
                             );
    }
    private void goalOfTheGame () {
         System.out.println(
        "\n***********************************************************************"
       + "\n*                                                                    *"
       + "\n* To win the game you must retrieve the key and unlock the gate.     *"
       + "\n* In order to do this, each challenge must be completed successfully.*"
       + "\n* Beware of the mad scientist.                                       *"
       + "\n* Good luck!                                                         *"
        );
    }
}