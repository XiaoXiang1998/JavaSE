package xiang_118;

public class Test02 {

	// static Object lockA = new Object();
	// static Object lockB = new Object();
	private static final Object lockA = new Object();
	private static final Object lockB = new Object();

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println(Thread.currentThread() + "嘗試獲取鎖A");

				synchronized (lockA) {

					System.out.println(Thread.currentThread() + "獲取為鎖A");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread() + "嘗試獲取鎖B");
					synchronized (lockB) {
						System.out.println(Thread.currentThread() + "獲取到了鎖B");
					}
				}

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println(Thread.currentThread() + "嘗試獲取鎖B");

				synchronized (lockB) {
					System.out.println(Thread.currentThread() + "獲取為鎖B");

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread() + "嘗試獲取鎖A");
					synchronized (lockA) {
						System.out.println(Thread.currentThread() + "獲取到了鎖A");
					}
				}

			}
		}).start();
	}
}
