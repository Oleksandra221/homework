package homework12;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHeavyBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<HeavyBox> treeset = new TreeSet<HeavyBox>();
		
		treeset.add(new HeavyBox(9.3, 34,45,50));
		treeset.add(new HeavyBox(8.4, 20,55,60));
		treeset.add(new HeavyBox(10.8, 40,40,40));
		treeset.add(new HeavyBox(11.2, 25,30,35));
		treeset.add(new HeavyBox(21.3, 30,40,50));
		Iterator<HeavyBox> itr = treeset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
