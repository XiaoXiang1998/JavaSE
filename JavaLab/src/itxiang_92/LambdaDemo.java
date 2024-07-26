package itxiang_92;

public class LambdaDemo {
	public static void main(String[] args) {
//		useAddable((int x, int y) -> {
//			return x + y;
//		});
		// 參數的類型 可以省略
		useAddable((x, y) -> {
			return x + y;
		});

		// 但是有多個參數的情況下 ,不能只省略一個
//		useFlyable((String s) -> {
//			System.out.println(s);
//		});

//		useFlyable((s) -> {
//			System.out.println(s);
//		});
		// 如果參數有僅有一個,小括號也可以省略
//		useFlyable(s -> {
//			System.out.println(s);
//		});

		// 如果代碼快的語句只有一條 可以省略大括號跟分號
		useFlyable(s -> System.out.println(s));

		// 如果代碼快的語句只有一條 可以省略大括號跟分號 如果有return ,return 也要省略掉
		useAddable((x, y) -> x + y);
	}

	private static void useFlyable(Flyable f) {
		f.fly("幹你娘機掰程式碼");
	}

	private static void useAddable(Addable a) {
		int sum = a.add(10, 20);
		System.out.println(sum);
	}
}
