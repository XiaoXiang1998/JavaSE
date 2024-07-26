package itxiang_55;

import java.io.File;

public class DiGuiDemo03 {
	public static void main(String[] args) {
		// 根據給定的路徑創建一個File對象
		File srcfile = new File("C:\\Javahometrain\\JavaLab\\src");

		// 調用方法
		getAllFilePath(srcfile);
	}

	// 定義一個方法,用於獲取給定目錄下的所有內容,參數為第一步創建的 file對象
	public static void getAllFilePath(File srcFile) {
		// 獲取給定的File目錄下所有的文件或者目錄的file數組
		File[] fileArray = srcFile.listFiles();
		if (fileArray != null) {
			for (File file : fileArray) {
				// 判斷該File對象是否是目錄
				if (file.isDirectory()) {
					// 是:遞歸調用
					getAllFilePath(file);
				} else {
					// 不是:獲取絕對路徑 輸出在控制台
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
}
