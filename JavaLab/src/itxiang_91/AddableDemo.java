package itxiang_91;

public class AddableDemo {
	public static void main(String[] args) {
		useAddable((int x, int y) -> {
			return x + y;
		});
	}

	private static void useAddable(Addable a) {
		int i = a.add(10, 20);
		System.out.println(i);
	}

}
