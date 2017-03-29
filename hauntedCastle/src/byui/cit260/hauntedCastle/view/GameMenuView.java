/*
 * To change this license header, choose License Headers in Project Properties.
 * SARA 
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;
import byui.cit260.hauntedCastle.control.ResourceControl;
import byui.cit260.hauntedCastle.model.Item;
import byui.cit260.hauntedCastle.model.Location;
import byui.cit260.hauntedCastle.model.Map;
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
                  + "\nH List Sorted Items"     
                + "\nQ Quit"
                  + "\n--------------------------------------");
        }
 

            


    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            case "V": //view map
                this.displayMap();
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
            case "H": //lesson 9 individaul assignment
                //print list of sorted items
                this.listSortedItems();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try Again");
        }
        return false;
    }
    
    private void displayMap() { 
        Map map = new Map(5, 5);
        Location[][] locations = map.getLocations();
this.console.println("\nHaunted Castle");
this.console.println("\n---1-----2-----3-----4-----5--");
// FOR every row in map
for (int i=0; i<locations.length; i++){
    this.console.println("\n------------------------------");
    // FOR every column in row
    for(int j=0; j<locations[i].length; j++){
        if(locations[i][j].getVisited() == 1){
               String symbol = locations[i][j].getScene().getDisplaySymbol();
               this.console.print(symbol + " | ");
        }
        else {
               this.console.print("| ?? |");            
        }
    }
}
}
    
    private void viewInventory() {
        this.console.println("\n*** viewInventory function called ***");
    }
    private void moveLocation() {
        this.console.println("\n*** moveLocation function called ***");
    }
    private void harvestResource() {
        this.console.println("\n*** harvestResource function called ***");
    }
    private void useResource() {
        this.console.println("\n*** useResource function called ***");
    }
    private void listSortedItems() {
        ResourceControl resourceControl = new ResourceControl();
        resourceControl.main();
       
    }
}