package itxiang_16;

public class StaticDemo {
	public static void main(String[] args) {
		
		Student.university="北港大學";
		
		Student s1=new Student();
		
		s1.name="林鷹俠";
		s1.age=30;
//		s1.university="船至大學";
		s1.show();
		
		Student s2=new Student();
		s2.name="風清揚";
		s2.age=33;
//		s2.university="船至大學";
		s2.show();
	}
}
