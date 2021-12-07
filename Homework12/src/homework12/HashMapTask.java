package homework12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTask {

	public static void iterationEntrySet(Map<String, Product> map) {
		System.out.println("-----iteration using entrySet------\n");
		for (Map.Entry<String, Product> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().toString());

		}
	}
	
	public static void iterationKeySet(Map<String, Product> map) {
		System.out.println("-----KeySet------\n");
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
		}
	}
	public static void iterationValues(Map<String, Product> map) {
		System.out.println("-----Values------\n");
		
		System.out.println(map.values().toString());
		
		System.out.println("-----getValue using entrySet------\n");
		for (Map.Entry<String, Product> entry : map.entrySet()) {
			System.out.println(entry.getValue().toString());

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Product> toys = new HashMap<String, Product>();
		
		toys.put("Bear", new Product(134.9, "China"));
		toys.put("Unicorn", new Product(345.78, "USA"));
		toys.put("Constructor", new Product(567.45, "UK"));
		toys.put("Hello Kitty", new Product(215.56, "Japan"));
		toys.put("Barbie Doll", new Product(499.9, "Poland"));
		
		iterationEntrySet(toys);
		iterationKeySet(toys);
		iterationValues(toys);
		
		
	}
		

}
