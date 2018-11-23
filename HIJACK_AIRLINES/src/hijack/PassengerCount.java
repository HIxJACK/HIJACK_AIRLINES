package hijack;

public class PassengerCount {
private static int adult;
private static int child;

public static int getAdult() {
	return adult;
}

public static void setAdult(int adult) {
	PassengerCount.adult = adult;
}

public static int getChild() {
	return child;
}

public static void setChild(int child) {
	PassengerCount.child = child;
}

public PassengerCount(){
	adult = 0;
	child = 0;
}

public PassengerCount(int a){
	adult = a;
	child = 0;
}

public PassengerCount(int a, int c){
	adult = a;
	child = c;
}

}