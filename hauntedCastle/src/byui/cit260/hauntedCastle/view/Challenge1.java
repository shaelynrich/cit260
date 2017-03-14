/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import byui.cit260.hauntedCastle.control.ComplexEquationsControl;

/**
 *
 * @author Shaelyn
 */
public class Challenge1 extends View{
    
    private String question1 = "Lightning never strikes in the same place twice.";
    private String question2 = "If you cry in space the tears just stick to your face.";
    private String question3 = "Humans can't breathe and swallow at the same time.";
    private String question4 = "Your fingernails and hair keep growing after you die.";
    private String question5 = "Humans can distinguish between over a trillion different smells.";
    
    public Challenge1() {
        super();
        this.displayMessage = this.createQuestions();
    }
    
    public String createQuestions(){
        return 
         "\n******************************************************************************"
       + "\n*                                                                            *"
       + "\n* To every question there is an answer.                                      *"
       + "\n* You must answer True or False to the following statements                  *"
       + "\n* in order to complete this challenge.                                       *"
       + "\n* Only then will you be able to pass on to the next level.                   *"
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
    this.displayMessage = question4;
    String answer4 = this.getInput();
    this.displayMessage = question5;
    String answer5 = this.getInput();
    boolean correct = ComplexEquationsControl.calcCreateQuestions(answer1, answer2, answer3, answer4, answer5);
    if (!correct){
        System.out.println("\n*That is incorrect. Please try again.");
           this.displayMessage = this.createQuestions();
           return false;
    }
    System.out.println("\n*That is correct!");
       return true;
}
}