package itxiang_55;

public class DiGuiDemo02 {
	public static void main(String[] args) {
		// 調用方法
		int result = jc(5);
		System.out.println(result);
		System.out.println(jc(10));
	}

	// 定義一個方法,用於遞歸求階乘,參數唯一個int類型的變量
	public static int jc(int n) {
		// 在方法內部判斷該變量的值是否是1
		if (n == 1) {
			// 是:1返回1
			return 1;
		} else {
			// 不是 返回n*(n-1)!
			return n * jc(n - 1);
		}
	}
}
