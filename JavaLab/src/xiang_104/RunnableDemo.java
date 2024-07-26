package xiang_104;

public class RunnableDemo {
	public static void main(String[] args) {
		// 匿名內部類
		startThread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "線程啟動了");

			}
		});

		startThread(() -> System.out.println(Thread.currentThread().getName() + "線程啟動了"));
	}

	private static void startThread(Runnable r) {
//		Thread t = new Thread(r);
//		t.start();
		new Thread(r).start();
	}
}
