package itxiang_77;

public class BoxDemo {
	public static void main(String[] args) {
		// 創建奶香對象,這是共享數據區域
		Box b = new Box();

		// 創建生產者對象,把奶香對象作為構造方法參數傳遞,因為在這個類中要調用存儲牛奶的操作
		Producer p = new Producer(b);

		// 創建消費者對象,把奶香對象作為構造方法參數傳遞,因為在這個類中要調用存儲牛奶的操作
		Customer c = new Customer(b);

		// 創建2個線成對象,分別把生產者對象和消費者對象作為構造方法參數傳遞
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);

		// 啟動線成
		t1.start();
		t2.start();
	}
}
