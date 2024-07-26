package itxiang_37;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		//創建集合對象
		LinkedList<Student> linkedList=new LinkedList<Student>();
		
		linkedList.add(new Student("虎杖",30));
		linkedList.add(new Student("五條",33));
		linkedList.add(new Student("伏黑",35));
		
		Iterator<Student> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			Student student=iterator.next();
			System.out.println(student.getName()+","+student.getAge());
			
		}
		System.out.println("---------------");
		for(int i=0;i<linkedList.size();i++) {
			Student student=linkedList.get(i);
			System.out.println(student.getName()+","+student.getAge());
		}
		System.out.println("---------------");
		for (Student student : linkedList) {
			System.out.println(student.getName()+","+student.getAge());
		}
	}
}
