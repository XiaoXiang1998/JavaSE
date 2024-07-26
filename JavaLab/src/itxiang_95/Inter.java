package itxiang_95;

public interface Inter {
	void show();

	default void method() {
		System.out.println("Inter中 的默認方法執行了");
	}

	public static void test() {
		System.out.println("Inter中 的靜態方法執行了");

	}

}
