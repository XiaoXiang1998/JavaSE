package itxiang_06;

public class StringBuilderDemo02 {
	public static void main(String[] args) {
		//創建對象
		StringBuilder sb =new StringBuilder();
		
		//public StringBuilder append(任意類型) :添加數據,並返回對象本身
//		StringBuilder sb2 =	sb.append("hello");
//		
//		System.out.println("sb:"+sb);
//		System.out.println("sb2:"+sb2);
//		System.out.println(sb==sb2);
//		sb.append("Hello");
//		sb.append("world");
//		sb.append("Java");
//		sb.append(100);
//		
		//鏈式編程
		sb.append("Hello").append("world").append("Java").append(100);
		
		System.out.println("sb:"+sb);
		
		//public StringBulider reverse();返回相反的字符序列
		sb.reverse();
		System.out.println("sb:"+sb);

	}
}
