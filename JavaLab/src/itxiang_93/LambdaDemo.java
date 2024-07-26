package itxiang_93;

public class LambdaDemo {
	public static void main(String[] args) {
		// 使用匿名內部類
//		useInter(new Inter() {
//
//			@Override
//			public void show() {
//				System.out.println("街口");
//			}
//		});
//
//		useAnimal(new Animal() {
//
//			@Override
//			public void method() {
//				System.out.println("抽象類");
//			}
//		});
//
//		useStudent(new Student() {
//			@Override
//			public void study() {
//				System.out.println("具體類");
//			}
//		});

		// Lambda
//		useInter(() -> System.out.println("接口"));
//		useInter(new Inter() {
//
//			@Override
//			public void show2() {
//				System.out.println("show2");
//			}
//
//			@Override
//			public void show() {
//				System.out.println("fuck");
//			}
//		});
	}

	private static void useStudent(Student s) {
		s.study();
	}

	private static void useAnimal(Animal a) {
		a.method();
	}

	private static void useInter(Inter i) {
		i.show();
	}
}
