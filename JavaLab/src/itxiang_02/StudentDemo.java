package itxiang_02;

public class StudentDemo {

	public static void main(String[] args) {
		Student student=new Student();		
			
		
		//使用對象
		System.out.println(student.name+","+student.age);
		student.name="智障";
		student.age=50;
		
		System.out.println(student.name+","+student.age);
		student.doHomework();
		student.study();
	}

}
