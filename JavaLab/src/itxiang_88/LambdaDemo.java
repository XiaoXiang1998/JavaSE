package itxiang_88;

//需求:啟動一個線程,在控制台輸出一句話:多線程程序啟動了
public class LambdaDemo {
	public static void main(String[] args) {
		// 實現類的方式需求
//		MyRunnable my = new MyRunnable();
//		Thread t = new Thread(my);
//		t.start();

		// 匿名內部類的方式改進
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("多線程程序啟動了");
//
//			}
//		}).start();

		// Lambda表達示
		new Thread(() -> {
			System.out.println("多線程程序啟動了");
		}).start();

	}
}
