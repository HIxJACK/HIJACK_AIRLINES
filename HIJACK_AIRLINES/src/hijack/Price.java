package hijack;

public class Price {
	private static double value;
	
	public static double getValue() {
		return value;
	}

	public static void setValue(double value) {
		Price.value = value;
	}

	public Price(){
		value = 0;
	}

}
