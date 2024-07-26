package itxiang_18;



public class AnimalDemo {

	public static void main(String[] args) {
		//創建對象,按照多態的方式
		Animal a =new Cat();
		a.setName("家非");
		a.setAge(5);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		
		a=new Cat("波斯頓", 10);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		
		Animal dog=new Dog();
		dog.setName("柴犬");
		dog.setAge(9);
		System.out.println(dog.getName()+","+dog.getAge());
		dog.eat();
		
		dog=new Dog("柯基", 10);
		System.out.println(dog.getName()+","+dog.getAge());
		dog.eat();
	}

}
