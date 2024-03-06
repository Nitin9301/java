package oops;

public class Info {
	static String Student_name;
	static double Student_marks;
	
	static void student(String n, double p) {
		Student_name=n;
		Student_marks =p;
		
	}
	static void Students() {
		System.out.println("Student name is " + Student_name);
		System.out.println("Obtained marks are " +Student_marks);
	}
	public static void main(String[]args) {
		Info.student("Nitin Nikam", 86.65);
		Info.Students();
		
	}
}
