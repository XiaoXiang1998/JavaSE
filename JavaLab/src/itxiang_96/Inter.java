package itxiang_96;

public interface Inter {
	default void show1() {
		System.out.println("show1開始執行");
//		show();
		method();
		System.out.println("show1結束執行");
	}

	default void show2() {
		System.out.println("show2開始執行");
//		show();
		method();
		System.out.println("show2結束執行");
	}

	private void show() {
		System.out.println("初級工程師");
		System.out.println("中級工程師");
		System.out.println("高級工程師");
	}

	static void method1() {
		System.out.println("method1開始執行");
		method();
		System.out.println("method1結束執行");

	}

	static void method2() {
		System.out.println("method2開始執行");
		method();
		System.out.println("method2結束執行");

	}

	private static void method() {
		System.out.println("初級工程師");
		System.out.println("中級工程師");
		System.out.println("高級工程師");
	}
}
