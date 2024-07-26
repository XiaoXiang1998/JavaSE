package itxiang_06;

import java.util.Scanner;

public class StringTest5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("請輸入一個字符串:");
		String line =scanner.nextLine();
			
		//調用一個方法,用一個變量接收結果
		String s=reverse(line);
		
		//輸出結果
		System.out.println("s:"+s);
		
	}
	//定義一個方法,實現字符串反轉
	/*
	 * 兩個明確:
	 * 返回值類型:String 
	 * 參數String s
	 */
	public static String reverse(String s) {
		//在方法中把字符串倒著邊勵,然後把每一個得到的字符拼接成一個字符串並返回
		String ss="";
		
		for(int i=s.length()-1;i>=0;i--) {
			ss+=s.charAt(i);
			
	}
		return ss;
}
}
