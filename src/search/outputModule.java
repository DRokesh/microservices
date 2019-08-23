package search;

import java.util.ArrayList;

public class outputModule {

	 static void writeOutput(Restaurants restaurant){
		System.out.println(restaurant.getRestaurantName() + " "
				+ restaurant.getRestaurantType() + " "
				+ restaurant.getRestaurantRating() + " ("
				+ restaurant.getNumberofRatings()+")");
	}
	
}
