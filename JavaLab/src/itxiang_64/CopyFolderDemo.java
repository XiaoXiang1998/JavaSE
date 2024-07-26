package itxiang_64;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// File(String Pathname):通過將給定的路徑名字符串轉換為抽象路徑來創建新的File實例
// File(File parent,String child):從父抽象路徑名和子路徑名字符串創建新的File實例
// File(String parent,String child):從父路徑名字符串和子路徑名字符串創建新的File實例

public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		// 創建數據源目錄File對象,路徑是C:\\itcast
		File srcFolder = new File("C:/itcast");
		// 獲取數據源目錄File對象名稱(itcast)
		String srcFolderName = srcFolder.getName();
		// 創建目的地File對象,路徑名是包名+itcast組成
		File destFolder = new File("C:\\Javahometrain\\JavaLab\\src\\itxiang_64", srcFolderName);

		// 判斷是否存在,不存在就創建
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}

		// 獲取數據源目錄下所有文件的File數組
		File[] listFiles = srcFolder.listFiles();

		// 邊利File數組得到,每一個File對象,該File對象,其實就是數據源文件
		for (File srcFile : listFiles) {
			// 數劇源文件:E:\\itcast\\Satoru.jpg
			// 獲取數據源文件File對象的名稱(Satoru.jpg)
			String srcFileName = srcFile.getName();
			// 創建目的地對象,路徑是目的地目錄+Satoru.jpg組成
			File destFile = new File(destFolder, srcFileName);
			// 複製文件
			CopyFile(srcFile, destFile);
		}
	}

	private static void CopyFile(File srcFile, File destFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

		byte[] bys = new byte[1024];
		int len;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		bis.close();
	}
}
