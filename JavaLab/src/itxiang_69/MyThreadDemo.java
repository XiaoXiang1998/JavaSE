package itxiang_69;

public class MyThreadDemo {
	public static void main(String[] args) {
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();

		// void setName(String name):將此線程的名稱更改為等於參數none
//		t1.setName("高鐵");
//		t2.setName("飛機");

		MyThread t1 = new MyThread("高鐵");
		MyThread t2 = new MyThread("飛機");

		t1.start();
		t2.start();

		// static Thread currentThread()返回對當前正在執行的線程對象的引用
		System.out.println(Thread.currentThread().getName());
	}
}
