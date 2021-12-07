package homework3;

import java.util.Scanner;

public class CompareStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Write down the first line.\n");
		String first_line = in.nextLine();
		System.out.println("Write down the second line.\n");
		String second_line = in.nextLine();
		
		if (first_line.equalsIgnoreCase(second_line)) {
			System.out.println(first_line + " is equal to " + second_line + "\n");
		}
	}

}
