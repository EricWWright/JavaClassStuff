package people;

public class Knight {
	
	public Knight() {
		super();
	}
	
	static public String greeting = "Hail and well met, my name is ";
	// everyone knows your name!
    private String myName = "Sir Jousts-a-Lot";
    String age = "0";
    public String askName() {
        // use  static and non-static data! 
        return Knight.greeting + myName;  
    }
    
    static private int maxWeight = 400;  // max weight of all Knights
    private int myWeight = 150;  // weight of this particular Knight

    // set a new maximum weight for all Knights!
    static public void setMaxWeight(int newWeight) {
         // maxWeight is static, so OK to access  from static method
         maxWeight = newWeight;  

         // BUT CAN'T ACCESS non-static myWeight property 
         if (myWeight > maxWeight) { // ERROR - non-static access 
            System.out.println("Go on a diet!");  
         }
    }
    
    static public String introduce(String source) {
         if (source.equals("goblin")) {
            return "Prepare to die, creature!";  
         }
         else if (source.equals("damsel")) {
            return "Do you need rescuing?";  
         }
         else if (source.equals("knight")) {
            return "Well met, brother knight!";  
         }
         return "Out of my way!";  
    }

    public Knight(String myName, String age) {
		super();
		this.myName = myName;
		this.age = age;
	}

	public Knight(String myName) {
		super();
		this.myName = myName;
	}

	// nobody else needs to know this
    private String horseNickname = "Stinker";

    // knights and anyone else inheriting from this class  
    // will have a skill level
    private int skillLevel = 100;

    // anyone can wake you up, whether you like it or not!
    public void wakeUp() {
    }

    // only you can tell if you are hungry!
    private boolean isHungry() {
       return true;      // jousting is hard work
    }

    // knights and anyone else inheriting from this class have  
    // the ability to put on armor
    protected void donArmor() {
    	
    }

	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String myName) {
		if ((myName != null) && (myName.length() > 0)) {
			this.myName = myName;
		}
	}

	public String getHorseNickname() {
		return horseNickname;
	}

	public void setHorseNickname(String horseNickname) {
		this.horseNickname = horseNickname;
	}

	public int getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(int skillLevel) {
		this.skillLevel = skillLevel;
	}
}
