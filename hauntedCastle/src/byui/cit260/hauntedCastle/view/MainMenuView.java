/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import byui.cit260.hauntedCastle.control.ComplexEquationsControl;
import byui.cit260.hauntedCastle.control.GameControl;
import byui.cit260.hauntedCastle.exceptions.ComplexEquationsControlException;
import byui.cit260.hauntedCastle.exceptions.MapControlException;
import byui.cit260.hauntedCastle.model.Game;
import byui.cit260.hauntedCastle.model.Item;
import hauntedcastle.HauntedCastle;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                  + "\nA challenge1                          |"
                  + "\nR challenge2                          |"
                  + "\nP challenge3                          |"
                  + "\nL challenge4                          |"
                  + "\nC CalcRandomEquation"
                  + "\nM Print Report"
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
            case "C": 
                this.calcRandomEquation();
                break;
            case "A": //calc random
                this.challenge1();
                break; 
            case "R": //challenge 2
                this.challenge2();
                break; 
            case "P": //challenge 3
                this.challenge3();
                break; 
            case "L": //challenge 4
                this.challenge4();
                break;
            case "M": //display report
                this.displayReport();
                break; 
            case "V": 
         {
             try {
                 this.calcOfPotion();
             } catch (ComplexEquationsControlException ex) {
                 this.console.println(ex.getMessage());
             }
         }
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try Again");
        }
        return false;
    }
    
    private void startNewGame() {
        //create a new game
        try {
            GameControl.createNewGame(HauntedCastle.getPlayer());
        } catch (MapControlException mce) {
            this.console.println(mce.getMessage());
            return;
        }
        
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void startExistingGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\n Enter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        
        try{
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        
        this.console.println("\n\nEnter the file path for where the game is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //Game game = new Game();
            //save the game to the specified file
            GameControl.saveGame(HauntedCastle.getCurrentGame(), filePath);
        } catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void displayHelpMenu() {
       
        //create the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        //display the help menu
        helpMenu.display();
    }
    private void calcRandomEquation() {
        
        CalcRandomEquation calcRandomEquation = new CalcRandomEquation();
        
        calcRandomEquation.display();
        
        try {
            ComplexEquationsControl.calcRandomEquation(0,0,0,0);
        } catch (ComplexEquationsControlException cece) {
            this.console.println(cece.getMessage());
            return;
        }  
    }
    
    
    private void challenge1() {
        
        Challenge1 challenge1 = new Challenge1();
        challenge1.display();
    }    
    
    private void challenge2() {
        Challenge2 challenge2 = new Challenge2();
        challenge2.display();    
    }
    
    private void challenge3() {
        Challenge3 challenge3 = new Challenge3();
        challenge3.display();    
    }
    private void challenge4() {
        Challenge4 challenge4 = new Challenge4();
        challenge4.display();    
    }

    private boolean calcOfPotion() throws ComplexEquationsControlException {
        
        // generate random values for radius and height
        Random randomGenerator = new Random();
        
        int radius = randomGenerator.nextInt(11);
        int height = randomGenerator.nextInt(11);
         
         
        // call the control function to calculuate the volume of potion
       double result = ComplexEquationsControl.calcVolumeOfPotion(radius, height);
        
        // if result is invalid
        if (result <0){
            this.console.println("It seems your potion disappeared! You’ll have to try it again!");
            return false;
        }
        
        this.console.println("good job" + "The volume of the potion is " + result);
         return true;  
    }

            
    private void displayReport() {
        //prompt for and get the name of the file to save the game in
        
        this.console.println("\n\n Enter the file path for where the report is to be printed.");
        //getInput inherited from the view class is called to get the file path
        String filePath = this.getInput();    
        
        try{
            //call the control layer function
            GameControl.getReport(filePath);
        } catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
           
    }
 }