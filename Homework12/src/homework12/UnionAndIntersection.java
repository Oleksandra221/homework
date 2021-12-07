package homework12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UnionAndIntersection<T> {
	
	public Set<T> union(Set<T> first_set, Set<T> second_set){
		Set<T> union_set = new TreeSet<T>();
		for (T current_element : first_set) {
			union_set.add(current_element);
		}
		for (T current_element : second_set) {
			union_set.add(current_element);
		}
		
		return union_set;
	}
	
	public Set<T> intersection(Set<T> first_set, Set<T> second_set){
		Set<T> intersection_set = new TreeSet<T>();
		for (T first_element : first_set) {
			for (T second_element : second_set) {
				if (first_element == second_element) {
					intersection_set.add(first_element);
				}
			}
		}
		return intersection_set;
	}
	
	public void display(Set<T> set) {
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnionAndIntersection<String> obj = new UnionAndIntersection<String>();
		Set<String> first_set = new TreeSet<String>();
		Set<String> second_set = new TreeSet<String>();
		
		first_set.add("I");
		first_set.add("love");
		first_set.add("Java");
		first_set.add("and");
		
		second_set.add("coding");
		second_set.add("in");
		second_set.add("Java");
		
		Set union_set = obj.union(first_set, second_set);
		obj.display(union_set);
		System.out.println("-------------------");
		Set intersection_set = obj.intersection(first_set, second_set);
		obj.display(intersection_set);
		
		
		
	}

}
