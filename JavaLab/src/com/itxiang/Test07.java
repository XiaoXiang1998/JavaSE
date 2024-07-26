package com.itxiang;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		//定義一個數組,用動態初始化完成數組元素的初始化 長度為6
		int[] arr=new int[6];
		
		//鍵盤錄入評委分數
		Scanner scanner=new Scanner(System.in);
		
//		System.out.println("請輸入第1個評委的打分:");
//		arr[0]=scanner.nextInt();
//		
//		System.out.println("請輸入第2個評委的打分:");
//		arr[1]=scanner.nextInt();
		
		//由於是6個評委打分,所以,接收評委分數的操作,用循環改進
		for(int x=0;x<arr.length;x++) {
			System.out.println("請輸入第"+(x+1)+"個評委的打分:");
			arr[x]=scanner.nextInt();
		}
		printArray(arr);
		
		//定義方法實現獲取數組中的最高分(數組最大值),調用方法
		int max=getMax(arr);
		
		//定義方法實現獲取數組中的最高分(數組最小值),調用方法
		int min=getMin(arr);
		
		//定義方法實現獲取數組中的所有元素的和(數組元素球和),調用方法
		int sum=getSum(arr);
		
		//按照計算規則進行計算得到平均分
		int avg=(sum-max-min)/(arr.length-2);
		
		System.out.println("選手的最終得分是:"+avg);
	}
	
	//定義方法實現獲取數組中的最高分(數組最大值),調用方法
	/*
	 * 兩個明確:
	 * 返回值類型:int
	 * 參數:int[]arr	 	
	  */
	
	public static int getSum(int[] arr){
		int sum=0;
		
		for(int x=0;x<arr.length;x++) {
			sum+=arr[x];
		}
		return sum;
	}
	
	public static int getMax(int[] arr) {
		int max=arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {
				max=arr[x];
			}
			
		}
		return max;
	}
	
	public static int getMin(int[] arr) {
		int min=arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]<min) {
				min=arr[x];
			}
			
		}
		return min;
	}
	
	//邊勵數組
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
