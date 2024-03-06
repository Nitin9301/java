package encapsulation;

public class encap {
		private String name;
		private int roll_no;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no=roll_no;
	}
	public class Main{
		public static void main(String []args) {
		encap student=new encap();
		student.setName("Nitin Nikam");
		student.setRoll_no(49);
		
		System.out.println("Studnet Name: " +student.getName());
		System.out.println("Student Roll No: " +student.getRoll_no());
	}
	}
}

