package itxiang_20;

public class BasketballPlayer  extends Player{

	@Override
	public void study() {
		System.out.println("籃球運動員學習如何運球和投籃");
	}

	@Override
	public void eat() {
		System.out.println("籃球運動員吃牛肉,喝牛奶");
	}

	public BasketballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasketballPlayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	
}
