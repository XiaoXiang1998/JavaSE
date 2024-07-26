package itxiang_06;

public class StringBuilderDemo03 {
	public static void main(String[] args) {
		//StringBuilder 轉換為String 
//		StringBuilder sb =new StringBuilder();
//		sb.append("Hello");
//		
//		String s=sb.toString();
//		System.out.println(s);
		
		//String 轉換為StringBuilder
		String s ="Hello";
		
		StringBuilder sb =new StringBuilder(s);
		System.out.println(sb);
		
		
	}
}
