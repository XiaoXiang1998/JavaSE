package itxiang_98;

public class PrintableDemo {
	public static void main(String[] args) {
		// lambda
		usePrintable(i -> System.out.println(i));

		// 方法引用
		usePrintable(System.out::println);
	}

	private static void usePrintable(Printable p) {
		p.printInt(10);
	}
}
