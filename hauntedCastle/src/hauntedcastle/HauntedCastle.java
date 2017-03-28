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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Shaelyn
 */
public class HauntedCastle {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        HauntedCastle.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        HauntedCastle.inFile = inFile;
    }

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
        
    public static void main(String[] args) {
      
        try {
            // open character stream files for end user input and output
            HauntedCastle.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            HauntedCastle.outFile = new PrintWriter(System.out, true);
            
            //create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display(); 
            return;
        } catch (Throwable e){
            System.out.println("Exception: " + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());
            e.printStackTrace();
        }
        
        finally {
            try {
                if (HauntedCastle.inFile != null)
                    HauntedCastle.inFile.close();
                if (HauntedCastle.outFile != null)
                HauntedCastle.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files.");
                return;
            }
        }
      }    
    }
            

 
