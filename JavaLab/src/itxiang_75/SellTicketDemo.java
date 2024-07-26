package itxiang_75;

public class SellTicketDemo {
	public static void main(String[] args) {
		// 創建sellTicket類的對象
		SellTicket st = new SellTicket();

		// 創建三個Thread類的對象,把sellTicket對象作為構造方法的參數,並給出對應的窗口名稱
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");

		// 啟動線程
		t1.start();
		t2.start();
		t3.start();

	}
}
