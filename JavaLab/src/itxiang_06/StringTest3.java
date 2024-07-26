package itxiang_06;

import java.util.Scanner;

public class StringTest3 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("請輸入一個字符串");
		String nextLine = scanner.nextLine();
		
		
		//要統計三種類型的字符個數,需定義三個統計變量,初始值都為0
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		
		for(int i=0;i<nextLine.length();i++) {
			char ch=nextLine.charAt(i);
			
			//判斷該字符屬於哪種類型,然後對應的類型統計變量+1
			if(ch>='A'&& ch<='Z'){
					bigCount ++;
			}else if(ch>='a' && ch<='z') {
				smallCount++;
			}else if(ch>='0' &&ch<='9') {
				numberCount++;
			}
		}
		
		System.out.println("大寫字母:"+bigCount+"個");
		System.out.println("小寫字母:"+smallCount+"個");
		System.out.println("數字字母:"+numberCount+"個");

	}
}
