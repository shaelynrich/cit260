/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.control;

/**
 *
 * @author Shaelyn
 */
public class ComplexEquationsControl {
    public boolean calcRandomEquation(double x, double y, double z, double userAnswer) {
      if (x<0 && x>15){
	return false;
      }
      if (y<0 && y>15){
	return false;
      }
      if (z<0 && z>15){
	return false;
      }
      if (userAnswer<0 && userAnswer>240){
	return false;
      }
	
      double correctAnswer = x + (y*z);

      if (userAnswer == correctAnswer){
	return true;
      }
      return false;
}
    public int calcDiceRollAverage(int [] listOfNumbers) {
      	
        int total = 0;
        
        if (listOfNumbers.length>10){
            return -1;
        }
        
        for(int i=0; i<listOfNumbers.length; i++){
            if(listOfNumbers[i] <0 || listOfNumbers[i] >6){
                return -1;
            }
            total = total + listOfNumbers[i];
        }
       
        int result = total / listOfNumbers.length;
	return result;
}
}
