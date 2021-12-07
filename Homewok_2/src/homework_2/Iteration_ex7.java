package homework_2;

import java.util.Scanner;

public class Iteration_ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		for (int i = 1; i<=3;i++) {
			System.out.println("What is it: blue, big, with a mustache and full of hares?\n");
			String answer = in.nextLine();
			if (answer.equals("Trolleybus")) {
				System.out.println("Right!\n");
				break;
			}
			if((!answer.equals("Trolleybus"))&&(i!=3)&&(!answer.equals("Give up"))){
				System.out.println("Try again.\n");
			}
			if((answer.equals("Give up"))) {
				System.out.println("The right answer is: Trolleybus.\n");
				break;
			}
		}
		
	}

}
