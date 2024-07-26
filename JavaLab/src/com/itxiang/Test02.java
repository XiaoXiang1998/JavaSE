package com.itxiang;

public class Test02 {

	public static void main(String[] args) {
		//1.數據在1-100之間,用for循環實現數據的獲取
		for(int x=1;x<=100;x++) {
			//根據規則 ,用if語句實現數據的判斷,要嘛個位是7 ,要麼十位是7,要嘛能夠被7整處
			if(x%10==7 ||x/10%10==7 ||x%7==0) {
				//在控制台輸出我們的數據
				System.out.println(x);
			}
		}
	}

}
