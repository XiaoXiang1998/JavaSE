package itxiang_40;

import java.util.Comparator;
import java.util.TreeSet;

import itxiang_39.Student;

public class TreeSetDemo {

	public static void main(String[] args) {
		// 創建集合對象
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// this.age-s.age
				// o1,o2
				int num = o1.getAge() - o2.getAge();
				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				return num2;
			}

		});

		Student s1 = new Student("xishi", 29);
		Student s2 = new Student("wangzhaojun", 28);
		Student s3 = new Student("diaochan", 30);
		Student s4 = new Student("yangyuhuan", 33);

		Student s5 = new Student("lingqingxia", 33);
		Student s6 = new Student("lingqingxia", 33);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);

		// 邊勵集合
		for (Student s : ts) {
			System.out.println(s.getName() + "," + s.getAge());
		}
	}

}
