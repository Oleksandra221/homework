package homework5;

public class BelarusianHen extends Hen{
	
	static final String BELARUS = "Belarus";
	private int numberOfEggs = 102;
	
	@Override
	public int getCountOfEggsPerMonth() {
		
		return numberOfEggs;
	}
	
	@Override
	public String getDescription() {

		return super.getDescription() + ". My country is "+ BELARUS + ". I have " + 
		+ getCountOfEggsPerMonth() + " eggs per mounth.\n";
		
	}

}
