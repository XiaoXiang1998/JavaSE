package com.itxiang;

public class ForTest {
	public static void main(String[] args) {
		int count =0;
		//輸出所有的水仙花數必然要使用到循環,邊勵所有的三位數,三位數從100開始,到999結束
		for(int i=100;i<1000;i++) {
			//在計算之前獲取三位數中每個位上的值
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			
			//判斷條件是將三位數中的每個數值取出來,計算立方和後與原始數字比較是否相等
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
				//輸出滿足條件的數字就是水仙花數
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}
}
