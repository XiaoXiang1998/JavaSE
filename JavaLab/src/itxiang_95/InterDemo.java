package itxiang_95;

public class InterDemo {
	public static void main(String[] args) {
		Inter i = new InterImpl();
		i.show();
		i.method();
//		i.test();
		Inter.test();
	}
}
