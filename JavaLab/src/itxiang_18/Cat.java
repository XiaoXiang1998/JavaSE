package itxiang_18;

public class Cat extends Animal{
	
	public Cat() {}
	
	public Cat(String name,int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {
		System.out.println("貓吃魚");
	}

}
