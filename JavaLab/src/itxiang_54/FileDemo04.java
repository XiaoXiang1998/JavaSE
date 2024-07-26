package itxiang_54;

import java.io.File;

public class FileDemo04 {
	public static void main(String[] args) {
		// 創建一個File對象
		File f = new File("D:/images/java.txt");
		// 判斷此抽象路徑名表示的File是否為目錄
		System.out.println(f.isDirectory());
		// 判斷此抽象路徑名表示的File是否為文件
		System.out.println(f.isFile());
		// 判斷此抽象路徑名表示的File是否存在
		System.out.println(f.exists());
		// 絕對路徑
		System.out.println(f.getAbsolutePath());
		// 將此對象路徑名轉換為路徑名字符串
		System.out.println(f.getPath());
		// 返回由此抽象路徑名表示的文件或目錄名稱
		System.out.println(f.getName());
		System.out.println("-------------");
		// 返回此抽象路徑名表示的目錄中的文件和目錄的名稱字符串數組
		File f2 = new File("D:/images");
		String[] list = f2.list();
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("-------------");
		File[] fileArray = f2.listFiles();
		for (File file : fileArray) {
//			System.out.println(file);
//			System.out.println(file.getName());
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		}
	}
}
