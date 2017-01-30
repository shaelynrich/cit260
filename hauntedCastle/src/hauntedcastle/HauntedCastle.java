/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedcastle;


import byui.cit260.hauntedCastle.model.Player;
import byui.cit260.hauntedCastle.model.Game;
import byui.cit260.hauntedCastle.model.Map;
import byui.cit260.hauntedCastle.model.Mouse;
import byui.cit260.hauntedCastle.model.Resource;

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
        
        String playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        
        
        
        Game playerGame = new Game();
        
        playerGame.setNumbOfPeople(1);
        playerGame.setTotalTime(10);
        
        System.out.println(playerGame.toString());
        
        
        
        Map mapLocation = new Map();
        
        mapLocation.setRowCount(5);
        mapLocation.setRowCount(6);
        mapLocation.setHistory("You've been here before");
        
       System.out.println(mapLocation);
        
        
        
    }
            
}
