package encapsulation;

public class uni {
	private String Name;
	private int Number;
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int Number) {
		this.Number=Number;
	}
	
public class Main{
	public static void main(String []args) {
		uni student=new uni();
		student.setName("Lakhan Rathod");
		student.setNumber(99);
		
		System.out.println("my name is " +student.getName());
		System.out.println("my number is "+student.getNumber());
		
	}
}
}
