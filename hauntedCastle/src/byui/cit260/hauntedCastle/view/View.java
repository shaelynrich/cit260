/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import hauntedcastle.HauntedCastle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saratf
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    protected final BufferedReader keyboard = HauntedCastle.getInFile();
    protected final PrintWriter console = HauntedCastle.getOutFile();
    
    public View(){
        
    }
    public View(String message){
        this.displayMessage = message;
    }
    @Override
     public void display(){
       
         boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(value);
            
        }while(!done);  
     }     
    
     @Override
     public String getInput(){
        
        //get inflie for keyboard
        String value = null; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            this.console.println("\n" + this.displayMessage);
            
            try {
                value = this.keyboard.readLine(); //get next line typed on keyboard
            } catch (IOException ex) {
                this.console.println("Error");
            }
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                this.console.println("\nYou must enter a value");
                continue;
            }
            break; //end the loop
        }
        return value; //return the value entered   

     }
     
}
