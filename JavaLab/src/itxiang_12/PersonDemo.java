package itxiang_12;

public class PersonDemo {

	public static void main(String[] args) {
		//創建老師類對象
		Teacher t1=new Teacher();
		t1.setName("林青霞");
		t1.setAge(30);
		System.out.println(t1.getName()+","+t1.getAge());
		t1.teach();
			
		Teacher t2=new Teacher("風清揚",30);
		System.out.println(t2.getName()+","+t2.getAge());
		t2.teach();
		//創建學生類對象
		Student student=new Student();
		student.setName("混蛋");
		student.setAge(20);
		System.out.println(student.getName()+","+student.getAge());
		student.study();
		
		Student student2=new Student("小鬼",30);
		System.out.println(student2.getName()+","+student2.getAge());
		student2.study();
	}

}
