package itxiang_06;

import java.util.Scanner;

public class StringBuilderTest02 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("請輸入一個字符串");
		
		String line = scanner.nextLine();
		
		
		 String string= myReverse(line);
		 System.out.println("s:"+string);
	}
	
	//定義一個方法,實現字符串反轉,返回值類型String ,參數String s
	/*
	 * 兩個明確:
	 * 返回值類型String 
	 * 參數 String s
	 */
	public static String myReverse(String s) {
		//在方法中 用StringBuilder實現字符串的反轉,並把結果轉成String返回
		//String --StringBuilder ---reverse() --String
//		StringBuilder sb =new StringBuilder(s);
//		sb.reverse();
//		String ss=sb.toString();
//		return ss;
		
		return new StringBuilder(s).reverse().toString();
	}
}
