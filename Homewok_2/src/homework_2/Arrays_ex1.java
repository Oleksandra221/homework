package homework_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Arrays_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] numbers = new int[8];
		
		//Exercise 1
		
		System.out.println("Exercise 1.\n");
		
		for (int i = 0; i < numbers.length; i++) {
			int random_number = rand.nextInt(10);
			numbers[i] = random_number;
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			if ((i+1) % 2 != 0) {
				numbers[i] = 0;
			}
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		//Exercise 2
		
		System.out.println("\nExercise 2.\n");
		
		int[] arr2 = new int[12];
		
		for (int i = 0; i < arr2.length; i++) {
			int random_number = rand.nextInt(30)-15;
			arr2[i] = random_number;
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		int max = arr2[0];
		int index =0;
		
		for (int i = 0; i < arr2.length; i++) {
			if (max<arr2[i]) {
				max = arr2[i];
				index = i;
			}
		}
		System.out.println("Index od max is " + index);
		
		//Exercise 3
		
		System.out.println("\nExercise 3.\n");
		
		int[] arr3 = new int[4];
		
		for (int i = 0; i < arr3.length; i++) {
			int random_number = rand.nextInt(99-10)+10;
			arr3[i] = random_number;
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i < arr3.length; i++) {
			if(arr3[i-1] > arr3[i]) {
				System.out.print("Array is not an example of a growing sequence.\n");
				break;
			} else {
				if (i==arr3.length-1) {
					System.out.print("Array is an example of a growing sequence.\n");
				}
			}
		}
		//Exercise 4
		
		System.out.println("\nExercise 4.\n");
		String[] arr_str = {"Lions", "are", "the", "King", "of", "the", "animals"};
		for (String s:arr_str) {
			System.out.print(s + " ");
		}
		
		String temp;
		
		for (int i = 0; i < arr_str.length/2; i++ ) {
			temp = arr_str[i];
			arr_str[i] = arr_str[arr_str.length - i -1];
			arr_str[arr_str.length - i -1] = temp;
		}
		
		System.out.println();
		
		for (String s:arr_str) {
			System.out.print(s + " ");
		}
		//Exercise 5
		
		System.out.println("\nExercise 5.\n");
		System.out.println();
		
		int[] first_arr = new int[5];
		int[] second_arr = new int[5];
		
		for (int i = 0; i < first_arr.length; i++) {
			int random_number = rand.nextInt(5-0)+0;
			int random_number1 = rand.nextInt(5-0)+0;
			first_arr[i] = random_number;
			second_arr[i] = random_number1;
			System.out.print(first_arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < second_arr.length; i++) {
			System.out.print(second_arr[i] + " ");
		}
		
		int sum_first_arr = 0;
		int sum_second_arr = 0;
		
		for (int i = 0; i < second_arr.length; i++) {
			sum_first_arr+=first_arr[i];
			sum_second_arr+=second_arr[i];	
		}
		
		double average1 = sum_first_arr / first_arr.length; 
		double average2 = sum_second_arr / second_arr.length; 
		
		if (average1 > average2) {
			System.out.println("\nThe average of the first array is bigger\n");
		} else {
			if (average1 < average2) {
				System.out.println("\nThe average of the second array is bigger\n");
			} else {
				if (average1 == average2) {
					System.out.println("\nThe averages are equal\n");
				}
			}
		}
	}

}
