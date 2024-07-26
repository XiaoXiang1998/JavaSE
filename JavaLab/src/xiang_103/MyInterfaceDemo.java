package xiang_103;

public class MyInterfaceDemo {
	public static void main(String[] args) {
		MyInterface my = () -> System.out.println("函數式接口");
		my.show();
	}
}
