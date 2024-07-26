package itxiang_64;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException {
		// 創建數據源File對象,路徑是C:\\itcast
		File srcFile = new File("C:\\itcast");
		// 創建目的地對象,路徑是F:\\
		File destFile = new File("D:\\");

		// 用方法實現文件夾的複製,參數源為File對象和目的地File對象
		CopyFolder(srcFile, destFile);
	}

	// 複製文件夾
	private static void CopyFolder(File srcFile, File destFile) throws IOException {
		// 判斷數據源File是否是目錄
		if (srcFile.isDirectory()) {
			// 在目的地下創建和數劇源file名稱一樣的目錄
			String srcFileName = srcFile.getName();
			File newFolder = new File(destFile, srcFileName); // D:\\itcast
			if (!newFolder.exists()) {
				newFolder.mkdir();
			}

			// 獲取數據源File下所有文件或者目錄的File數組
			File[] fileArray = srcFile.listFiles();

			for (File file : fileArray) {
				// 把該File作為數據源file對象,遞歸調用複製文件夾的方法
				CopyFolder(file, newFolder);
			}
		} else {
			// 說明是文件,直接複製,用字節流
			File newFile = new File(destFile, srcFile.getName());
			CopyFile(srcFile, newFile);
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
