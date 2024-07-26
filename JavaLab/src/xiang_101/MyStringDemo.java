package xiang_101;

public class MyStringDemo {
	public static void main(String[] args) {
//		useMyString((String s, int x, int y) -> {
//			return s.substring(x, y);
//		});

		useMyString((s, x, y) -> s.substring(x, y));

		// 引用類中的實例方法
		useMyString(String::substring);

		// lambda表達示被類的實例方法替代的時候
		// 第一個參數作為調用者
		// 後面的參數全部傳遞給該方法作為參數
	}

	private static void useMyString(MyString my) {
		String s = my.mySubString("HelloWolrd", 2, 5);
		System.out.println(s);
	}
}
