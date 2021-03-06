/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view; 
/**
 *
 * @author Shaelyn
 */

import byui.cit260.hauntedCastle.control.ComplexEquationsControl;
import byui.cit260.hauntedCastle.exceptions.ComplexEquationsControlException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalcRandomEquation extends View{

    private double randomX;
    private double randomY;
    private double randomZ; 
    
    
    public CalcRandomEquation(){
        super();
             
        this.displayMessage = this.createEquation();
    }
    
    private String createEquation() {
        
        Random rnd = new Random();
        randomX = rnd.nextInt(16);
        randomY = rnd.nextInt(16);
        randomZ = rnd.nextInt(16);

       return 
         "\n******************************************************************************"
       + "\n*                                                                            *"
       + "\n* Three random numbers will be generated in the form of a math equation.     *"
       + "\n* For example, x + (y * z)                                                   *"
       + "\n* Your task is to calculate the correct answer.                              *"
       + "\n* Only then will you be able to pass on to the next level.                   *"
       + "\n* Here is the equation:                                                      *"
       + "\n******************************************************************************"
       + "\n\n\t" + randomX + " + (" + randomY + " * " + randomZ + ")";        

    }
    
    @Override
    public boolean doAction(String userAnswer) {
       
       double answer = 0;
       try {
            answer = Double.parseDouble(userAnswer);
       } catch (NumberFormatException nf){
           this.console.println("\nYou must enter a valid number."
                                + " Try again or enter Q to quit.");
       }
       boolean correct = false;
        try {
            correct = ComplexEquationsControl.calcRandomEquation(randomX, randomY, randomZ, answer);
        } catch (ComplexEquationsControlException ex) {
            this.console.println("Error: " + ex.getMessage()); 
        }
       if (!correct) {
           this.console.println("\n*Wrong answer. Please try again.");
           this.displayMessage = this.createEquation();
           return false;
       }
       this.console.println("\n*You answered correctly!");
       return true;
    }
}
