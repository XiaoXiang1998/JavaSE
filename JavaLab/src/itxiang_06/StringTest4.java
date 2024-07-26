package itxiang_06;

public class StringTest4 {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		
		//調用方法 用一個變量接受結果
		
		String string= arrayToString(arr);
		System.out.println("s:"+string);
	}
	//定義一個方法 用於把int數組中的數據按照指定格式拼成一個字符串返回
	/*
	 * 兩個明確:
	 * 返回值類型String 
	 * 參數:int[] arr
	 */
	public static String arrayToString(int[] arr) {
		//在方法邊勵數組,按照要求進行拼接
		String s="";
		s+="[";
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
					s+=arr[i];
			}else {
				s+=arr[i];
				s+=", ";
			}
		}
		s+="]";
		return s;
	}
}
