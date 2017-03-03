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
import java.util.Random;
import java.util.Scanner;

public class CalcRandomEquation {
    private String promptMessage;
    private double randomX;
    private double randomY;
    private double randomZ; 
    
    
    public CalcRandomEquation(){
        this.promptMessage = this.createEquation();
    }
    
    private String createEquation() {
        
        Random rnd = new Random();
        randomX = rnd.nextInt(16);
        randomY = rnd.nextInt(16);
        randomZ = rnd.nextInt(16);

       return "\n*******************************************************************************"
       + "\n*                                                                            *"
       + "\n* Three random numbers will be generated in the form of a math equation.     *"
       + "\n* For example, x + (y * z)                                                   *"
       + "\n* Your task is to calculate the correct answer.                              *"
       + "\n* Only then will you be able to pass on to the next level.                   *"
       + "\n* Here is the equation:                                                      *"
       + "\n******************************************************************************"
       + "\n\n\t" + randomX + " + (" + randomY + " * " + randomZ + ")";        

    }
    
   public void displayCalcRandomEquationView() {
        
        boolean done = false; //set flag to none
        do {
            //prompt for and get players name
            String userAnswer = this.getUserAnswer();
            if (userAnswer.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(userAnswer);
                
        }while (!done);
    }

    private String getUserAnswer() {
        Scanner keyboard = new Scanner(System.in); //get inflie for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println(this.promptMessage);
            
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

    private boolean doAction(String userAnswer) {
        
       double answer = Double.parseDouble(userAnswer);
       boolean correct = ComplexEquationsControl.calcRandomEquation(randomX, randomY, randomZ, answer);
       if (!correct) {
           System.out.println("\n*Wrong answer. Please try again.");
           this.promptMessage = this.createEquation();
           return false;
       }
       System.out.println("\n*You answered correctly!");
       return true;
    }
}
