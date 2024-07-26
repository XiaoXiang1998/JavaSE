package itxiang_24;
//匿名內部類
public class Outer {
	public void method() {
//		new Inter() {
//			
//			@Override
//			public void show() {
//				System.out.println("匿名內部類");
//				
//			}
//		};
//		new Inter() {
//			
//			@Override
//			public void show() {
//				System.out.println("匿名內部類");
//				
//			}
//		}.show();
//		
//new Inter() {
//			
//			@Override
//			public void show() {
//				System.out.println("匿名內部類");
//				
//			}
//		}.show();
		Inter i= new Inter() {
			
			@Override
			public void show() {
				System.out.println("匿名內部類");
				
			}
		};
		i.show();
		i.show();

	}
}
