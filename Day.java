package BasicPrograms;

public class Day {

	enum day {
		Sunday,
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday ,
		Saturday ;
	}
	
	public static final Day Sunday =null;
	
	public static void main(String[] args) {
		
		Day Today = Day. Sunday;
		System.out.println("Today is " + Today);

	}

}
