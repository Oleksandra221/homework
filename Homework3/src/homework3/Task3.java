package homework3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Write down the first line.\n");
		String line = in.nextLine();
		String[] arr_str = line.split(" ");
		String result = "";
		for (String s: arr_str) {
			for (int i = 0; i < s.length(); i+=2) {
				result += s.charAt(i);
			}
			result+=" ";
		}
		System.out.println(result);
	}

}
