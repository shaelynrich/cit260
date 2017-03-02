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
import java.util.Random;
import java.util.Scanner;

public class CalcRandomEquation {
    public CalcRandomEquation(){
            this.displayBanner();
    }
    
private String displayBanner;
void displayBanner() {
        System.out.println(
        "\n*******************************************************************************"
       + "\n*                                                                            *"
       + "\n* Three random numbers will be generated in the form of a math equation.     *"
       + "\n* For example, x + (y * z)                                                   *"
       + "\n* Your task is to calculate the correct answer.                              *"
       + "\n* Only then will you be able to pass on to the next level.                   *"
       + "\n* Here is the equation:                                                      *"
       + "\n******************************************************************************"
       );
     
// boolean done = false; //set flag to none
//        do {
//            //prompt for and get players name
//            String menuOption = this.getAnswer();
//            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
//                return; //exit the game
//            
//            //do the requested action and display the next view
//            done = this.doAction(menuOption);
//                
//        }while (!done);
        
Random rnd = new Random();
int randomX = rnd.nextInt(16);

int randomY = rnd.nextInt(16);

int randomZ = rnd.nextInt(16);

System.out.println(randomX+ " + (" + randomY + " * " + randomZ + ")");
        
}
//get input

//private String getAnswer() {
//        Scanner keyboard = new Scanner(System.in); //get inflie for keyboard
//        String value = ""; //value to be returned
//        boolean valid = false; //initialize to not valid
//        
//        while (!valid) { //loop while an invalid value is enter
//            System.out.println(this.displayBanner);
//            
//            value = keyboard.nextLine(); //get next line typed on keyboard
//            value = value.trim(); //trim off leading and trailing blanks
//            
//            if (value.length() < 1) { //value is blank
//                System.out.println("\nInvalid value: value can not be blank");
//                continue;
//            }
//            break; //end the loop
//        }
//        return value; //return the value entered   
//
//    }
////call the function from the control, pass randomX parameters
////doAction compare user answer to expected answer
//private boolean doAction(String choice) {
//        choice = choice.toUpperCase(); //convert choice to upper case
//        
//        switch (choice){
////            case "P": //show how to play
////                this.howToPlay();
////                break;
////            case "R": //return to where they just were
////                this.goalOfTheGame();
////                break;
//            default:
//                System.out.println("\n*** Invalid selection *** Try Again");
//        }
//        return false;
//    }
}


