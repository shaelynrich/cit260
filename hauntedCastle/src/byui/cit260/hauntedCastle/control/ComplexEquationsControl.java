/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.control;

import byui.cit260.hauntedCastle.exceptions.ComplexEquationsControlException;


/**
 *
 * @author Shaelyn
 */
public class ComplexEquationsControl {

    public static boolean calcRandomEquation(double x, double y, double z, double userAnswer) 
                                            throws ComplexEquationsControlException {
        if (x == 0 || y == 0 || z == 0 || userAnswer == 0){
            throw new ComplexEquationsControlException("Please enter a number.");
        }
        
        if (x < 0 || x > 15) {
            return false;
        }
        if (y < 0 || y > 15) {
            return false;
        }
        if (z < 0 || z > 15) {
            return false;
        }
        if (userAnswer < 0 || userAnswer > 240) {
            return false;
        }

        double correctAnswer = x + (y * z);

        if (userAnswer == correctAnswer) {
            return true;
        }
        return false;
    }

    public static double calcVolumeOfPotion(int radius, int height) 
                                        throws ComplexEquationsControlException {
        if (radius == 0 || height == 0){
            throw new ComplexEquationsControlException("Please enter a number.");
        }
        if (radius < 0 || radius > 10) {
            return -1;
        }
        if (height > 10 || height < 0) {
            return -1;
        }
        double correctVolumeOfCylinder = (Math.PI * Math.pow(radius, 2) * height);
        if (correctVolumeOfCylinder <= 0 || correctVolumeOfCylinder > 240) {
            return -1;
        }
        
        double roundOff = Math.round(correctVolumeOfCylinder * 100.0) / 100.0;
        return roundOff;

    }

    public int calcDiceRollAverage(int[] listOfNumbers) 
                    throws ComplexEquationsControlException {
         if (listOfNumbers == null){
            throw new ComplexEquationsControlException("Please enter a number.");
        }
        int total = 0;

        if (listOfNumbers.length > 10) {
            return -1;
        }

        for (int i = 0; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i] <= 0 || listOfNumbers[i] > 6) {
                return -1;
            }
            total = total + listOfNumbers[i];
        }

        int result = total / listOfNumbers.length;
        return result;

    }
    
    public static boolean calcCreateQuestions (String answer1, String answer2, String answer3, String answer4, String answer5)
                                            throws ComplexEquationsControlException {
        if (answer1 == null || answer2 == null || answer3 == null || answer4 == null || answer5 == null){
            throw new ComplexEquationsControlException("Please enter a valid answer.");
        }
        if ("True".equals(answer1)){
            return false;
        }
        if ("False".equals(answer2)){
            return false;
        }
        if ("False".equals(answer3)){
            return false;
        }
        if ("True".equals(answer4)){
            return false;
        }
        if ("False".equals(answer5)){
            return false;
        }
        return true;
    }
    
    public static boolean calcCreateQuestions2 (String answer1, String answer2, String answer3)
                                            throws ComplexEquationsControlException {
        if (answer1 == null || answer2 == null || answer3 == null){
            throw new ComplexEquationsControlException("Please enter a single character.");
        }
        if ("K".equals(answer1) || "k".equals(answer1)){
            return true;
        }
        if ("E".equals(answer2) || "e".equals(answer2)){
            return true;
        }
        if ("Y".equals(answer3) || "y".equals(answer2)){
            return true;
        }
        return false;
    }
    
    public static boolean calcGhost(double userAnswer) 
                                            throws ComplexEquationsControlException {
        if (userAnswer == 0){
            throw new ComplexEquationsControlException("Please enter a number.");
        }
        if (userAnswer < 0 || userAnswer > 240) {
            return false;
        }
        if (userAnswer < 75 || userAnswer > 150) {
            return false;
        }

        return true;
    }
    
    public static boolean calcCreateQuestions4 (double userAnswer)
                                            throws ComplexEquationsControlException {
        if (userAnswer == 0){
            throw new ComplexEquationsControlException("Please enter a single number above 0.");
        }
        if (userAnswer < 3){
            return false;
        }
        if (userAnswer > 5){
            return false;
        }
        return true;
    }
}
