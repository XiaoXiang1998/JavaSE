package itxiang_70;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		tp1.setName("高鐵");
		tp2.setName("飛機");
		tp3.setName("汽車");

		// public final int getPriority():返回此線程的優先級
//		System.out.println(tp1.getPriority()); // 5
//		System.out.println(tp2.getPriority()); // 5
//		System.out.println(tp3.getPriority()); // 5

		// public final void setPriority(int newPriority):更改此線程的優先級
		// tp1.setPriority(10000);
		// 設置正確的優先級
//		tp1.setPriority(5);
//		tp2.setPriority(10);
//		tp3.setPriority(1);
//		tp1.start();
//		tp2.start();
//		tp3.start();

	}
}
