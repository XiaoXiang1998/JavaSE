package itxiang_29;

public class IntegerDemo2 {
	public static void main(String[] args) {
		//public static Integer valueof(int i):返回表示指定的int值的Integer實例
		Integer i1=Integer.valueOf(100);
		System.out.println(i1);
		//public static Integer valueof(String s):返回一個保存指定值的 Integer對象 String
		Integer i2 =Integer.valueOf("100");
		System.out.println(i2);
	}
}
