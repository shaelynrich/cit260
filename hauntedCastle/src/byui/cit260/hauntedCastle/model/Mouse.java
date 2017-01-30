/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.model;

import java.io.Serializable;

/**
 *
 * @author Saratf
 */
public class Mouse implements Serializable{
    
    //class instance variables
    private double strenght;

    public Mouse() {
    }

    public double getStrenght() {
        return strenght;
    }

    public void setStrenght(double strenght) {
        this.strenght = strenght;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.strenght) ^ (Double.doubleToLongBits(this.strenght) >>> 32));
        return hash;
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
        final Mouse other = (Mouse) obj;
        if (Double.doubleToLongBits(this.strenght) != Double.doubleToLongBits(other.strenght)) {
            return false;
        }
        return true;
    }
            
            
}
