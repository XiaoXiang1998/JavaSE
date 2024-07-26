package xiang_113;

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		// 使用類的class屬性來獲取該類的對應的Class對象
		Class<Student> c1 = Student.class;
		System.out.println(c1);

		Class<Student> c2 = Student.class;
		System.out.println(c1 == c2);
		System.out.println("------------");

		// 調用對象的getClass方法(),返回該對象所屬的class對象
		Student s = new Student();
		Class<? extends Student> c3 = s.getClass();
		System.out.println(c1 == c3);
		System.out.println("------------");

		// 使用Class類中的靜態方法forName(String className)
		Class<?> c4 = Class.forName("xiang_113.Student");
		System.out.println(c1 == c4);
	}
}
