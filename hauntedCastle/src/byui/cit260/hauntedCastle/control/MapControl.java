/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.control;

import byui.cit260.hauntedCastle.exceptions.MapControlException;
import byui.cit260.hauntedCastle.model.Location;
import byui.cit260.hauntedCastle.model.Map;
import byui.cit260.hauntedCastle.model.Scene;
import byui.cit260.hauntedCastle.model.SceneType;
import byui.cit260.hauntedCastle.view.ErrorView;
import hauntedcastle.HauntedCastle;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 *
 * @author Shaelyn
 */
public class MapControl {

    public static Map createMap()
            throws MapControlException {
        //create the map
        Map map = new Map(5, 5);

        //create a list of the different scenes in the game
        Scene[] scenes = MapControl.createScenes();

        //asign the different scenes to locations in the map
        MapControl.assignScenesToLocations(map, scenes);

        return map;
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(
                "You have entered the Haunted Castle");
        startingScene.setDisplaySymbol(" ST ");
        startingScene.setTypeOfScene(" First ");
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene portalScene = new Scene();
        portalScene.setDescription(
                "Find the hidden portal that will direct you to a new location.");
        portalScene.setDisplaySymbol(" ST ");
        portalScene.setTypeOfScene("Portal");
        scenes[SceneType.portal.ordinal()] = portalScene;

        Scene mouseScene = new Scene();
        mouseScene.setDescription(
                "Defeat the mouse to move on to the next level.");
        mouseScene.setDisplaySymbol(" ST ");
        mouseScene.setTypeOfScene("Mouse");
        scenes[SceneType.mouse.ordinal()] = mouseScene;

        Scene complex1Scene = new Scene();
        complex1Scene.setDescription(
                "Use your brain power to complete this level.");
        complex1Scene.setDisplaySymbol(" ST ");
        complex1Scene.setTypeOfScene("Complex");
        scenes[SceneType.complexEquations1.ordinal()] = complex1Scene;

        Scene complex2Scene = new Scene();
        complex2Scene.setDescription(
                "Use your brain power to complete this level.");
        complex2Scene.setDisplaySymbol(" ST ");
        complex2Scene.setTypeOfScene("Complex");
        scenes[SceneType.complexEquations2.ordinal()] = complex2Scene;

        Scene complex3Scene = new Scene();
        complex3Scene.setDescription(
                "Use your brain power to complete this level.");
        complex3Scene.setDisplaySymbol(" ST ");
        complex3Scene.setTypeOfScene("Complex");
        scenes[SceneType.complexEquations3.ordinal()] = complex3Scene;

        Scene challenge1 = new Scene();
        challenge1.setDescription(
                "Use your brain power to complete this level.");
        challenge1.setDisplaySymbol(" ST ");
        challenge1.setTypeOfScene("Challenge");
        scenes[SceneType.challenge1.ordinal()] = challenge1;

        Scene challenge2 = new Scene();
        challenge2.setDescription(
                "Use your brain power to complete this level.");
        challenge2.setDisplaySymbol(" ST ");
        challenge2.setTypeOfScene("Challenge");
        scenes[SceneType.challenge2.ordinal()] = challenge2;

        Scene challenge3 = new Scene();
        challenge3.setDescription(
                "Use your brain power to complete this level.");
        challenge3.setDisplaySymbol(" ST ");
        challenge3.setTypeOfScene("Challenge");
        scenes[SceneType.challenge3.ordinal()] = challenge3;

        Scene finishScene = new Scene();
        finishScene.setDescription(
                "Congratulations! You have found the key and can "
                + "return home.");
        finishScene.setDisplaySymbol(" FN ");
        finishScene.setTypeOfScene(" Done ");
        scenes[SceneType.finish.ordinal()] = finishScene;

        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes)
            throws MapControlException {

        if (map == null || scenes == null) {
            throw new MapControlException("Map or scenes does not exist.");
        }

        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.portal.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.mouse.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.complexEquations1.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.complexEquations2.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.challenge1.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.challenge2.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.challenge3.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.portal.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.mouse.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.complexEquations2.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.complexEquations3.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.challenge1.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.challenge2.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.challenge3.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.mouse.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.challenge1.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.challenge2.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.challenge3.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.mouse.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.complexEquations1.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.complexEquations2.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.complexEquations3.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.challenge1.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.challenge2.ordinal()]);
    }

    public static void moveCharacterToLocation(Character character, Point coordinates)
            throws MapControlException {

        if (character == null || coordinates == null) {
            throw new MapControlException("Character or coordinates does not exist.");
        }

        Map map = HauntedCastle.getCurrentGame().getMap();
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;

        if (newRow < 0 || newRow >= map.getRowCount()
                || newColumn < 0 || newColumn >= map.getColumnCount()) {
            throw new MapControlException("Can not move actor to location "
                    + coordinates.x + ", " + coordinates.y
                    + " because that location is outside "
                    + " the bounds of the map.");
        }

    }

//    public static void getLocation(String filePath) throws MapControlException, FileNotFoundException {
//        Scene[] sceneArray = HauntedCastle.getCurrentGame().getMap();
//
//        try (PrintWriter out = new PrintWriter(filePath)) {
//            out.println("\n\n Exploring Location Report");
//            out.printf("%n%-20s%10s", "Description", "Display Symbol");
//            out.printf("%n%-20s%10s", "----------- ", "-------------");
//            //print the description and quantity
//            for (Scene scene : sceneArray) {
//                out.printf("%n%-20s%10s", scene.getDescription(),
//                         scene.getDisplaySymbol());
//            }
//        } catch (IOException ex) {
//            ErrorView.display("I/O Error: " + ex.getMessage());
//        }
//    }
}
