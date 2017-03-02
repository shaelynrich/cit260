/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import byui.cit260.hauntedCastle.control.GameControl;
import byui.cit260.hauntedCastle.model.Player;
import java.util.Scanner;

/**
 *
 * @author Shaelyn
 */
public class StartProgramView {
     private String promptMessage;
     public StartProgramView(){
         this.promptMessage = "\nPlease enter your name: ";
         this.displayBanner();
}

    private void displayBanner() {
        System.out.println(
        "\n*******************************************************************************"
       + "\n*                                                                            *"
       + "\n* You and your family have moved to a completely new area.                   *"
       + "\n* The homes, the roads, and the people are all unfamiliar.                   *"
       + "\n* However, something unusual catches your eye.                               *"
       + "\n* You see a castle up in the distance. It is located on top                  *"
       + "\n* of the hill and is surrounded by trees. It doesn’t seem too                *"
       + "\n* far away, so you decide to do some exploring.                              *"
       + "\n* After entering the gates, it looks like no one lives in this castle.       *"
       + "\n* It appears that this castle has been abandoned long ago.                   *"
       + "\n* You decide that it would be best to turn around and maybe                  *"
       + "\n* come back later. However, the gates have closed behind you…                *"
       + "\n* only to be unlocked once you find the key and all challenges are completed.*"
       + "\n* To win the game you must retrieve the key and unlock the gate.             *"
       + "\n* In order to do this, each challenge must be completed successfully.        *"
                
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayerName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(playersName);
            
        }while(!done);
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in); //get inflie for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playersName) {
        if (playersName.length() <2){
            System.out.println("\nInvalid players name: "
                                + "The name must be greater than one character in length");
            return false;
        }
        
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessfull
            System.out.println("\nError creating the player.");
            return false;
        }
        //display next view
        this.displayNextView(player);
        return true; //success
    }

        private void displayNextView(Player player) {
            
            
        //display a custom welcome message
        //System.out.println("\n=================================================="
                            //+ "\n Welcome to the game " + player.getName()
                            //+ "\n We hope you have a lot of fun!"
                            //+ "\n==============================================="
                            //);
        //create mainMenuView object
        CharacterMenu characterMenu = new CharacterMenu();
        
        //display the main menu view
        characterMenu.displayCharacter();
        }
        
}
