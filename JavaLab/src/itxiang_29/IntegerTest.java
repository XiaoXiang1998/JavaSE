package itxiang_29;

import java.util.Arrays;

public class IntegerTest {

	public static void main(String[] args) {
		//定義一個字符串
		String s="91 27 46 38 50";
		
		//把字符串的數字數據存儲到一個int類型的數組中
		String[] strArray= s.split(" ");
		
//		for(int i=0;i<strArray.length;i++) {
//			System.out.println(strArray[i]);
//		}
		//定義一個數組,把String[] 數組中的每一個元素存儲到int數組中
		int[] arr=new int[strArray.length];
 		for(int i=0;i<arr.length;i++) {
 			arr[i] =Integer.parseInt(strArray[i]);
 			
 		}
// 		for(int i=0;i<arr.length;i++) {
// 			System.out.println(arr[i]);
// 		}
 		//對 int數組進行排序
 		Arrays.sort(arr);
 		
 		//把排序後的int數組中元素進行拼接得到一個字符串,這裡拼接採用StringBuilder來實現
 		StringBuilder sb=new StringBuilder();
 		for(int i=0;i<arr.length;i++) {
 			if(i ==arr.length-1) {
 				sb.append(arr[i]);
 			}else {
 				sb.append(arr[i]).append(" ");
 			}
 		}
 		String result=sb.toString();
 		
 		System.out.println("result:"+result);
	}

}
