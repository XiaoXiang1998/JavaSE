package itxiang_72;

public class MyRunnableDemo {
	public static void main(String[] args) {
		// 創建MyRunnable類的對象

		MyRunnable my = new MyRunnable();

		// 創建Thread類的對象,把MyRunnable對象作為構造方法的參數
		// Thread(Runnable target)
//		Thread t1 = new Thread(my);
//		Thread t2 = new Thread(my);
		// Thread(Runnable target,String name)
		Thread t1 = new Thread(my, "高鐵");
		Thread t2 = new Thread(my, "飛機");
		// 啟動線程
		t1.start();
		t2.start();
	}
}
