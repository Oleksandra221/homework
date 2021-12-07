package homework5;

public class MoldovanHen extends Hen {
	
	static final String MOLDOVA = "Moldova";
	private int numberOfEggs = 85;
	
	public int getCountOfEggsPerMonth() {
		return numberOfEggs;
	}
	
	public String getDescription() {
		 
		return super.getDescription() + ". My country is "+ MOLDOVA + ". I have " + 
	+ getCountOfEggsPerMonth() + " eggs per mounth.\n";
		
	}
}
