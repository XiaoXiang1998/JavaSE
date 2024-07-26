package com.itxiang;



public class Test04 {

	public static void main(String[] args) {
		//定義兩個數組,分別使用靜態初始化完成數組元素的初始化
		int[] arr= {11,22,33,44,55};
		int[] arr2={11,22,33,44,55};
		int[] arr3={11,22,33,44,66};
		//調用方法,用變量接收
		boolean flag=compare(arr, arr3);
		System.out.println(flag);
		
}	
		//定義一個方法,用於比較兩個數組的內容是否相同
		/*
		 * 兩個明確:
		 * 返回值類型:boolean
		 * 參數:int [] arr,int[] arr2
		 */
	
	public static boolean compare(int[] arr,int[] arr2) {
		//請先比較數組長度,如果不相同,數組內容肯定不相同 返回false
		if(arr.length != arr2.length) {
			return false;
		}
		
		//其次邊勵,比較兩個數組中的每一個元素,只要有元素不相同,返回false
		for(int x=0;x<arr.length;x++) {
			if(arr[x] !=arr2[x]) {
				return false;
			}
		}
		return true;
	}
}
