package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list = new ArrayList();
		
		list.add("gl");
		list.add("bus");
		list.add("lololo");
		
		System.out.println("The given word are :");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("The given word is: bib\n");
		System.out.println("The strings containing this word are: \n");
		
		for (int i = 0; i < list.size(); i++) {
			checkExistance(list.get(i), "glo");
		}
		
	}
	
	public static void checkExistance(String str1, String str_to_check) {
		int chk = 0;
		char chhr;
		int index = Character.MAX_VALUE + 1;
		int[] a = new int[index];
		for (int i = 0; i < str1.length(); i++) {
			chhr = str1.charAt(i);
			++a[chhr];
		}
		for (int i = 0; i < str_to_check.length(); i++) {
			chhr = str_to_check.charAt(i);
			
			if (a[chhr] < 1) {
				chk = 1;
			}
		}
		if (chk !=1) {
			System.out.println(str1);
		}
	}

}
