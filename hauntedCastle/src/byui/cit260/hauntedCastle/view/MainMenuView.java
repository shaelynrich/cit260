/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import byui.cit260.hauntedCastle.control.ComplexEquationsControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Shaelyn
 */
public class MainMenuView extends View{
    
//    private String menu;

   public MainMenuView() {
//        this.menu = 
                super( "\n"
                  + "\n--------------------------------------"
                  + "\n| Main Menu                           |"
                  + "\n--------------------------------------"
                  + "\nN Start New Game                      |"                     
                  + "\nG Get and start saved game            |"
                  + "\nH Get help on how to play the game    |"
                  + "\nS Save game                           |"
                  + "\nQ Quit                                |"
                  + "\nV testPotionVolume                    |"
                  + "\nC CalcRandomEquation"
                  + "\n--------------------------------------");
    }


    @Override
     public boolean doAction (String value){
         value = value.toUpperCase(); //convert choice to upper case
        
        switch (value){
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
            case "V": //save the current game
                return this.calcOfPotion();    
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
        helpMenu.display();
    }
    private void calcRandomEquation() {
        CalcRandomEquation calcRandomEquation = new CalcRandomEquation();
        //display the help menu
        calcRandomEquation.display();
    }    

    private boolean calcOfPotion() {
        
        // generate random values for radius and height
        Random randomGenerator = new Random();
        
        int radius = randomGenerator.nextInt(11);
        int height = randomGenerator.nextInt(11);
         
         
        // call the control function to calculuate the volume of potion
       double result = ComplexEquationsControl.calcVolumeOfPotion(radius, height);
        
        // if result is invalid
        if (result <0){
            System.out.println("It seems your potion disappeared! You’ll have to try it again!");
            return false;
        }
        
        System.out.println("good job" + "The volume of the potion is " + result);
         return true;  
    }
 }
