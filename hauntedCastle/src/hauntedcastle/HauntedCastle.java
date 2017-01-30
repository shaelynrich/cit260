/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedcastle;

import byui.cit260.hauntedCastle.model.Item;
import byui.cit260.hauntedCastle.model.Player;
import byui.cit260.hauntedCastle.model.Character;
import byui.cit260.hauntedCastle.model.Location;
import byui.cit260.hauntedCastle.model.Questions;
import byui.cit260.hauntedCastle.model.Scene;

/**
 *
 * @author Shaelyn
 */
public class HauntedCastle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();       
        
        playerOne.setName("Fred Flinstone");
             
        System.out.println(playerOne.toString());
        
        
        Item item = new Item();
       
        item.setInventoryType("Food");
        item.setQuantityInStock(2);
        item.setRequiredAmount(3);
        item.setName("Banana");
        item.setDescription("Yellow");
        
        System.out.println(item.toString());
        
        Character character = new Character();
        
        character.setName("Josephine");
        character.setCoordinates(25);
        character.setDescription("Girl");
        character.setDisplaySymbol("url");
        
        System.out.println(character.toString());
        
        
        Location location = new Location();
        
        location.setRow(4.5);
        location.setColumn(6.3);
        location.setVisited(4);
        location.setAmountRemaining(13);
        
        System.out.println(location.toString());
        
        
        Scene scene = new Scene();
        
        scene.setDescription("Foggy");
        scene.setDisplaySymbol("url");
        scene.setTypeOfScene("Living Room");
        
        System.out.println(scene.toString());
        
        Questions questions = new Questions();
        
        questions.setQuestion("What is your name?");
        questions.setAnswer("John");
        
        System.out.println(questions.toString());
    }
    
}
