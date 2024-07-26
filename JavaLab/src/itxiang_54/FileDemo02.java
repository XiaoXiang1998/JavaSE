package itxiang_54;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		// 需求1:我要在D:\\images目錄下 創建一個文件java.txt 如果文件不存在就創建返回true 反之false
		File f1 = new File("D:/images/java.txt");
		System.out.println(f1.createNewFile());
		System.out.println("--------------");
		// 需求2:我要在D:\\images目錄下 創建一個目錄JavaSE 如果目錄不存在就創建返回true 反之false
		File f2 = new File("D:/images/JavaSE");
		System.out.println(f2.mkdir());

		// 需求3:我要在D:\\images目錄下創建一個多級目錄JavaWeb\\HTML 如果目錄不存在就創建返回true 反之false
		File f3 = new File("D:/images/JavaWeb/HTML");
		System.out.println(f3.mkdirs());

		// 需求4:我要在D:\\images目錄下創建一個文件javase.txt
		File f4 = new File("D:/images/javase.txt");
//		System.out.println(f4.mkdir());
		System.out.println(f4.createNewFile());
	}
}
