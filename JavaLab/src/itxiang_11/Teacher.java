package itxiang_11;

public class Teacher {
	private String name;
	private int age;
	public Teacher() {
		super();
	}
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void teach() {
		System.out.println("用愛成就每一位學員:");
	}
}
