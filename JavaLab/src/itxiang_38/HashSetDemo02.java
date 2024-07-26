package itxiang_38;

import java.util.HashSet;

public class HashSetDemo02 {
	public static void main(String[] args) {
		//創建Hashset對象
		HashSet<Student> hs=new HashSet<Student>();
		
		hs.add(new Student("林青霞", 30));
		hs.add(new Student("張曼玉", 35));
		hs.add(new Student("王祖賢", 33));
		hs.add(new Student("林青霞", 30));

		for (Student student : hs) {
			System.out.println(student.getName()+","+student.getAge());
		}
	}
}
