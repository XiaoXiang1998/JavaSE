package itxiang_11;


public class Demo {
	public static void main(String[] args) {
		//創建老師類對象,進行測試
		Teacher t1=new Teacher();
		t1.setName("林青霞");
		t1.setAge(30);
		System.out.println(t1.getName()+","+t1.getAge());
		t1.teach();
		
		Teacher t2=new Teacher("風清揚",33);
		System.out.println(t2.getName()+","+t2.getAge());
		t2.teach();
	}
	
}
