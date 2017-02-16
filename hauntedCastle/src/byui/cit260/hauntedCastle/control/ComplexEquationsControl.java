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
    public double calcVolumeOfPotion (double radius, double height, double volumeOfCylinder, double correctVolumeOfCylinder ){
        if (radius<0 || height>10){
        return -1;
        }
	if (radius>0 || height<0){
        return -1;
        }
	if(radius<0 || height>15){
        return -1;    
        }
        if (volumeOfCylinder <0 && volumeOfCylinder >240){
        return -1;   
        }
        correctVolumeOfCylinder = (Math.PI * Math.pow(radius,2)* height);

	if (volumeOfCylinder == correctVolumeOfCylinder){
        return correctVolumeOfCylinder;    
        }
        else
        return correctVolumeOfCylinder;    

    }
    }
            

