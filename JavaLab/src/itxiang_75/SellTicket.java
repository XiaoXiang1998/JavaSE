package itxiang_75;

public class SellTicket implements Runnable {
	private static int tickets = 100;
	private Object obj = new Object();
	private int x = 0;

	@Override
	public void run() {

		while (true) {
			if (x % 2 == 0) {
//				synchronized (obj) {

//		同步方法的鎖	synchronized (this) {
				/* 靜態同步方法的鎖 */ synchronized (SellTicket.class) {
					if (tickets > 0) {

						try {
							Thread.sleep(100);

						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "張票");
						tickets--;

					}
				}
			} else {
//				synchronized (obj) {
//
//					if (tickets > 0) {
//
//						try {
//							Thread.sleep(100);
//
//						} catch (InterruptedException e) {
//							e.printStackTrace();
//						}
//
//						System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "張票");
//						tickets--;
//
//					}
//				}

				sellTicket();
			}
			x++;
		}

	}

//	private void sellTicket() {
//		synchronized (obj) {
//
//			if (tickets > 0) {
//
//				try {
//					Thread.sleep(100);
//
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//
//				System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "張票");
//				tickets--;
//
//			}
//		}
//
//	}	
//	private synchronized void sellTicket() {
//
//		if (tickets > 0) {
//
//			try {
//				Thread.sleep(100);
//
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//
//			System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "張票");
//			tickets--;
//
//		}
//	}
	private static synchronized void sellTicket() {

		if (tickets > 0) {

			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "張票");
			tickets--;

		}
	}

}
