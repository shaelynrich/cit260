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
        String character = this.getInput();
        if (character.toUpperCase().equals("B") || character.toUpperCase().equals("G")){
           System.out.println("Yay!");
           return true;
        }
//        else if (character.toUpperCase().equals("G")){
//           System.out.println("Yay!");
//           return true;
//        }
        else{
            System.out.println("Try again");
          
        }
          return false;
    }
    private void displayNextView(Player player) {
            
            
        //display a custom welcome message
        System.out.println("   \n***********************************************"
                            + "\n Welcome to the game " + player.getName()
                            + "\n We hope you have a lot of fun!"
                            + "\n***********************************************"
                            );
        //create mainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //display the main menu view
        mainMenuView.display();
        }  
}
    
    
  
    
    
    