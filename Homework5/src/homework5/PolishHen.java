package homework5;

public class PolishHen extends Hen {
	static final String POLAND = "Poland";
	private int numberOfEggs = 56; 
	@Override
	public int getCountOfEggsPerMonth() {		
		return numberOfEggs;
	}
	
	@Override
	public String getDescription() {
		
		return  super.getDescription() + ". My country is "+ POLAND + ". I have " + 
		+ getCountOfEggsPerMonth() + " eggs per mounth.\n";
		
	}
}
