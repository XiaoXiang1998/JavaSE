package itxiang_36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo03 {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		
		//創建學生對象 把學生添加到集合
		list.add(new Student("林青霞",30));
		list.add(new Student("張曼玉",35));
		list.add(new Student("王祖賢",33));
		
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			Student student=iterator.next();
			System.out.println(student.getName()+","+student.getAge());
		}
		System.out.println("--------------");
		for(int i=0;i<list.size();i++) {
			Student student=list.get(i);
			System.out.println(student.getName()+","+student.getAge());
		}
		System.out.println("----------");
		for (Student student : list) {
			System.out.println(student.getName()+","+student.getAge());
		}
	}

}
