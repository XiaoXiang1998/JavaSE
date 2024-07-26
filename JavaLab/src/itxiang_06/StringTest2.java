package itxiang_06;

import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("請輸入一個字符串");
		String line = scanner.nextLine();
		
		//邊勵字符串 首先要能獲取到字符串中的每一個字符
		for(int i=0;i<line.length();i++) {
			System.out.println(line.charAt(i));
		}
		
		
		
	}
}
