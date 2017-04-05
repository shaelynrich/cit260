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

public class Challenge3 extends View{
    
    private String question1 = "What is my favorite number?";

    public Challenge3(){
        super();
             
        this.displayMessage = this.createQuestion();
    }
    
    private String createQuestion() {
        return 
         "\n******************************************************************************"
       + "\n*                                                                            *"
       + "\n* You have encountered a purple ghost.                                       *"
       + "\n* The only way to get past him is by answering his questions correctly.      *"
       + "\n* You might have to guess...good luck!                                       *"
       + "\n******************************************************************************"
       + "\n\n\t" + question1;  

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
            correct = ComplexEquationsControl.calcGhost(answer);
        } catch (ComplexEquationsControlException ex) {
            this.console.println("challenge3"); 
        }
       if (!correct) {
           this.console.println("\n*Wrong answer. (Hint: The number is between 0 and 240)");
           this.displayMessage = this.createQuestion();
           return false;
       }
       this.console.println("\n*You answered correctly!");
       return true;
    }
}