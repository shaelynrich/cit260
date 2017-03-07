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
public class GameMenuView {
    
    private String gameMenu;
    public GameMenuView() {
        this.gameMenu = "\n"
                + "\n--------------------------------------"
                  + "\n| Game Menu                        |"
                  + "\n------------------------------------"
                  + "\nV View Map"
                  + "\nI View list of items in inventory"
                  + "\nM Move person to new location"
                  + "\nR Harvest Resource"
                  + "\nU Use Resource"               
                  + "\nQ Quit"
                  + "\n--------------------------------------";
        }
 

     public void displayGameMenuView() {
        
        boolean done = false; //set flag to none
        do {
            //prompt for and get players name
            String menuOption = this.getGameMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
                
        }while (!done);
    }

    private String getGameMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get inflie for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println(this.gameMenu);
            
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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            case "V": //view map
                this.viewMap();
                break;
            case "I": //view inventory items
                this.viewInventory();
                break;
            case "M": //move to new location
                this.moveLocation();
                break;
            case "R": //harvest resource
                this.harvestResource();
                break;
            case "U": //use resource
                this.useResource();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try Again");
        }
        return false;
    }
    
    private void viewMap() {
        System.out.println("\n*** viewMap function called ***");
    }
    private void viewInventory() {
        System.out.println("\n*** viewInventory function called ***");
    }
    private void moveLocation() {
        System.out.println("\n*** moveLocation function called ***");
    }
    private void harvestResource() {
        System.out.println("\n*** harvestResource function called ***");
    }
    private void useResource() {
        System.out.println("\n*** useResource function called ***");
    }
}