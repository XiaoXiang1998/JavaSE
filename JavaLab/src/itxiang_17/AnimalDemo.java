package itxiang_17;

public class AnimalDemo {

	public static void main(String[] args) {
		//創建貓類對象進行測試
		Animal animal=new Cat();
		animal.setName("家非");
		animal.setAge(5);
		System.out.println(animal.getName()+","+animal.getAge());
		animal.eat();

		animal=new Cat("波斯頓",8);
		System.out.println(animal.getName()+","+animal.getAge());
		animal.eat();
		
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
