package NOV18;

public class Student {
	private String name;
	private int num;
	
	public Student() {
	}
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + "]";
	}
	
}
