package itxiang_33;


public class ExpectionDemo2 {
	public static void main(String[] args) {
		System.out.println("開始");
		method();
		System.out.println("結束");
	}
	public static void method() {
		try {
			int[] arr= {1,2,3};
			System.out.println(arr[3]); //new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("你訪問的數組索引不存在");
//			e.printStackTrace();
			
			//public String getMessage():返回此throwable的詳細信息字符串
//			System.out.println(e.getMessage());
			//Index 3 out of bounds for length 3
			
			//public String toString():返回此可拋出的簡短描述
//			System.out.println(e.toString());
			//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			
			//public void printStackTrace():把異常的錯誤信息輸出在控制台

			e.printStackTrace();

		}
	}
}
