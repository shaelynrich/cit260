/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import java.util.Scanner;

/**
 *
 * @author Shaelyn
 */
public class HelpMenuView extends View{
    
    public HelpMenuView() {
                  super("\n"
                  + "\n--------------------------------------"
                  + "\n| Help Menu                          |"
                  + "\n--------------------------------------"
                  + "\nP How to Play                        |"
                  + "\nR Goal of the Game                   |"
                  + "\nQ Quit                               |"
                  + "\n--------------------------------------");
        }
        
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value){
            case "P": //show how to play
                this.howToPlay();
                break;
            case "R": //return to where they just were
                this.goalOfTheGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
        }
        return false;
    }
    
    private void howToPlay() {
        System.out.println(   "\n***********************************************************************"
                            + "\n* How to play the game:                                               *"
                            + "\n*                                                                     *"
                            + "\n* The game will have challenges that you need to complete.            *"
                            + "\n* Some will require doing math, others will require exploring.        *"
                            + "\n* To give the commands, just follow the prompting in the screen.      *"
                            + "\n***********************************************************************"
                             );
    }
    private void goalOfTheGame () {
         System.out.println(
         "\n**********************************************************************"
       + "\n*                                                                    *"
       + "\n* To win the game you must retrieve the key and unlock the gate.     *"
       + "\n* In order to do this, each challenge must be completed successfully.*"
       + "\n* Beware of the mad scientist.                                       *"
       + "\n* Good luck!                                                         *"
       + "\n**********************************************************************"        
        );
    }
}