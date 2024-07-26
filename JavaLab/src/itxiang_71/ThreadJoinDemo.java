package itxiang_71;

//join ()等待這個線程死亡
public class ThreadJoinDemo {
	public static void main(String[] args) {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();

		tj1.setName("康熙");
		tj2.setName("四阿哥");
		tj3.setName("八阿哥");

		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();

	}

}
