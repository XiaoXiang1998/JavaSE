package itxiang_35;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
	public static void main(String[] args) {
		//創建collection集合對象
		Collection<Student> collection=new ArrayList<Student>();
		
		//創建學生對象
		Student s1=new Student("林青霞",	30);
		Student s2=new Student("張曼玉",35);
		Student s3=new Student("王祖閒",	33);

		//把學生添加到集合
		collection.add(s1);
		collection.add(s2);
		collection.add(s3);
		
		Iterator<Student> iterator = collection.iterator();
		while(iterator.hasNext()) {
			Student student=iterator.next();
			System.out.println(student.getName()+","+student.getAge());
		}
	}
}
