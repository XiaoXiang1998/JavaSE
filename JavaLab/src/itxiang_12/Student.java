package itxiang_12;

public class Student extends Person{
	
	public Student() {}
	
	public Student(String name,int age) {
		super(name, age);
	}
	
	public void study() {
		System.out.println("天天向上,努力學習");
	}
}
