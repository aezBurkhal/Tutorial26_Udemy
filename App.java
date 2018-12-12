import world.Plant;

public class App {
	/**
	 * private --- only within class
	 * public --- from anywhere
	 * protected --- subclass and same package
	 * no modifier --- same package only
	 * 
	 */

	public static void main(String[] args) {
	Plant plant = new Plant();
	
	System.out.println(plant.name);
	
	System.out.println(plant.ID);
	
	
	//size is protected; App is not in the same package as Plant. so it will not work
	
	//wont work ---type is private
	//System.out.println(plant.size);
	

	}

}
