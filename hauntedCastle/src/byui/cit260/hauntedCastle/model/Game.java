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
public class Game implements Serializable{
    
    //class instance variables
    private int numbOfPeople;
    private double totalTime;

    public Game() {
    }

    public int getNumbOfPeople() {
        return numbOfPeople;
    }

    public void setNumbOfPeople(int numbOfPeople) {
        this.numbOfPeople = numbOfPeople;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.numbOfPeople;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
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
        final Game other = (Game) obj;
        if (this.numbOfPeople != other.numbOfPeople) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "numbOfPeople=" + numbOfPeople + ", totalTime=" + totalTime + '}';
    }
    
    
    
}
