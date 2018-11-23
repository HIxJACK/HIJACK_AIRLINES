package hijack;

public class City {

	private static String name;
	private static double price;
	private static double priceKids;
	public static Time time;
	protected static int cityCount = 0;
	
	public static String getName() {
		return name;
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		City.price = price;
		City.priceKids = price/2;
	}
	
	public static double getPriceKids() {
		return priceKids;
	}

	public static String getTime() {
		return time.getTime();
	}
	
	public static Class<City> getCity(){
		return City.class;
	}

	public City(){
		price = 200;
		priceKids = price/2;
		time = new Time(1+ (int) (Math.random() * 3));
		name = "City"+cityCount++;
	}
	
	public City(String n, int p){
		if (p > 0 && p < 200){
			time = new Time(1+ (int) (Math.random() * 3));
		} 
		else if (p == 200){
			time = new Time(1+ (int) (Math.random() * 3));
		} 
		else if (p > 200 == p < 1000){
			time = new Time(1+ (int) (Math.random() * 3));
		}
		else {
			time = null;
		}
		name = n;
		price = p;
		priceKids = p/2;
		cityCount++;
	}
	
//	static class Name {
//		 private static String value;
//		 private static City c;
//			
//			public static String getValue() {
//				return value;
//			}
//
//			public Name(){
//			}
//			
//			public Name(String v){
//				v = value;
//			}
//		}

	
	
}
