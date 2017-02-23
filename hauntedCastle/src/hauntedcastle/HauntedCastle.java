/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedcastle;

import byui.cit260.hauntedCastle.model.Game;
import byui.cit260.hauntedCastle.model.Item;
import byui.cit260.hauntedCastle.model.Player;
import byui.cit260.hauntedCastle.model.Map;
import byui.cit260.hauntedCastle.model.Mouse;
import byui.cit260.hauntedCastle.model.Resource;
import byui.cit260.hauntedCastle.model.Character;
import byui.cit260.hauntedCastle.model.Location;
import byui.cit260.hauntedCastle.model.Questions;
import byui.cit260.hauntedCastle.model.Scene;
import byui.cit260.hauntedCastle.view.StartProgramView;


/**
 *
 * @author Shaelyn
 */
public class HauntedCastle {

    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HauntedCastle.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HauntedCastle.player = player;
    }
    private static Player player = null;
    
    public static void main(String[] args) {
      StartProgramView startProgramView = new StartProgramView();
      startProgramView.displayStartProgramView();
}    
    }
            

 
