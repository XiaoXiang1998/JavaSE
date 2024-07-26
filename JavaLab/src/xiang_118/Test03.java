package xiang_118;

public class Test03 {
	public int classSize = 300; // 類別變數

	public static void main(String[] args) {
		Test03 test03 = new Test03();
		System.out.println("classSize(initial): " + test03.classSize);

		test03.classSize = 20; // 修改類別變數的值

		System.out.println("classSize (obj1): " + test03.classSize);

		test03.classSize = 40; // 修改類別變數的值

		System.out.println("classSize (obj2): " + test03.classSize);
	}
}
