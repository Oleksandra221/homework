package homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
	int failed_exams = 0;
	int succeed_exams = 0;
	Scanner in = new Scanner(System.in);
	
	private Info info = new Info();
	
	public boolean credit() {
		return false; 
	}
		
	public int getFailed_exams() {
		return failed_exams;
	}

	public int getSucced_exams() {
		return succeed_exams;
	}

	public class Info{
		Map<String, Double> record_book = new HashMap<String, Double>();
		
		public void createRecordBook() {
			System.out.println("Write down a name of am exam.");
			String exam_name = in.nextLine();
			System.out.println("Write down a grade of an exam.");
			double grade = Double.parseDouble(in.nextLine());
			record_book.put(exam_name, grade);
		}
		public void failedOrSucceed() {
			for (Map.Entry<String, Double> entry : info.record_book.entrySet()) {
				if(entry.getValue()>=3) {
					succeed_exams += 1;
				} else {
					failed_exams += 1;
				}
			}
		}
		
		public void displayRecordBook() {
			for (Map.Entry<String, Double> entry : info.record_book.entrySet()) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		for (int i = 1; i <=4; i++) {
			student1.info.createRecordBook();
		}
		student1.info.displayRecordBook();
	}

}
