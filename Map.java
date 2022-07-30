import java.util.HashMap;
import java.util.Scanner;
public class Map{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, String> carMake = new HashMap<>();

		carMake.put("Subaru", "Forester");
		carMake.put("Subaru","WRX");
		carMake.put("Subaru","Crosstrek");
		carMake.put("Subaru","Outback");
		carMake.put("Subaru","Impreza");
		carMake.put("Subaru", "Legacy");
		System.out.println("Welcome to PNW Subaru! What model are you interested in?");
		String response = input.nextLine();
		 if(response.equalsIgnoreCase ("Forester")) {
			 System.out.printf("Great, Foresters are right this way!");
		 } else if(response.equalsIgnoreCase("WRX")) {
			 System.out.printf("Ah, a rally driver eh? Right this way!");
		 } else if(response.equalsIgnoreCase("Crosstrek")) {
			 System.out.printf("Right this way!");
		 } else if(response.equalsIgnoreCase("Outback")) {
			 System.out.printf("Solid choice, follow me!");
		 } else if(response.equalsIgnoreCase("Impreza")) {
			 System.out.printf("We just got new inventory in, let's go see them!");
		 } else if(response.equalsIgnoreCase("Legacy")) {
			 System.out.printf("Sounds great, come with me!");
		 } else { 
			 System.out.printf("I'm sorry, we don't have that vehicle.");
			 
		 	}
		
		}
		
	}


  