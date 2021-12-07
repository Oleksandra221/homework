package homework8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Notepad {
	
	Date date = new Date();
	private CreateNote createNote;
	Scanner in = new Scanner(System.in);
	

	
	public void createData() throws ParseException {
		
		System.out.println("Write down date in the form (dd-MM-yyyy)");
		String date_string = in.nextLine();
		
	       //Instantiating the SimpleDateFormat class
		
	       SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");   
	       //Parsing the given String to Date object
	       this.date = formatter.parse(date_string);      
	       System.out.println("Date value: "+date);
	       /*this.day = date.getDay();
	       this.month = date.getMonth();
	       this.year = date.getYear();*/
		
	}
	
	public void innit() {
		createNote = new CreateNote();
		createNote.createNotes();
		createNote.displayNotes();
	}
	
	public class CreateNote{
		
		ArrayList<String> notes = new ArrayList<String>();
		
		private boolean end = true;
		public void createNotes(){
			while(end) {
				System.out.println("Write down a note for the data: " + date + ". (or type false to exit)");
				String note = in.nextLine();
				if (note.equalsIgnoreCase("false")){
					end = false;
				} else {
					notes.add(note);
				}
			}		
		}
		
		public void displayNotes() {
			System.out.println("Notes for the data (" + date + "):");
			for (int i = 0; i < notes.size(); i++) {
				System.out.println("- " + notes.get(i) +";");
			}
		}
	}

public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Notepad note = new Notepad();
		note.createData();
		note.innit();
		
	}

}
