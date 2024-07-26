package itxiang_19;

public class AnimalDemo {
	public static void main(String[] args) {
		//創建對象,調用方法
		Jummping j=new Cat();
		j.jump();
		
		System.out.println("--------------");
		
		Animal a=new Cat();
		a.setName("加菲");
		a.setAge(5);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
//		a.jump();
		
		a=new Cat("波斯頓", 10);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		
		System.out.println("--------------");
		
		Cat cat=new Cat();
		cat.setName("大覽貓");
		cat.setAge(20);
		System.out.println(cat.getName()+","+cat.getAge());
		cat.eat();
		cat.jump();
	}
}
