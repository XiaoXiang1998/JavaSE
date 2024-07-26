package itxiang_05;

public class StudentDemo {
	public static void main(String[] args) {
		Student student=new Student();
		student.setName("五條悟");
		student.setAge(30);
		student.show();
		
		Student student2=new Student("速挪",35);
		student2.show();
	}
}
