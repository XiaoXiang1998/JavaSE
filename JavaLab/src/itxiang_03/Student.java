package itxiang_03;

public class Student {
	//成員變量
	String name;
//	int age;
	private int age;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		
		if(age<0 ||age>120) {
			System.out.println("你給的年齡有問題");
		}else {
			this.age = age;

		}
	}


	//成員方法
	public void show() {
		System.out.println(name+","+age);
	}
	
}
