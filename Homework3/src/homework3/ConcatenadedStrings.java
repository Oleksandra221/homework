package homework3;

import java.util.Scanner;

public class ConcatenadedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Write down the first line.\n");
		String first_line = in.nextLine();
		System.out.println("Write down the second line.\n");
		String second_line = in.nextLine();
		
		String result = String.join(" ", first_line, second_line);
		System.out.println(result);
	}

}
