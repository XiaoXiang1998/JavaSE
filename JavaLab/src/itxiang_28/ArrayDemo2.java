package itxiang_28;

import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		//定義一個數組
		int[] arr= {24,69,80,57,13};
		
		System.out.println("排序前"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("排序後:"+Arrays.toString(arr));
		
		

	}
}
