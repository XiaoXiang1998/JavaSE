package itxiang_99;

public class ConverterDemo {
	public static void main(String[] args) {
//		useConverter((String s) -> {
//			return Integer.parseInt(s);
//		});

		useConverter(s -> Integer.parseInt(s));

		// 引用類方法
		useConverter(Integer::parseInt);

		// Lambda表達示被類方法替代的時候,他的形式參數全部傳遞給靜態方法作為參數
	}

	private static void useConverter(Converter c) {

		int number = c.convert("666");
		System.out.println(number);
	}
}
