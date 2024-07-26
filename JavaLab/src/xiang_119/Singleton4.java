package xiang_119;

/*
 * 懶漢式
 * 延遲創建實例對象
	
	1.構造器私有化
 * 2.用一個靜態變量保存這個唯一的實例
 * 3.提供一個靜態方法,獲取這個實例對象
 */
public class Singleton4 {

	private static Singleton4 instance;

	private Singleton4() {

	}

	public static Singleton4 getInstance() {
		if (instance == null) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			instance = new Singleton4();
		}
		return instance;
	}

}
