/*
 * To change this license header, choose License Headers in Project Properties.
 * SARA 
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;
import java.util.Scanner;
/**
 *
 * @author Shaelyn
 */
public class GameMenuView extends View{
    
    private String gameMenu;
    public GameMenuView() {
        super( "\n"
                + "\n--------------------------------------"
                  + "\n| Game Menu                        |"
                  + "\n------------------------------------"
                  + "\nV View Map"
                  + "\nI View list of items in inventory"
                  + "\nM Move person to new location"
                  + "\nR Harvest Resource"
                  + "\nU Use Resource"               
                  + "\nQ Quit"
                  + "\n--------------------------------------");
        }
 

            


    @Override
    public boolean doAction(String choice) {
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