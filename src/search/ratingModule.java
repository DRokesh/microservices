package search;

import java.util.Scanner;

public class ratingModule {

	void rateRestaurant(Restaurants restaurant) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter restaurant rating");
		float rating = input.nextFloat();
		rating = rating+restaurant.getRestaurantRating()/restaurant.getNumberofRatings();
		restaurant.setRestaurantRating(rating);	
	}
}
