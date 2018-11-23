package hijack;

public class Atlanta extends City{
	private static String name;
	private static double price;
	private static double priceKids;
	public static Time time;
	
	public static String getName() {
		return name;
	}

	public static double getPrice() {
		return price;
	}
	
	public static void setPrice(int price) {
		Atlanta.price = price;
		Atlanta.priceKids = price/2;
	}
	
	public static double getPriceKids() {
		return priceKids;
	}
	
	public static String getTime() {
		return time.getTime();
	}
	
	public Atlanta() {
		price = 109.74;
		priceKids = price/2;
		time = new Time(1+ (int) (Math.random() * 3));
		name = "Atlanta";
		City.cityCount++;
	}

}
