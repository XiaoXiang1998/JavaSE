package itxiang_06;

public class StringDemo {
	public static void main(String[] args) {
		//創建一個空白字符串對象,不含有任何內容
		String s1=new String();
		System.out.println(s1);
		
		//public String (char[] chs),根據字符數組的內容,來創建字符串對象
		char[] chs= {'a','b','c'};
		String s2=new String(chs);
		System.out.println("s2:"+s2);
		
		//public String(byte[] bys):根據字節數組的內容,來創建字符串對象
		byte[] bys= {97,98,99};
		String s3=new String(bys);	
		System.out.println("s3:"+s3);
		
		//String s="abc";直接腹值的方式創建字符串對象,內容就是abc
		String s4="abc";
		System.out.println("s4:"+s4);
	}
}
