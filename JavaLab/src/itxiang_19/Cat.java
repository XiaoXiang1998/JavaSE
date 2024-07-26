package itxiang_19;

public class Cat extends Animal implements Jummping {

	@Override
	public void jump() {
		System.out.println("貓可以跳高了");
	}

	@Override
	public void eat() {
		System.out.println("貓吃魚");
	}

	public Cat() {
		super();
		
	}

	public Cat(String name, int age) {
		super(name, age);
	}

}
