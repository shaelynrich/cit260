/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedCastle.view;

/**
 *
 * @author Shaelyn
 */
public class StartProgramView {
     private String promptMessage;
     public StartProgramView(){
         this.promptMessage = "\nPlease enter your name: ";
         this.displayBanner();
}

    private void displayBanner() {
        System.out.println(
        "\n************************************************************"
       + "\n*                                                         *"
       + "\n* You and your family have moved to a completely new area.*"
       + "\n* The homes, the roads, and the people are all unfamiliar.  *"
       + "\n* However, something unusual catches your eye.              *"
       + "\n* You see a castle up in the distance. It is located on top *"
       + "\n* of the hill and is surrounded by trees. It doesn’t seem too*"
       + "\n* far away, so you decide to do some exploring.*"
       + "\n* After entering the gates, it looks like no one lives in this castle.*"
       + "\n* It appears that this castle has been abandoned long ago.*"
       + "\n* You decide that it would be best to turn around and maybe*"
       + "\n* come back later. However, the gates have closed behind you…*"
       + "\n* only to be unlocked once you find the key and all challenges are completed.*"
       + "\n* To win the game you must retrieve the key and unlock the gate.*"
       + "\n* In order to do this, each challenge must be completed successfully.*"
       + "\n* Beware of the mad scientist. Good luck.*”
        );
    }

    public void displayStartProgramView() {
          System.out.println("\n*** displayStartProgram() function called ***");
    }
}
