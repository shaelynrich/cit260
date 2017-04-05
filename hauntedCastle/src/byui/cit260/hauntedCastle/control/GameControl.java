/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.control;

import byui.cit260.hauntedCastle.exceptions.GameControlException;
import byui.cit260.hauntedCastle.exceptions.MapControlException;
import byui.cit260.hauntedCastle.model.Game;
import byui.cit260.hauntedCastle.model.Item;
import byui.cit260.hauntedCastle.model.ItemList;
import byui.cit260.hauntedCastle.model.Map;
import byui.cit260.hauntedCastle.model.Mouse;
import byui.cit260.hauntedCastle.model.Player;
import byui.cit260.hauntedCastle.view.ErrorView;
import hauntedcastle.HauntedCastle;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Shaelyn
 */
public class GameControl {
    
    public static void createNewGame(Player player)
            throws MapControlException {
        Game game = new Game(); //create the new game
        HauntedCastle.setCurrentGame(game); //save in Haunted Castle

//game.setPlayer(player); //save player in game
//create the inventory list and save in the game
        Item[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game    
        
        Mouse mouse = new Mouse();
        mouse.setCoordinates(new Point(3, 3));
        mouse.setDescription("Big");
        mouse.setDisplaySymbol("ST");
        mouse.setName("Derek");
        mouse.setStrenght(3);
        
        map.getLocations()[3][3].setMouse(mouse);
        game.setMouse(mouse);
    }
    
    public static Item[] createInventoryList() {
        //created arra(list) of inventory items
        Item[] inventory = new Item[5];
        
        Item sword = new Item();
        sword.setDescription("Sword");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(2);
        inventory[ItemList.sword.ordinal()] = sword;
        
        Item potion = new Item();
        potion.setDescription("Potion");
        potion.setQuantityInStock(0);
        potion.setRequiredAmount(4);
        inventory[ItemList.potion.ordinal()] = potion;
        
        Item key = new Item();
        key.setDescription("Key");
        key.setQuantityInStock(0);
        key.setRequiredAmount(6);
        inventory[ItemList.key.ordinal()] = key;
        
        Item food = new Item();
        food.setDescription("Food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(1);
        inventory[ItemList.food.ordinal()] = food;
        
        Item magic = new Item();
        magic.setDescription("Magic");
        magic.setQuantityInStock(0);
        magic.setRequiredAmount(3);
        inventory[ItemList.magic.ordinal()] = magic;
        
        return inventory;
        
    }
    
    public static void createHelpMenu(Player player) {
        HauntedCastle.outFile.println("\n*** createHelpMenu stub function called ***");
        
    }
    
    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        HauntedCastle.setPlayer(player); //save the player

        return player;
    }
    
    public static String createCharacter(String gender) {
        String girl = "You picked a girl character";
        return girl;
    }
    
    public static void saveGame(Game currentGame, String filePath)
            throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame); //write the game object out to file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame(String filePath)
            throws GameControlException {
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read the game object from file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        //close the output file
        HauntedCastle.setCurrentGame(game); //save in HauntedCastle
    }
    
    public static void getReport(String filePath)
            throws GameControlException {
        Item[] itemArray = HauntedCastle.getCurrentGame().getInventory();
        
        try (PrintWriter out = new PrintWriter(filePath)) {
            //print title and column headings
            out.println("\n\n Inventory Report");
            out.printf("%n%-20s%10s", "Description", "Quantity");
            out.printf("%n%-20s%10s", "-----------", "--------");
            //print the description and quantity
            for (Item item : itemArray) {
                out.printf("%n%-20s%7.2f", item.getDescription(),
                        item.getQuantityInStock());
            }
            
        } catch (IOException ex) {
            ErrorView.display("I/O Error: " + ex.getMessage());
        }
    }
}
