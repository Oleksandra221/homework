package homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class City {
	Scanner in = new Scanner(System.in);
	String street_name;
	String avenue_name;
	String square_name; 
	private ExtraInfo information = new ExtraInfo();
	
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getAvenue_name() {
		return avenue_name;
	}
	public void setAvenue_name(String avenue_name) {
		this.avenue_name = avenue_name;
	}
	public String getSquare_name() {
		return square_name;
	}
	public void setSquare_name(String square_name) {
		this.square_name = square_name;
	}
	public class ExtraInfo{
		Map<String, String> info = new HashMap<String, String>();
		
		public void addInfo() {
			System.out.println("Do you want to add information about street/avenue/square?");
			if (in.nextLine().equals("street")) {
				System.out.println("Write down the information.");
				info.put(street_name, in.nextLine());
			} else if(in.nextLine().equals("square")){
				System.out.println("Write down the information.");
				info.put(square_name, in.nextLine());
			} else if(in.nextLine().equals("avenue")) {
				System.out.println("Write down the information.");
				info.put(avenue_name, in.nextLine());
			}
		}
	}
	public void innit() {
		information.addInfo();
	}
	public void display() {
		for (Map.Entry<String, String> entry : information.info.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City Torronto = new City();
		Torronto.setStreet_name("Yonge Street");
		Torronto.innit();
		Torronto.display();
	}

}
