/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import byui.cit260.hauntedCastle.model.Player;
import hauntedcastle.HauntedCastle;

/**
 *
 * @author Saratf
 */
public class CharacterMenu {
    private void displayNextView(Player player) {
            
            
        //display a custom welcome message
        System.out.println("\n=================================================="
                            + "\n Welcome to the game " + player.getName()
                            + "\n We hope you have a lot of fun!"
                            + "\n==============================================="
                            );
        //create mainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //display the main menu view
        mainMenuView.displayMainMenuView();
        }

    void displayCharacter() {
        System.out.println("\n      ,-,      "
                             +"\n     ((\"))     "
                             +"\n    ~~/ \\~~    "
                             +"\n     /___\\     "
                             +"\n     _| |_     "
                                +"\n       n_      "
                                +"\n      (\")      "
                                +"\n     --|--     "
                                +"\n       :       "
                                +"\n     _/ \\_     ");
        
        this.displayNextView(HauntedCastle.getPlayer());
    }
}
