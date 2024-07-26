package itxiang_54;

import java.io.File;

public class FileDemo01 {
	public static void main(String[] args) {
		// File(String Pathname):通過將給定的路徑名字符串轉換為抽象路徑來創建新的File實例
		File f1 = new File("D:\\images\\Satoru.jpg");
		System.out.println(f1);

		// File(String parent,String child):從父路徑名字符串和子路徑名字符串創建新的File實例
		File f2 = new File("D:\\images", "Satoru.jpg");
		System.out.println(f2);

		// File(File parent,String child):從父抽象路徑名和子路徑名字符串創建新的File實例
		File f3 = new File("D:\\images");
		File f4 = new File(f3, "Satoru.jpg");
		System.out.println(f4);
	}
}
