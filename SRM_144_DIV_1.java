public class Time {
	public String whatTime(int seconds){
		int sec = seconds % 60;
		int temp = (seconds - sec)/60;
		int minutes = temp % 60;
		int hours = ((temp - minutes)/60);
		return hours+":"+minutes+":"+sec;
	}
}