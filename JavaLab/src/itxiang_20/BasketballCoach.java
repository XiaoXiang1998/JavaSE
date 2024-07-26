package itxiang_20;

public class BasketballCoach extends Coach{

	@Override
	public void teach() {
		System.out.println("籃球教練教如何運球");
	}

	@Override
	public void eat() {
			System.out.println("籃球教練吃羊肉,喝羊奶");
	}

	public BasketballCoach() {
		
	}

	public BasketballCoach(String name, int age) {
		super(name, age);
	}
	
}	
