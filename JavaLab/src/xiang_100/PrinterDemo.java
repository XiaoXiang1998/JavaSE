package xiang_100;

public class PrinterDemo {
	public static void main(String[] args) {

//		usePrint((String s) -> {
//			String upperCase = s.toUpperCase();
//			System.out.println(upperCase);
//			System.out.println(s.toUpperCase());
//		});

//		usePrint(s -> System.out.println(s.toUpperCase()));

		// 引用對象的實力方法
		PrintString ps = new PrintString();
		usePrint(ps::printUpper);

		// Lambda表達示被對象的實例方法替代的時候,它的形式參數全部傳遞給該方法作為參數

	}

	private static void usePrint(Printer p) {
		p.PrintUpperCase("HelloWorld");
	}
}
