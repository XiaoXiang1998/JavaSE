package itxiang_06;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		String username="itxiang";
		String password="123456";
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
		System.out.println("請輸入用戶名:");
		String name=scanner.nextLine();
		
		System.out.println("請輸入密碼:");
		String pwd=scanner.nextLine();
		
		if(name.equals(username) &&pwd.equals(password)) {
			System.out.println("登錄成功");
			break;
		}else {
			if(2-i ==0) {
				System.out.println("你的帳戶被鎖定,請與管理員聯繫");
			}else {
				System.out.println("登錄失敗,你還有"+(2-i)+"次機會");
			}
		}
		}
}
}
