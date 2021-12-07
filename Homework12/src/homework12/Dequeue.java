package homework12;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<HeavyBox> queue = new ArrayDeque<HeavyBox>();
		queue.offer(new HeavyBox(0.5, 34,54,23));
		queue.offer(new HeavyBox(0.2, 25,50,20));
		queue.offer(new HeavyBox(0.1, 10,10,15));
		queue.offer(new HeavyBox(0.7, 45,30,20));
		queue.offer(new HeavyBox(1.9, 20,40,35));
		Iterator<HeavyBox> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//queue.poll();
		}
		queue.poll();
		
		System.out.println("-------------");
		Iterator<HeavyBox> itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		ArrayList<HeavyBox> list = new ArrayList<HeavyBox>();
		ArrayList<HeavyBox> list1 = new ArrayList<HeavyBox>();

		list.add(new HeavyBox(0.5, 34,54,23));
		list.add(new HeavyBox(0.2, 25,50,20));
		list.add(new HeavyBox(0.1, 10,10,15));
		list.add(new HeavyBox(0.7, 45,30,20));
		list.add(new HeavyBox(1.9, 20,40,35));
		
		System.out.println("list--------------------\n");
		for (HeavyBox hb : list) {
			double weight_of_box = hb.getWeight()*1000;
			if (weight_of_box>300) {
				list1.add(hb);
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("list1--------------------\n");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).toString());
		}

		
	}

}
