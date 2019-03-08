import java.util.Calendar;

/* Java Programming
   Chapter Two
   Show Time
   EricWWright
   1/19
*/


//Show current time in console

public class showClock {//start class

   public static void main(String[] args) {
	
	while (1 < 5) {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("");
		} 
   		System.out.println(Calendar.getInstance().getTime());
	}
   }
}//end class