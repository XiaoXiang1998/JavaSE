package itxiang_17;

public class Animal {
	private String name;
	private int age;
	
	public Animal() {
		super();
	}

	public Animal(String name, int age) {
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
	public void eat() {
		System.out.println("動物吃東西");
	}
	
}
