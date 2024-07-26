package xiang_119;

/*
 *在內部類被加載和初始化時,才創建INSTANCE實例對象
 *靜態內部類不會ˋ自動隨著外部類的加載和初始化而初始化,它是要單獨加載和初始化的
 *因為是在內部類加載和初始化時,創建的,因此是線程安全的
 */
public class Singleton6 {

	private Singleton6() {

	}

	private static class Inner {
		private static final Singleton6 INSTANCE = new Singleton6();

	}

	public static Singleton6 getInstance() {
		return Inner.INSTANCE;
	}

}
