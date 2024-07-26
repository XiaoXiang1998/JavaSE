package itxiang_06;

public class StringBuilderDemo01 {
	 public static void main(String[] args) {
		//public StringBuilder():創建一個空白可變字符串對象,不含有任何內容
		 StringBuilder sb=new StringBuilder();
		 System.out.println("sb:"+sb);
		 System.out.println(sb.length());
		 
		//public StringBuilder(String str):根據字符串的內容,來創建可變字符串對象
		 StringBuilder sb2=new StringBuilder("hello");
		 System.out.println("sb2:"+sb2);
		 System.out.println(sb2.length());
		 
		 
	}
}
