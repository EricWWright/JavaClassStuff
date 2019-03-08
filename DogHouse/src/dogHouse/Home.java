package dogHouse;

public class Home {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		String name = myDog.getName();
		
		// print an introductory message using the name
		System.out.println("A day in the life of my dog " + name);

		// test all of the dog's behavioral commands while awake
		myDog.wakeUp();
		myDog.feed();
		myDog.hear("ding-dong");
		myDog.hear("ding-dong");
		myDog.hear(name);
		myDog.hear("ding-dong");
		myDog.hear("ding-dong");
		myDog.feed();
		myDog.feed();

		// test to ensure the dog doesn't do anything while asleep
		System.out.println("\nNight-time...");
		myDog.sleep();
		myDog.feed();
		myDog.hear("ding-dong");
		myDog.wakeUp();

		// test to ensure the dog resets correctly when woken for a new day
		System.out.println("\nAnother day...");
		myDog.hear("ding-dong");
		myDog.feed();
		myDog.feed();
		myDog.feed();
	}

}
