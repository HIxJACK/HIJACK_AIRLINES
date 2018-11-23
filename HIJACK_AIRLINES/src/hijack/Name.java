package hijack;

public class Name {
 private static String value;
	
	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		Name.value = value;
	}

	public Name(){
	}
	
	public Name(String v){
		v = value;
	}
}
