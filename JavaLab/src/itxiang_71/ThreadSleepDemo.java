package itxiang_71;

//static void sleep(long millis):使當前正在執行的線程停留(暫停執行)指定的毫秒數
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();

		ts1.setName("曹操");
		ts2.setName("劉備");
		ts3.setName("孫權");

		ts1.start();
		ts2.start();
		ts3.start();

	}
}
