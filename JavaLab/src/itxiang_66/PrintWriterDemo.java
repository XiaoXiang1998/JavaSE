package itxiang_66;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		// PrintWriter(String fileName) :使用指定的文件名創建一個新的PrintWriter,而不需要自動執行刷新
//		PrintWriter pw = new PrintWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_66\\pw.txt");
//		pw.write("hello");
//		pw.write("\r\n");
//		pw.flush();
//		pw.write("world");
//		pw.write("\r\n");
//		pw.flush();

//		pw.println("Hello");
//		pw.flush();
//		pw.println("Hello");
//		pw.flush();

		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_66\\pw.txt"), true);
		pw.println("hello");
		pw.println("world");

	}
}
