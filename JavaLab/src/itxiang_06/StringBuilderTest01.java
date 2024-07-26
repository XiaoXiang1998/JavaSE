package itxiang_06;

public class StringBuilderTest01 {
	public static void main(String[] args) {
		//定義一個int 類型的數組,用靜態初始化完成數組元素的初始化
		int[] arr= {1,2,3};
		
		String s= arrayToString(arr);
		
		System.out.println("s:"+s);
	}
	
	//定義一個方法,用於把int數組中的數據按照指定格式拼接成一個字符串返回
	/*
	 * 兩個明確:
	 * 返回值類型String 
	 * 參數:int []arr
	 */
	public static String arrayToString(int[] arr) {
		//在方法中用 StringBuilder 按照要求進行拼接，並把結果轉成String返回
		StringBuilder sb =new StringBuilder();
		
		sb.append("[");
		
		for(int i=0;i<arr.length;i++) {
			if(i== arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(", ");
			}
		}
		
		sb.append("]");
		
		String s =sb.toString();
		return s;
	}
}
