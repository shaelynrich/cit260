/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Shaelyn
 */
public enum Character implements Serializable {

    Boy("He is strong and fast.", 1, 1, "adsf", "adsf", "adsf"),
    Girl("She is smart and witty.", 0, 1, "adsf", "adsf", "adsf");

    private final String name;
    private final Point coordinates;
    private final String description;
    private final String displaySymbol;
    private final String gender;

    Character(String description, int row, int column, String name, String displaySymbol, String gender) {
        this.description = description;
        this.coordinates = new Point(row, column);
        this.name = name;
        this.displaySymbol = displaySymbol;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", coordinates=" + coordinates + ", description=" + description + ", displaySymbol=" + displaySymbol + "gender=" + gender + '}';
    }

}
