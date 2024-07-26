package itxiang_08;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		//鍵盤錄入學生對象所需要的數據
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.println("請輸入學生姓名");
//		String name=scanner.nextLine();
//		
//		System.out.println("請輸入學生年齡");
//		int age=scanner.nextInt();
//		scanner.nextLine();
//		
//		//創建學生對象,把錄入的數據覆值給學生對象的成員變量
//		Student student=new Student();
//		student.setName(name);
//		student.setAge(age);
//		
//		//往集合中添加對象
//		list.add(student);
		
		//為了提高代碼的覆用性,我們用方法來改進程序
		addStudent(list);
		addStudent(list);
		addStudent(list);
		
		for(int i=0;i<list.size();i++) {
			Student student=list.get(i);
			System.out.println(student.getName()+","+student.getAge());
		}
	}
	/*
	 * 兩個明確:
	 * 返回值類型:void
	 * 參數:ArrayList<Student> list
	 */
	public static void addStudent(ArrayList<Student> list) {
		//鍵盤錄入學生對象所需要的數據
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("請輸入學生姓名");
		String name=scanner.nextLine();
		
		System.out.println("請輸入學生年齡");
		int age=scanner.nextInt();
		scanner.nextLine();
		
		//創建學生對象,把錄入的數據覆值給學生對象的成員變量
		Student student=new Student();
		student.setName(name);
		student.setAge(age);
		
		//往集合中添加對象
		list.add(student);
	}
}
