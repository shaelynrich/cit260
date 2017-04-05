/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import byui.cit260.hauntedCastle.control.ComplexEquationsControl;
import byui.cit260.hauntedCastle.exceptions.ComplexEquationsControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shaelyn
 */
public class Challenge4 extends View{
    
    private String question1 = "Figure out the code. What is the number?";
    
    public Challenge4() {
        super();
        this.displayMessage = this.createQuestions2();
    }
    
    public String createQuestions2(){
        return 
         "\n******************************************************************************"
       + "\n*                                                                            *"
       + "\n* You have encountered a chest with a lock on it.                            *"
       + "\n* To unlock it and see what is inside you must figure out the code.          *"
       + "\n* I wonder what is inside...                                                 *"
       + "\n******************************************************************************"
       + "\n\n\t" + question1;        
    }

    @Override
    public boolean doAction(String userAnswer) {
    String answer1 = userAnswer;
    
    double answer = 0;
       try {
            answer = Double.parseDouble(userAnswer);
       } catch (NumberFormatException nf){
           this.console.println("\nYou must enter a valid number."
                                + " Try again or enter Q to quit.");
       }
    boolean correct = false;
        try {
            correct = ComplexEquationsControl.calcCreateQuestions4(answer);
        } catch (ComplexEquationsControlException ex) {
            this.console.println("challenge4");
        }
    if (!correct){
        this.console.println("\n*That is incorrect. Please try again.");
           this.displayMessage = this.createQuestions2();
           return false;
    }
    this.console.println("\n*That is correct!");
       return true;
}
}