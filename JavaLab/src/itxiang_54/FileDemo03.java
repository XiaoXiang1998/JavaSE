package itxiang_54;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		// 需求1:在當前包類目錄下創建java.txt文件
		File f1 = new File("C:/Javahometrain/JavaLab/src/itxiang_54/java.txt");
		System.out.println(f1.createNewFile());

		// 需求2:刪除當前包類目錄下的java.txt文件
		System.out.println(f1.delete());
		System.out.println("---------");

		// 需求3:在當前包類目錄下創建itcast目錄
		File f2 = new File("C:/Javahometrain/JavaLab/src/itxiang_54/itcast");
//		System.out.println(f2.mkdir());

		// 需求4:山牆當前包類目錄下的itcast 目錄
		System.out.println(f2.delete());
		System.out.println("---------");

		// 需求5:在當前目錄下創建一個目錄itcast,然後在該目錄下創建一個文件java.txt
		File f3 = new File("C:/Javahometrain/JavaLab/src/itxiang_54/itcast");
//		System.out.println(f3.mkdir());
		File f4 = new File("C:/Javahometrain/JavaLab/src/itxiang_54/itcast/java.txt");
//		System.out.println(f4.createNewFile());

		// 需求6:刪除當前包下的目錄itcast 如果有文件 要先刪文件 才能刪目錄
		System.out.println(f4.delete());
		System.out.println(f3.delete());
	}
}
