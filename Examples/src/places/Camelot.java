package places;

import people.Knight;

public class Camelot {

	public static void main(String[] args) {
		Knight myKnight = new Knight();   // create a new Knight

        // OK!  name is a public property     
        String yourName = myKnight.getMyName();   

        // ERROR!  Can't access private property
        myKnight.setHorseNickname("Pudgy"); 

        // ERROR! Can't access protected property
        int skill = myKnight.getSkillLevel();  

        //  OK!  wakeUp() is a public method.
        myKnight.wakeUp();  

         // ERROR!   Can't access protected method
        myKnight.donArmor(); 

        // ERROR! Can't access private method 
        if (myKnight.isHungry()) {
        	
        }

	}

}
