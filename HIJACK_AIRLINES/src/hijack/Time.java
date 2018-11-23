package hijack;

public class Time {
	private String time;
	
	public String getTime() {
		return time;
	}

	public Time(){
	}
	
	public Time(int t){
		if (t == 1){
			time = 12+":"+(int) (Math.random() * 60)+"PM";
		}
		else if (t == 2){
			time = (int) (Math.random() * 12)+":"+(int) (Math.random() * 60)+"AM";
		}
		else if (t == 3){
			time = 1 + (int) (Math.random() * 11)+":"+(int) (Math.random() * 60)+"PM";
		}
		else {
			time=null;
		}
	}

}
