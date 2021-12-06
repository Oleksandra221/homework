package homework1;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 6;
		int[] numbers = new int[SIZE];
		Random r = new Random();
		
		for (int i = 0; i < SIZE; i++) {
			numbers[i] = r.nextInt(100);
		}
		
		Arrays.sort(numbers);
		
		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}

}
