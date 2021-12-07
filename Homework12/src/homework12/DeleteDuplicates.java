package homework12;


import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class DeleteDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		
		System.out.println("Write down numbers:");
		String nums = in.nextLine();
		String str_element = "";
		for (int i = 0; i < nums.length(); i++) {
			if ((nums.charAt(i)!=' ')) {
				str_element += String.valueOf(nums.charAt(i));
			} else {
				int element = Integer.parseInt(str_element);
				treeset.add(element);
				str_element = "";
			}
	
		}
		
		Iterator<Integer> itr = treeset.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
	}
}
