package itxiang_68;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo04 {
	public static void main(String[] args) throws IOException {
		// 從文件中讀取數據到Properties集合,用Load()方法實現
		Properties properties = new Properties();

		FileReader fr = new FileReader("C:\\Javahometrain\\JavaLab\\src\\itxiang_68\\game.txt");

		properties.load(fr);

		fr.close();

		// 透過Properties集合獲取到玩遊戲的次數
		String count = properties.getProperty("count");
		int number = Integer.parseInt(count);

		// 判斷是否到三次了
		if (number >= 3) {
			// 如果到了,給出提示:遊戲試玩已經結束,想玩請重值(www.itcast.cn)
			System.out.println("遊戲試玩已經結束,想玩請重值(www.itcast.cn)");
		} else {
			// 玩遊戲
			GuessNumber.start();

			// 次數+1 重新寫回文件,用Properties的store()方法實現
			number++;
			properties.setProperty("count", String.valueOf(number));

			FileWriter fw = new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_68\\game.txt");
			properties.store(fw, null);
			fw.close();
		}
	}
}
