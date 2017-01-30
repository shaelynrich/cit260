/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Shaelyn
 */
public class Scene implements Serializable{
    public String description;
    public String displaySymbol;
    public String typeOfScene;

    public Scene() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public String getTypeOfScene() {
        return typeOfScene;
    }

    public void setTypeOfScene(String typeOfScene) {
        this.typeOfScene = typeOfScene;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.displaySymbol);
        hash = 59 * hash + Objects.hashCode(this.typeOfScene);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", displaySymbol=" + displaySymbol + ", typeOfScene=" + typeOfScene + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        if (!Objects.equals(this.typeOfScene, other.typeOfScene)) {
            return false;
        }
        return true;
    }
   
}
