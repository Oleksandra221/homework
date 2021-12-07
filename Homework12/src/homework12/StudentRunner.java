package homework12;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
	public static void printStudents(List<Student> students, int course) {
		for (Student student : students) {
			if (student!=null) {
				if (student.getCourse() == course ) {
					System.out.println(student.getName() + ": " + course);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		double[] points = {3.5, 2.0, 3.0, 3.0};
		double[] points1 = {3.0, 4.0, 4.0, 5.0};
		double[] points2 = {3.0, 2.0, 3.0, 2.0};
		double[] points3 = {3.5, 5.0, 5.0, 4.0};
		
		students.add(new Student("Andrew", 3, 1, points));
		students.add(new Student("Ann", 3, 2, points1));
		students.add(new Student("Paul", 2, 3, points2));
		students.add(new Student("Filip", 4, 2, points3));
		
		for (int i = 0; i < students.size(); i++) {
			
			if (students.get(i).getAvg() >=3.0) {
				students.get(i).setCourse(students.get(i).getCourse()+1);
			}else {
				students.set(i, null);
			}
	
		}
		
		printStudents(students, 3);
		
		
	}
}
