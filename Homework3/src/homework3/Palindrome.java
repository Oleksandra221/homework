package homework3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Write down a line to check whether it's a palindrome.\n");
		String line = in.nextLine();
		String line_extra = ""; 
		
		for (int i = line.length()-1; i >= 0; i--) {
			line_extra += line.charAt(i);
		}
		
		
		if (line.equals(line_extra)) {
			System.out.println("It's a palindrome.\n");
		} else {
			System.out.println("It's not a palindrome.\n");
		}
		
		
	}

}
