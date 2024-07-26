package itxiang_41;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {

		TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
//		int num=	(s2.getChinese()+s2.getMath())-(s1.getChinese()+s1.getMath());
				// 主要條件
				int num = s2.getSum() - s1.getSum();
				// 次要條件
				int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
				return num3;
			}

		});

		// 創建學生對象
		treeSet.add(new Student("林青霞", 98, 100));
		treeSet.add(new Student("張曼玉", 95, 95));
		treeSet.add(new Student("王祖賢", 100, 93));
		treeSet.add(new Student("柳炎", 100, 97));
		treeSet.add(new Student("風清揚", 98, 98));

		treeSet.add(new Student("左冷禪", 97, 99));
		treeSet.add(new Student("趙雲", 97, 99));

		for (Student student : treeSet) {
			System.out.println(
					student.getName() + "," + student.getChinese() + "," + student.getMath() + "," + student.getSum());
		}

	}

}
