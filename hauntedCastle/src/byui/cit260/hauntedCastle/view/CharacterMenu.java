/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import byui.cit260.hauntedCastle.control.GameControl;
import byui.cit260.hauntedCastle.model.Player;
import hauntedcastle.HauntedCastle;
import java.util.Scanner;

/**
 *
 * @author Saratf
 */
public class CharacterMenu extends View{
    
    public CharacterMenu(){
        
         super("\nPick your character: G for a girl or     "
               +"\n                     B for a boy.       "
               +"\n                                        "
               +"\n      ,-,                n_             "
               +"\n     ((\"))              (\")           "
               +"\n    ~~/ \\~~            --|--           "
               +"\n     /___\\               :             "
               +"\n     _| |_             _/ \\_           ");
    }

@Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value){
            case "G": //show how to play
                this.displayNextView();
                break;
            case "B": //return to where they just were
                this.displayNextView();
                break;
            default:
                //System.out.println("\n*** Invalid selection *** Try Again");
                this.displayNextView();
        }
        return false;
    }
    private void displayNextView() {
            
            
        //display a custom welcome message
        System.out.println("   \n***********************************************"
                            + "\n Welcome to the game "
                            + "\n We hope you have a lot of fun!"
                            + "\n***********************************************"
                            );
        //create mainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //display the main menu view
        mainMenuView.display();
        }  

    private void girlNextView() {
System.out.println(   "\n***********************************************************************"
                            + "\n* How to play the game:                                               *"
                            + "\n*                                                                     *"
                            + "\n* The game will have challenges that you need to complete.            *"
                            + "\n* Some will require doing math, others will require exploring.        *"
                            + "\n* To give the commands, just follow the prompting in the screen.      *"
                            + "\n***********************************************************************"
                             );    }

    private void boyNextView() {
System.out.println(
         "\n**********************************************************************"
       + "\n*                                                                    *"
       + "\n* To win the game you must retrieve the key and unlock the gate.     *"
       + "\n* In order to do this, each challenge must be completed successfully.*"
       + "\n* Beware of the mad scientist.                                       *"
       + "\n* Good luck!                                                         *"
       + "\n**********************************************************************"        
        );    }
}
