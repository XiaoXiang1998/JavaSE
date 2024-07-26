package itxiang_20;

public class PingPangPlayer extends  Player implements SpeakEnglish{

	@Override
	public void speak() {
		System.out.println("拚乓球運動員說英語");
	}

	@Override
	public void study() {
		System.out.println("拚乓球運動員學習如何發球和接球");
		
	}

	@Override
	public void eat() {
		System.out.println("拚乓球運動員吃大白菜,喝小米粥");
	}

	public PingPangPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PingPangPlayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

}
