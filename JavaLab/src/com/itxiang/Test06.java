package com.itxiang;

public class Test06 {

	public static void main(String[] args) {
		//定義一個數組,用靜態初始化完成數組元素的初始化
		int[] arr= {19,28,37,46,50};
		
		
		//調用反轉的方法
		reverse(arr);
		//邊勵數組
		printArray(arr);
		
		
	}
	/*
	 * 兩個明確:
	 * 返回值類型:void
	 * 參數:int[] arr
	 * 
	 * 兩個明確:
	 * 返回值類型:void
	 * 參數:int[] arr
	 */
	
	public static void reverse(int[] arr) {
		//循環邊勵數組,這一次初始化語句定義兩個索引變量,判斷條件是開始索引小於等於結束索引
				for(int start=0,end=arr.length-1;start<=end;start++,end--) {
					//變量交換
					int temp=arr[start];
					arr[start]=arr[end];
					arr[end]=temp;
				}
	}
	
	
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if(x== arr.length-1) {
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+",");
			}
		}
		System.out.println("]");
	}
}
