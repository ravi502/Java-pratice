class Student
{
	int roll;
	char name;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}
	
}
public class Encapusulation {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setRoll(2);
		
		System.out.println(obj.getRoll());
		

	}

}
