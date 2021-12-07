package homework5;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HenFactory hen = new HenFactory();
		UkranianHen uh = new UkranianHen();
		PolishHen ph = new PolishHen();
		MoldovanHen mh = new MoldovanHen();
		BelarusianHen bh = new BelarusianHen();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Write down a country(Poland, Moldova, Belarus, Ukraine)");
		String option = in.nextLine();
		
		if (option.equalsIgnoreCase(hen.BELARUS)){
			System.out.println(bh.getDescription());
		} else if (option.equalsIgnoreCase(hen.MOLDOVA)){
			System.out.println(mh.getDescription());
		} else if (option.equalsIgnoreCase(hen.POLAND)){
			System.out.println(ph.getDescription());
		} else if (option.equalsIgnoreCase(hen.UKRAINE)){
			System.out.println(uh.getDescription());
		} else {
			System.out.println("The information about " + option + " is missing.");
		}	
	}
}


