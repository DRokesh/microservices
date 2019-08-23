package search;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

	

	void searchRestaurants(String searchText) {
		//ArrayList<Restaurants> restList = findRestaurants(searchText);
		boolean foundFlag= false;
		for (int i = 0; i < foodyDriver.restaurantList.size(); i++) {
			if (foodyDriver.restaurantList.get(i).restaurantName.equalsIgnoreCase(searchText)) {
				//outputModule.writeOutput();
				System.out.println(foodyDriver.restaurantList.get(i).restaurantName + " "
						+ foodyDriver.restaurantList.get(i).restaurantType);
				foundFlag=true;
			}
		}
		if(!foundFlag) {
			System.out.println("No matches found");
		}

	}
}
