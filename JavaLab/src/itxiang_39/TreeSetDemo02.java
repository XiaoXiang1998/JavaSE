package itxiang_39;

import java.util.TreeSet;

public class TreeSetDemo02 {

	public static void main(String[] args) {
		// 創建集合對象
		TreeSet<Student> treeSet = new TreeSet<Student>();

		// 添加學生對象到集合
//		treeSet.add(new Student("xishi", 29));
//		treeSet.add(new Student("wangzhaojun", 28));
//		treeSet.add(new Student("diaochan", 30));
//		treeSet.add(new Student("yangyuhuan", 33));
		Student s1 = new Student("xishi", 29);
		Student s2 = new Student("wangzhaojun", 28);
		Student s3 = new Student("diaochan", 30);
		Student s4 = new Student("yangyuhuan", 33);

		Student s5 = new Student("lingqingxia", 33);
		Student s6 = new Student("lingqingxia", 33);

		treeSet.add(s1);
		treeSet.add(s2);
		treeSet.add(s3);
		treeSet.add(s4);
		treeSet.add(s5);
		treeSet.add(s6);

		// 邊勵集合
		for (Student s : treeSet) {
			System.out.println(s.getName() + "," + s.getAge());
		}
	}

}
