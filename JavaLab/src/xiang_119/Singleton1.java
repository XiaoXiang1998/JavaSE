package xiang_119;

/*
 * 餓漢式:
 * 類初始化直接創建實例對象,不管你是否需要這個對象都會創建
 * 
 * 1.構造器私有化
 * 2.自行創建,並且用靜態變量保存
 * 3.向外提供實例
 * 4.強調這是一個單例,我們可以用final修改
 */
public class Singleton1 {
	public static final Singleton1 INSTANCE = new Singleton1();

	private Singleton1() {

	}
}
