package itxiang_04;

public class StudentDemo {
	public static void main(String[] args) {
		Student student=new Student();
		
		student.setName("砍爛");
		student.setAge(20);
		
		student.show();
		
		System.out.println(student.getName()+"======"+student.getAge());
		System.out.println(student.getName()+",,,,,,"+student.getAge());

	}
}
