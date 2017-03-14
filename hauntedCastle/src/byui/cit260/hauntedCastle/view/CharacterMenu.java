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
        
         super("\nPick your character. "
               + "G for a girl or B for a boy."
               +"\n                                        "
               +"\n      ,-,                n_             "
               +"\n     ((\"))              (\")           "
               +"\n    ~~/ \\~~            --|--           "
               +"\n     /___\\               :             "
               +"\n     _| |_             _/ \\_           ");
    }

    @Override
    public boolean doAction(String value) {
        String character = GameControl.createCharacter(value);
        if (character == null){
           System.out.println("Try again");
           return false;
        }
        System.out.println("congratulations" + character);
        return true;
    }
}
    
    
  
    
    
    