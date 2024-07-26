package itxiang_97;

public class PrintableDemo {
	public static void main(String[] args) {

		usePrintable(s -> System.out.println(s));

//		System.out.println("愛生活 幹你娘");

		// 方法引用符: ::
		usePrintable(System.out::println);

		// 可推倒就是可省略的
	}

	private static void usePrintable(Printable p) {
		p.PrintString("愛生活 幹你娘程式碼");
	}
}
