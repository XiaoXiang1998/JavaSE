package itxiang_89;

public class EatableDemo {
	public static void main(String[] args) {
		// 在主方法中調用useEatable方法
		Eatable e = new EatableImpl();
		useEatable(e);

		// 匿名內部類
		useEatable(new Eatable() {

			@Override
			public void eat() {
				System.out.println("一天一蘋果,醫生遠離我");

			}
		});

		// Lambda表達示
		useEatable(() -> {
			System.out.println("一天一蘋果,醫生遠離我");
		});
	}

	private static void useEatable(Eatable e) {
		e.eat();
	}
}
