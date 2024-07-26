package itxiang_90;

public class FlyableDemo {
	public static void main(String[] args) {
		// 在主方法中調用useFlyable方法
		useFlyable(new Flyable() {

			@Override
			public void fly(String s) {
				System.out.println(s);
				System.out.println("飛機字架由");
			}
		});

		System.out.println("-------");

		// Lambda
		useFlyable((String s) -> {
			System.out.println(s);
			System.out.println("飛機字架由");

		});
	}

	private static void useFlyable(Flyable f) {
		f.fly("風和日麗,晴空萬里");
	}
}
