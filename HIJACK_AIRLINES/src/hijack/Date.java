package hijack;

public class Date {
private static String Departure;
private static String Return;

public static String getDeparture() {
	return Departure;
}

public static void setDeparture(String departure) {
	Departure = departure;
}

public static String getReturn() {
	return Return;
}

public static void setReturn(String return1) {
	Return = return1;
}


public Date(){
	Departure = "";
	Return = "";
}

public Date(String d){
	d = Departure;
}


public Date(String d, String r){
	d = Departure;
	r = Return;
}
}
