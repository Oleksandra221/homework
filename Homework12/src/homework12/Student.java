package homework12;

public class Student {
	
	private String name;
	private int group;
	private int course;
	private double[] points;
	
	Student(){
		
	}
	
	Student(String name, int group, int course, double[] points){
		this.course = course;
		this.group  = group;
		this.name = name;
		this.points = points;
	}
	
	public double getAvg() {
		double sum = 0; 
		int count = 0;
		for (double i : points) {
			sum+=i;
			count+=1;
		}
		double avg = sum/count;
		
		return avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public double[] getPoints() {
		return points;
	}

	public void setPoints(double[] points) {
		this.points = points;
	}
	
	
	
}
