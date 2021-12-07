package homework12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AnimalsRunner {
	
	public static void displayKeysOfAnimals(Map<String, Pet> animals) {
		Iterator<String> itr = animals.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Pet> animals = new HashMap<String, Pet>();
		Pet cat = new Cat("Kitty", 3, "black", "fur", "meow");
		Pet dog = new Dog("Rex", 5, "brown and black", "fur", "woof");
		Pet parrot = new Parrot("Kiesha", 3, "green and yellow", "feather", "chick chirp");
		
		animals.put(cat.getName_of_pet(), cat);
		animals.put(dog.getName_of_pet(), dog);
		animals.put(parrot.getName_of_pet(), parrot);
		
		displayKeysOfAnimals(animals);
		
	}

}
