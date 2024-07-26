package itxiang_07;

import java.util.ArrayList;

public class ArrayListTest02 {

	public static void main(String[] args) {
		//創建集合對象
		ArrayList<Student> list=new ArrayList<Student>();
		
		//創建學生對象
		Student s1=new Student("林青霞",30);
		Student s2=new Student("風清揚",33);
		Student s3=new Student("張曼玉",18);
		
		
		//添加學生對象到集合中
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(int i=0;i<list.size();i++) {
			Student s =list.get(i);
			System.out.println(s.getName()+","+s.getAge());
		}

	}

}
