package com.itxiang;


public class Test01 {

	public static void main(String[] args) {
		//定義一個數組,用靜態初始化完成數組元素的初始化
		int[] arr={68,27,95,88,171,996,51,210};
		
		//定義一個求和變量 初始值是0
		int sum=0;
		
		//邊勵數組,獲取到數組中的每一個元素
		for(int x=0;x<arr.length;x++) {
			//判斷該元素	是否滿足條件,如果滿足條件就累加
			if(arr[x]%10!=7 &&arr[x]/10%10!=7 && arr[x]%2==0) {
				sum+=arr[x];
			}
		}
			System.out.println("元素的和是:"+sum);
	}
		
}
