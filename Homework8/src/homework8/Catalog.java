package homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {
	private HistoryOfBooks hob = new HistoryOfBooks();
	Scanner in = new Scanner(System.in);
	public int displayOptions() {
		System.out.println("What do you want to do?\n"
				+ "1. To borrow.\n "
				+ "2. To return.\n" 
				+ "3. To buy\n");
		int option = Integer.parseInt(in.nextLine());
		return option;
	}
	
	public void chooseOption(int option) {
		switch(option) {
		case(1):{
			hob.borrow();
			break;
		}
		case(2):{
			hob.returnBook();
			break;
		}
		case(3):{
			hob.buy();
			break;
		}
		
		}
	}
	
	public class HistoryOfBooks{
		Map<String, String> history = new HashMap<String, String>();
		
		private void createList() {
			history.put("Pride and Prejudice by Jane Austen (1813)", "Available");
			history.put("To Kill a Mockingbird by Harper Lee", "Available");
			history.put("The Great Gatsby by F. Scott Fitzgerald", "Available");
			history.put("One Hundred Years of Solitude by Gabriel García Márquez", "Available");
			history.put("In Cold Blood by Truman Capote", "Not Available");
			history.put("Wide Sargasso Sea by Jean Rhys", "Available");
		}
		
		
		public void borrow() {
			System.out.println("Write down the name of a book.");
			String name_of_book = in.nextLine();
			for (Map.Entry<String, String> entry : hob.history.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(name_of_book)) {
					if (checkStatus(name_of_book)) {
						System.out.println("Do you want to borrow it?(type y or n)");
						if (in.nextLine().equals("y")) {
							 entry.setValue("Borrowed");
						}
					}	
				}
			}
			

		}
		
		public void returnBook() {
			System.out.println("Write down the name of a book.");
			String name_of_book = in.nextLine();
			for (Map.Entry<String, String> entry : hob.history.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(name_of_book)) {
					entry.setValue("Available");
				}
			}
		}
		
		public void buy() {
			System.out.println("Write down the name of a book.");
			String name_of_book = in.nextLine();
			for (Map.Entry<String, String> entry : hob.history.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(name_of_book)) {
					if (checkStatus(name_of_book)) {
						System.out.println("Do you want to buy it?(type y or n)");
						if (in.nextLine().equals("y")) {
							 entry.setValue("Not available");
						}
					}	
				}
			}
			

		}
		
		public boolean checkStatus(String name_of_book) {
			for (Map.Entry<String, String> entry : hob.history.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(name_of_book)) {
					if (entry.getValue().equalsIgnoreCase("Available")) {
						System.out.println("The book " + name_of_book + "is available. You can borrow/buy it!");
						return true;
					} else if((entry.getValue().equalsIgnoreCase("Not Available"))){
						System.out.println("Unfortunatelly, the book " + name_of_book + "is not available right now.");
					} else if ((entry.getValue().equalsIgnoreCase("Borrowed"))) {
						System.out.println("Unfortunatelly, the book " + name_of_book + "is not borrowed by another person.");
					}
				} 
			}
			return false;
		}
	
	}
	
	public void display() {
		for (Map.Entry<String, String> entry : hob.history.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalog c = new Catalog();
		c.hob.createList();
		for (int i = 1; i < 5; i++) {
			c.display();
			int option = c.displayOptions();
			c.chooseOption(option);
			
		}
	}

}
