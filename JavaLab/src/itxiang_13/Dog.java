package itxiang_13;

public class Dog extends Animal {
	public Dog() {}
	
	public Dog(String name,int age) {
		super(name, age);
	}
	public void watch() {
		System.out.println("狗看門");
	}
}
