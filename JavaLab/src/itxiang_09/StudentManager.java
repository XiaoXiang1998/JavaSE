package itxiang_09;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		//創建集合對象,用於存儲學生數據 
		ArrayList<Student> arrayList=new ArrayList<Student>();
		//用輸出語句完成主介面的編寫
		while(true) {
		System.out.println("----------歡迎來到學生系統內容------------");
		System.out.println("1 添加學生");
		System.out.println("2 刪除學生");
		System.out.println("3 修改學生");
		System.out.println("4 查看所有學生");
		System.out.println("5 退出");
		System.out.println("請輸入你的選擇");
		
		//用Scanner實現鍵盤錄入數據
		Scanner scanner=new Scanner(System.in);
		String line =scanner.nextLine();
		
		//用switch語句完成操作的選擇
	switch(line) {
			case "1":
//				System.out.println("添加學生");
				addStudent(arrayList);
				break;
			case "2":
//				System.out.println("刪除學生");
				deleteStudent(arrayList);
				break;	
				case "3":	
//					System.out.println("修改學生");
					updateStudent(arrayList);
					break;
				case "4":
//					System.out.println("查看學生");
					findAllStudent(arrayList);
					break;
				case "5":
					System.out.println("謝謝使用");
//					break;
					System.exit(0); //虛擬機退出
		}
		}
		
	}
	
//	public static void addStudent(ArrayList<Student> array) {
//		//鍵盤錄入學生對象所需要的數據,顯示提示信息,提示要輸入何種信息
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.println("請輸入學生學號:");
//		String sid=	scanner.nextLine();
//
//		System.out.println("請輸入學生姓名:");
//		String name=scanner.nextLine();
//		System.out.println("請輸入學生年齡:");
//		String age=	scanner.nextLine();
//
//		System.out.println("請輸入學生居住地:");
//		String address=scanner.nextLine();
//		//創建學生對象,把鍵盤錄入的數據覆值給學生對象的成員變量
//		Student student= new Student();
//		student.setSid(sid);
//		student.setName(name);
//		student.setAge(age);
//		student.setAddress(address);
//		//將學生對象添加到集合中
//		array.add(student);
//		//給出添加成功提示	
//		System.out.println("添加學生成功");
//	}
	
	public static void addStudent(ArrayList<Student> array) {
		//鍵盤錄入學生對象所需要的數據,顯示提示信息,提示要輸入何種信息
		Scanner scanner=new Scanner(System.in);
		
		//為了讓sid在while循環外面被訪問到,我們就把他定義在了循環外
		String sid;
		
		//為了讓程序回到這裡 我們使用循環實現
		while(true) {
		System.out.println("請輸入學生學號:");
		 sid=	scanner.nextLine();
		
		boolean flag=  isUsed(array, sid);
		if(flag) {
			System.out.println("你輸入的學號已經被使用,請重新輸入");
			}else {
				break;
			}
		}
		System.out.println("請輸入學生姓名:");
		String name=scanner.nextLine();
		System.out.println("請輸入學生年齡:");
		String age=	scanner.nextLine();

		System.out.println("請輸入學生居住地:");
		String address=scanner.nextLine();
		//創建學生對象,把鍵盤錄入的數據覆值給學生對象的成員變量
		Student student= new Student();
		student.setSid(sid);
		student.setName(name);
		student.setAge(age);
		student.setAddress(address);
		//將學生對象添加到集合中
		array.add(student);
		//給出添加成功提示	
		System.out.println("添加學生成功");
	}
	
//	public static void findAllStudent(ArrayList<Student> array) {
//		//顯示表頭信息
//		//\t 其實就是tab鍵的意思
//		System.out.println("學號\t姓名\t年齡\t居住地");
//		//將集合中數據取出按照對應格式顯示學生信息,年齡顯示補充歲
//		for(int i=0;i<array.size();i++) {
//			Student student=array.get(i);
//			System.out.println(student.getSid()+"\t"+student.getName()+"\t"+student.getAge()+"歲\t"+student.getAddress());
//		}
//	}
	public static boolean isUsed(ArrayList<Student> array,String sid) {
		//如果與集合中某一個學生相同,返回true;如果都不相同 返回false
		boolean flag=false;
		
		for(int i=0;i<array.size();i++) {
			Student student=array.get(i);
			if(student.getSid().equals(sid)) {
				flag=true;
				break;
			}
		}
		
		return flag;
	}
	
	public static void findAllStudent(ArrayList<Student> array) {
		//判斷集合中是否有數據,如果沒有顯示提示信息
		if(array.size()==0) {
			System.out.println("無信息,請先添加信息再查詢");
			//為了讓程序不在往下執行,給出return
			return;
		}
		
		//顯示表頭信息
		//\t 其實就是tab鍵的意思
		System.out.println("學號\t姓名\t年齡\t居住地");
		//將集合中數據取出按照對應格式顯示學生信息,年齡顯示補充歲
		for(int i=0;i<array.size();i++) {
			Student student=array.get(i);
			System.out.println(student.getSid()+"\t"+student.getName()+"\t"+student.getAge()+"歲\t"+student.getAddress());
		}
	}
	
//	public static void deleteStudent(ArrayList<Student> array) {
//
//		//錄入要刪除的學生信息,顯示提示信息
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.println("請輸入你要刪除的學生學號:");
//		String sid= scanner.nextLine();
//		
//		//編利集合將對應的學生對象從集合中刪除
//		for(int i=0;i<array.size();i++) {
//			Student student=array.get(i);
//			if(student.getSid().equals(sid)) {
//				array.remove(i);
//			}
//		}
//		//給出刪除成功提示
//		System.out.println("刪除學生成功");
//	}
	public static void deleteStudent(ArrayList<Student> array) {

		//錄入要刪除的學生信息,顯示提示信息
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("請輸入你要刪除的學生學號:");
		String sid= scanner.nextLine();
		
		//再刪除/修改學生操作前,對學號是否存在進行判斷
		//如果不存在,顯示提示信息
		//如果存在,執行刪除/修改操作
		int index=-1;
		for(int i=0;i<array.size();i++) {
			
			Student student=array.get(i);
			if(student.getSid().equals(sid)) {
//				int index=i;
				index=i;
				break;
			}
		}
		if(index ==-1) {
			System.out.println("該信息不存在,請重新輸入");
		}else {
			array.remove(index);
			//給出刪除成功提示
			System.out.println("刪除學生成功");
		}
	}
	
//	public static void updateStudent(ArrayList<Student> array) {
//		//錄入要修改的學生學號,顯示提示信息
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.println("請輸入你要修改學生的學號:");
//		String sid =scanner.nextLine();
//		 
//		//鍵盤錄入要修改學生的信息
//		System.out.println("請輸入學生新姓名:");
//		String name =scanner.nextLine();
//		System.out.println("請輸入學生新年齡:");
//		String age =scanner.nextLine();
//		System.out.println("請輸入學生新居住地:");
//		String address =scanner.nextLine();
//		
//		//創建學生對象
//		Student student=new Student();
//		student.setSid(sid);
//		student.setName(name);
//		student.setAge(age);
//		student.setAddress(address);
//		
//		int index=-1;
//		//編立集合修改對應的學生信息
//		for(int i=0;i<array.size();i++) {
//			Student student2=array.get(i);
//			if(student2.getSid().equals(sid)) {
//				index=i;
////				array.set(i,student);
//				break;
//			}
//			
//		}
//		if(index ==-1) {
//			System.out.println("該信息不存在,請重新輸入");
//		}else {
//			array.set(index,student);
//			//給出刪除成功提示
//			System.out.println("修改學生成功");
//		}
//	
//	}
	public static void updateStudent(ArrayList<Student> array) {
		Scanner scanner = new Scanner(System.in);

	    System.out.println("請輸入你要修改學生的學號:");
	    String sid = scanner.nextLine();
	  

	    for (int i = 0; i < array.size(); i++) {
	        Student student = array.get(i);
	        if (student.getSid().equals(sid)) {
	            System.out.println("請輸入學生新姓名:");
	            String name = scanner.nextLine();
	            System.out.println("請輸入學生新年齡:");
	            String age = scanner.nextLine();
	            System.out.println("請輸入學生新居住地:");
	            String address = scanner.nextLine();

	            // 创建学生对象
	            Student updatedStudent = new Student();
	            updatedStudent.setSid(sid);
	            updatedStudent.setName(name);
	            updatedStudent.setAge(age);
	            updatedStudent.setAddress(address);

	            // 修改学生信息
	            array.set(i, updatedStudent);
	            System.out.println("修改學生成功");
	            return; 
	        }
	    }

	    	System.out.println("未找到对应的学生信息。");
	}
}


