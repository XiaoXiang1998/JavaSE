package itxiang_52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo02 {
	public static void main(String[] args) {
		// 創建ArrayList集合對象
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student("lingqingxia", 30));
		list.add(new Student("zhangmanyu", 35));
		list.add(new Student("wangzuxian", 33));
		list.add(new Student("liuyan", 33));

		// 使用Collections對ArrayList進行排序
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// 按照年齡從小到大排序,年齡相同時,按照姓名的字母順序排序
				int num = o1.getAge() - o2.getAge();
				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				return num2;
			}

		});
		// 邊勵集合
		for (Student student : list) {
			System.out.println(student.getName() + "," + student.getAge());
		}
	}
}
