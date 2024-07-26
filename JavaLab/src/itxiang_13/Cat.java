package itxiang_13;

public class Cat extends Animal {
public Cat() {}
	
	public Cat(String name,int age) {
		super(name, age);
	}
	
	public void catchMouse() {
		System.out.println("貓抓老鼠");
	}
}
