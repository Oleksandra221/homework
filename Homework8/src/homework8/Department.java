package homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Department {
	Scanner in = new Scanner(System.in);
	private Posts p = new Posts();
	
	
	public class Posts{
		Map<String, String> posts = new HashMap<String, String>();
		
		public void createListofWorkersAndTheitPosts() {
			System.out.println("Write down a name and a surname of an employee.");
			String name_surname = in.nextLine();
			System.out.println("Write down a post of an employee.");
			String post = in.nextLine();
			
			posts.put(name_surname, post);
		}
		
	}
	
	public void display() {
		for (Map.Entry<String, String> entry : p.posts.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d = new Department();
		for (int i = 1; i < 3; i++) {
			d.p.createListofWorkersAndTheitPosts();
		}
		d.display();
	}

}
