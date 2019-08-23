package search;

public class Restaurants {
	long restaurantId;
	String restaurantName;
	String restaurantType;
	String restaurantAddress;
	float restaurantRating;
	int numberofRatings;

	public long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantType() {
		return restaurantType;
	}

	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public float getRestaurantRating() {
		return restaurantRating;
	}

	public void setRestaurantRating(float restaurantRating) {
		this.restaurantRating = restaurantRating;
	}

	public int getNumberofRatings() {
		return numberofRatings;
	}

	public void setNumberofRatings(int numberofRatings) {
		this.numberofRatings = numberofRatings;
	}

	public Restaurants(long id, String name, String type, String addr, float rating) {
		this.restaurantId = id;
		this.restaurantName = name;
		this.restaurantType = type;
		this.restaurantAddress = addr;
		this.restaurantRating = rating;
		this.numberofRatings = 1;
	}

}
