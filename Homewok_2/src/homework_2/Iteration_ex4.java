package homework_2;

import java.util.Scanner;

public class Iteration_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Write down the number.\n");
		
		int number = in.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
