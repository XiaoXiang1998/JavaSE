package itxiang_13;

public class AnimalDemo {

	public static void main(String[] args) {
		//創建貓類對象並進行測試
		Cat c1=new Cat();
		c1.setName("加菲貓");
		c1.setAge(5);
		System.out.println(c1.getName()+","+c1.getAge());
		c1.catchMouse();

		Cat c2=new Cat("懶覺貓",5);
		System.out.println(c2.getName()+","+c2.getAge());
		c2.catchMouse();
		
		//創建狗類並進行測試
		Dog d1=new Dog();
		d1.setName("柴犬");
		d1.setAge(6);
		System.out.println(d1.getName()+","+d1.getAge());
		d1.watch();

		Dog d2=new Dog("柯基", 8);
		System.out.println(d2.getName()+","+d2.getAge());
		d2.watch();
	}

}
