package itxiang_20;

public  abstract class Player extends Person {

	public Player() {
		super();
	}

	public Player(String name, int age) {
		super(name, age);
	}
	public abstract void study();
}
