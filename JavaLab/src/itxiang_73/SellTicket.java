package itxiang_73;

public class SellTicket implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		// 相同的票 出現了多次
//		A:判斷票數大於0,就賣票,並告知是哪個窗口賣的
//		while (true) {
//			// tickets=100
//			// t1 t2 t3
//			// 假設t1線程搶到cpu的執行權
//			if (tickets > 0) {
//				// 通過Sleep()來模擬出票時間
//				try {
//					Thread.sleep(100);
//					// t1線程休息100毫秒
//					// t2搶到了cpu的執行權 t2線程就開始執行,執行到這裡的時候,t2.線程休息100毫秒
//					// t3到了cpu的執行權 t3程就開始執行,執行到這裡的時候,t3線程休息100毫秒
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				// 假設線程按照順序醒過來
//				// t1搶到cpu的執行權,在控制台輸出,窗口1正在出售第100張票
//				System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "張票");
//				// t2搶到cpu的執行權,在控制台輸出,窗口2在出售第100張票
//				// t3搶到cpu的執行權,在控制台輸出,窗口3出售第100張票
//
//				tickets--;
//				// 如果這三個線程還是按照順序來,這裡就執行了三次--的操作,最終票就變成97
//			}
		// 出現了負數的票
		while (true) {
			// tickets=100
			// t1 t2 t3
			// 假設t1線程搶到cpu的執行權
			if (tickets > 0) {
				// 通過Sleep()來模擬出票時間
				try {
					Thread.sleep(100);
					// t1線程休息100毫秒
					// t2搶到了cpu的執行權 t2線程就開始執行,執行到這裡的時候,t2.線程休息100毫秒
					// t3到了cpu的執行權 t3程就開始執行,執行到這裡的時候,t3線程休息100毫秒
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 假設線程按照順序醒過來
				System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "張票");

				tickets--;
			}
		}
	}

}
