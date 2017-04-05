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
public class Challenge2 extends View{
    
    private String question1 = "It comes after 'J' and comes before 'L'. What is it? (Hint: Think of the alphabet.)";
    private String question2 = "This animal has big ears, gray skin, and a long trunk. What is the first letter fo this animal? (Hint: In cartoons, these animals eat peanuts.)";
    private String question3 = "It comes after orange and before green. What is the first letter of this color? (Hint: Think of a rainbow.)";
    
    public Challenge2() {
        super();
        this.displayMessage = this.createQuestions();
    }
    
    public String createQuestions(){
        return 
         "\n******************************************************************************"
       + "\n*                                                                            *"
       + "\n* The riddle must be solved and the password uncovered.                      *"
       + "\n* You must answer by typing one letter                                       *"
       + "\n* in order to complete this challenge.                                       *"
       + "\n* Only then will you be able to pass on to the next level and obtain the key.*"
       + "\n******************************************************************************"
       + "\n\n\t" + question1;        
    }

    @Override
    public boolean doAction(String userAnswer) {
    String answer1 = userAnswer;
    this.displayMessage = question2;
    String answer2 = this.getInput();
    this.displayMessage = question3;
    String answer3 = this.getInput();
    boolean correct = false;
        try {
            correct = ComplexEquationsControl.calcCreateQuestions2(answer1, answer2, answer3);
        } catch (ComplexEquationsControlException ex) {
            this.console.println("challenge2");
        }
    if (!correct){
        this.console.println("\n*That is incorrect. Please try again.");
           this.displayMessage = this.createQuestions();
           return false;
    }
    this.console.println("\n*That is correct!");
       return true;
}
}