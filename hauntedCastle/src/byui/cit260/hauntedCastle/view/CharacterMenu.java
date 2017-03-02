/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

import byui.cit260.hauntedCastle.model.Player;
import hauntedcastle.HauntedCastle;
import java.util.Scanner;

/**
 *
 * @author Saratf
 */
public class CharacterMenu {
    
    public CharacterMenu(){
        
         this.chooseCharacter();
    }
    
    
  
    
    private String chooseCharacter(){
        //read input from user
        Scanner keyboard = new Scanner(System.in);
        //get input from the user
        String value = "";
        boolean valid = false;
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\nPick your character."
                               + "G for a girl or B for a boy."
                                    +"\n      ,-,      "
                                    +"\n     ((\"))    "
                                    +"\n    ~~/ \\~~   "
                                    +"\n     /___\\    "
                                    +"\n     _| |_     "
                                    +"\n       n_      "
                                    +"\n      (\")     "
                                    +"\n     --|--     "
                                    +"\n       :       "
                                    +"\n     _/ \\_    ");
            
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
}
    