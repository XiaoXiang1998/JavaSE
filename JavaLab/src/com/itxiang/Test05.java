package com.itxiang;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//定義一個數組,用靜態初始化完成數組元素的初始化
		int[] arr= {19,28,37,46,50};
		
		//鍵盤錄入要查找的數據,用一個變量接收
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入要查找的數據:");
		int number=scanner.nextInt();
		
//		//定義一個索引變量,初始值為-1
//		int index=-1;
//		
//		//邊勵數組,獲取到數組中的每一個元素
//		for(int x=0;x<arr.length;x++) {
//			if(arr[x] ==number) {
//				index=x;
//				break;
//			}
//		}
		//調用方法
		int index=getIndex(arr, number);
		//輸出索引變量
		System.out.println("index:"+index);
	}
	//查找指定的數據在數組中的索引
	/*
	 * 兩個明確:
	 * 返回值類型:
	 * 參數: int[] arr,int number
	 */
	public static int getIndex(int[] arr,int number) {
		//定義一個索引變量,初始值為-1
				int index=-1;
				
				//邊勵數組,獲取到數組中的每一個元素
				for(int x=0;x<arr.length;x++) {
					if(arr[x] ==number) {
						index=x;
						break;
					}
				}
				return index;
	}
}
