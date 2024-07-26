package itxiang_71;

/*
 * void setDaemon(boolean on):將此線程記為守護線程,當前運行的線程都是守護線程時,Java虛擬機將退出
 */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();

		td1.setName("關羽");
		td2.setName("張飛");

		// 設置主線程為劉備
		Thread.currentThread().setName("劉備");

		// 設置守護線程
		td1.setDaemon(true);
		td2.setDaemon(true);

		td1.start();
		td2.start();

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
