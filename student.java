package polymorfism;

public class student {
	static String Name(String n, String m) {
		return m;
	}
	static int Name(int n, int m) {
		return n+m;
	}
class Main{
	public static void main(String[]args) {
		System.out.println(student.Name("Nitin","Nikam"));
		System.out.println(student.Name(10, 20));
	}
}
}
