package itxiang_20;

public class PingpongCoach extends Coach implements SpeakEnglish{

	@Override
	public void teach() {
		System.out.println("拚乓球教練教如何發球與接球");
	}

	@Override
	public void eat() {
		System.out.println("拚乓球教練吃小白菜,喝大米粥");
	}

	public PingpongCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PingpongCoach(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		System.out.println("拚乓球教練說英語");
	}
	
	

}
