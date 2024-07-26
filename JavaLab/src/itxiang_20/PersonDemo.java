package itxiang_20;

public class PersonDemo {
	public static void main(String[] args) {
		//創建對象
		PingPangPlayer ppp=new PingPangPlayer();
		
		ppp.setName("王浩");
		ppp.setAge(30);
		System.out.println(ppp.getName()+","+ppp.getAge());
		ppp.eat();
		ppp.speak();
		ppp.study();
		
		System.out.println("----------------");
		
		BasketballPlayer bp =new BasketballPlayer("姚明",35);
		
		System.out.println(bp.getName()+","+bp.getAge());
		bp.study();
		bp.eat();
		
		PingpongCoach coach=new PingpongCoach("皓呆",30);
		System.out.println(coach.getName()+","+coach.getAge());	
		coach.speak();
		coach.teach();
		coach.eat();

		BasketballCoach bc =new BasketballCoach();
		bc.setName("北七");
		bc.setAge(23);
		System.out.println(bc.getName()+","+bc.getAge());	
		bc.eat();
		bc.teach();
		
	}
}
