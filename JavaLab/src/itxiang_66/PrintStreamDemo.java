package itxiang_66;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		try (// 使用指定的文件名創建新的打印流
				PrintStream ps = new PrintStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_66\\ps.txt")) {
			// 寫數據
			// 字節輸出流有的方法
//			ps.write(97);

			// 使用特有方法寫數據
			ps.println(97);
			ps.println(98);
			ps.println("你好");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
