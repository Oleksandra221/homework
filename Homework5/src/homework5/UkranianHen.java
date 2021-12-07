package homework5;

public class UkranianHen extends Hen {
	
	static final String UKRAINE = "Ukraine";
	
	private int numberOfEggs = 132;
	@Override
	public int getCountOfEggsPerMonth() {
		
		return numberOfEggs;
	}
	@Override
	public String getDescription() {
		
		return super.getDescription() + ". My country is "+ UKRAINE + ". I have " + 
		+ getCountOfEggsPerMonth() + " eggs per mounth.\n";
	}
}
