package itxiang_33;


public class ExpectionDemo01 {
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
			e.printStackTrace();
		}
	}
}
