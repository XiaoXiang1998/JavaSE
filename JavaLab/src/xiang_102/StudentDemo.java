package xiang_102;

public class StudentDemo {
	public static void main(String[] args) {
//		useStudentBuilder((String name, int age) -> {
//			Student s=new Student(name,age);
//			return s;
//			return new Student(name, age);
//		});
		useStudentBuilder((name, age) -> new Student(name, age));

		// 引用構造器
		useStudentBuilder(Student::new);

		// Lambda表達示被構造器替代的時候,他的形式參數全部傳遞給構造器作為參數
	}

	private static void useStudentBuilder(StudentBuilder sb) {
		Student s = sb.bulid("林青霞", 30);
		System.out.println(s.getName() + "," + s.getAge());
	}
}