/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import byui.cit260.hauntedCastle.control.GameControl;
import byui.cit260.hauntedCastle.view.GameMenuView;
import hauntedcastle.HauntedCastle;
import java.util.Scanner;

/**
 *
 * @author Shaelyn
 */
public class MainMenuView {
    
    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------------"
                  + "\n| Main Menu                           |"
                  + "\n--------------------------------------"
                  + "\nN Start New Game"
                  + "\nG Get and start saved game"
                  + "\nH Get help on how to play the game"
                  + "\nS Save game"
                  + "\nQ Quit"
                  + "\nC CalcRandomEquation"
                  + "\n--------------------------------------";
    }

    public void displayMainMenuView() {
        
        boolean done = false; //set flag to none
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
                
        }while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get inflie for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println(this.menu);
            
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
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startExistingGame();
                break;
            case "H": //display the help menu
                this.displayHelpMenu();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            case "C": //calc random
                this.calcRandomEquation();
                break;    
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
        }
        return false;
    }
    
    private void startNewGame() {
        //create a new game
        //GameControl.createNewGame(HauntedCastle.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }
    
    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }
    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }
    private void displayHelpMenu() {
       
        //create the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        //display the help menu
        helpMenu.displayHelpMenuView();
    }
    private void calcRandomEquation() {
        CalcRandomEquation calcRandomEquation = new CalcRandomEquation();
        //display the help menu
        calcRandomEquation.displayCalcRandomEquationView();
    }    
}