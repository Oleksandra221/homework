package homework12;

import java.util.ArrayList;
import java.util.Iterator;

public class HeavyBoxRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HeavyBox> list1 = new ArrayList<HeavyBox>();
		
		list1.add(new HeavyBox(9.3, 34,45,50));
		list1.add(new HeavyBox(8.4, 20,55,60));
		list1.add(new HeavyBox(10.8, 40,40,40));
		list1.add(new HeavyBox(11.2, 25,30,35));
		list1.add(new HeavyBox(21.3, 30,40,50));
		
		System.out.println("---Each for loop---");

		for (HeavyBox hb : list1) {
			System.out.println(hb.toString());
		}
		
		System.out.println("------------------------");
		list1.get(0).setWeight(1);
		System.out.println("The first box after changing his weight: " + list1.get(0));
		System.out.println("------------------------");
		list1.remove(list1.size()-1);
		System.out.println("List after deleting last element");
		
		for (HeavyBox hb : list1) {
			System.out.println(hb.toString());
		}
		
		System.out.println("\nfirst method to get elements from the list\n");

		//first method to get elements from the list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("\nSecond method to get elements from the list\n");

		//second method to get elements from the list
		for (HeavyBox hb : list1) {
			System.out.println(hb.toString());
		}
		System.out.println("\nThird method to get elements from the list using iterator\n");

		
		//third method using iterator
		Iterator<HeavyBox> itr = list1.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());

		}
		
		list1.clear();
		
		System.out.println("\nfirst method to get elements from the list\n");

		//first method to get elements from the list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("\nSecond method to get elements from the list\n");

		//second method to get elements from the list
		for (HeavyBox hb : list1) {
			System.out.println(hb.toString());
		}
		System.out.println("\nThird method to get elements from the list using iterator\n");

		
		//third method using iterator -- error
		/*Iterator<HeavyBox> itr = list1.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());

		} */ 
	}

}
