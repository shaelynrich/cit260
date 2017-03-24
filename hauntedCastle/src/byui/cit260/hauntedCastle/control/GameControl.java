/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.control;

import byui.cit260.hauntedCastle.model.Game;
import byui.cit260.hauntedCastle.model.Item;
import byui.cit260.hauntedCastle.model.ItemList;
import byui.cit260.hauntedCastle.model.Map;
import byui.cit260.hauntedCastle.model.Player;
import hauntedcastle.HauntedCastle;

/**
 *
 * @author Shaelyn
 */
public class GameControl {
    
    
    public static void createNewGame(Player player){
Game game = new Game(); //create the new game
HauntedCastle.setCurrentGame(game); //save in Haunted Castle

//game.setPlayer(player); //save player in game
      
//create the inventory list and save in the game
Item[] inventoryList = GameControl.createInventoryList();
game.setInventory(inventoryList);

Map map = MapControl.createMap(); //create and initialize new map
game.setMap(map); //save map in game    

    }
    
    public static Item[] createInventoryList(){
        //created arra(list) of inventory items
        Item[]inventory = new Item[5];
        
        Item sword = new Item();
        sword.setDescription("Sword");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[ItemList.sword.ordinal()] = sword;
        
        Item potion = new Item();
        sword.setDescription("Potion");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[ItemList.potion.ordinal()] = potion;
        
        Item key = new Item();
        sword.setDescription("Key");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[ItemList.key.ordinal()] = key;
        
        Item food = new Item();
        sword.setDescription("Food");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[ItemList.food.ordinal()] = food;
        
        Item magic = new Item();
        sword.setDescription("Magic");
        sword.setQuantityInStock(0);
        sword.setRequiredAmount(0);
        inventory[ItemList.magic.ordinal()] = magic;
        
        return inventory;
        
    }
    
    public static void createHelpMenu(Player player){
        System.out.println("\n*** createHelpMenu stub function called ***");

    }
    public static Player createPlayer(String name) {
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        HauntedCastle.setPlayer(player); //save the player
        
        return player;
    }
    public static String createCharacter (String gender){
        String girl = "You picked a girl character";
        return girl;
    }
    
}
