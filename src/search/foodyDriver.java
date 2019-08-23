package search;

import java.util.ArrayList;
import java.util.Scanner;

public class foodyDriver {
	
	static ArrayList<Restaurants> restaurantList= new ArrayList<Restaurants>();
	public static void main(String args[]) {
		foodyDriver driver= new foodyDriver();
		driver.init();
	}
	
	private void init() {
		Restaurants pizzaHut= new Restaurants(100001,"Pizza Hut", "Italian", "Chennai", (float) 4.0);
		Restaurants thalapakatti = new Restaurants(100002,"Thalapakatti","Biriyani","Chennai", (float)4.0);
		Restaurants juicePoint = new Restaurants(100003,"JuicePoint","Juice and Shakes", "Chennai",(float)3.5);
		Restaurants dominos = new Restaurants(100004,"Dominos", "Italian", "Chennai", (float) 4.1);
		Restaurants punjabiDhaba = new Restaurants(100005,"Punjabi Dhaba","North Indian","Chennai", (float) 4.2);
		addtoRestaurantList(pizzaHut, thalapakatti, juicePoint, dominos, punjabiDhaba);
		Search s = new Search();
		System.out.println("*******Search restaurants******");
		Scanner input = new Scanner(System.in);  
	    System.out.println("Enter restaurant name");
	    String restaurantName = input.nextLine();
		s.searchRestaurants(restaurantName);
		
	}

	private void addtoRestaurantList(Restaurants pizzaHut, Restaurants thalapakatti, Restaurants juicePoint,
			Restaurants dominos, Restaurants punjabiDhaba) {
		restaurantList.add(pizzaHut);
		restaurantList.add(thalapakatti);
		restaurantList.add(juicePoint);
		restaurantList.add(dominos);
		restaurantList.add(punjabiDhaba);
	}

}
