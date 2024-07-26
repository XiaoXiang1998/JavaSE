package itxiang_12;

public class Teacher extends Person {
	
	public Teacher() {}
	
	public Teacher(String name,int age) {
		super(name,age);
	}
	
	public void teach() {
		System.out.println("用愛成就每一位學員");
	}
}
