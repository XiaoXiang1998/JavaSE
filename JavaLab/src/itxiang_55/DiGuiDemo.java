package itxiang_55;

public class DiGuiDemo {
	public static void main(String[] args) {
		// 回顧不死神兔問題:求第20個月兔子的對數
		// 每個月的兔子對數:1,1,2,3,5,8...
		int[] arr = new int[20];

		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(arr[19]);
		System.out.println(f(20));
	}

	/*
	 * 遞歸解決問題,首先就是定義一個方法 定義一個方法f(n):表示第n個月的兔子對數 那麼,第n-1個月的兔子對數該如何表示呢?f(n-1)
	 * 那麼,第n-2個月的兔子對數該如何表示呢?f(n-2) StackOverflowError:當堆棧溢出發生時拋出一個應用程序遞歸太深
	 */
	public static int f(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return f(n - 1) + f(n - 2);
	}
}
