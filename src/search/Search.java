package search;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

	Restaurants searchRestaurants(String searchText) {
		// ArrayList<Restaurants> restList = findRestaurants(searchText);

		for (int i = 0; i < foodyDriver.restaurantList.size(); i++) {
			if (foodyDriver.restaurantList.get(i).restaurantName.equalsIgnoreCase(searchText)) {
				foodyDriver.restaurantList.get(i)
						.setNumberofRatings(foodyDriver.restaurantList.get(i).getNumberofRatings()+1);
				return foodyDriver.restaurantList.get(i);
			}
		}
		return null;

	}
}
