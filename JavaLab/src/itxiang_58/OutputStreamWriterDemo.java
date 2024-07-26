package itxiang_58;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("C:\\Javahometrain\\JavaLab\\src\\itxiang_58\\bos3.txt"));

		// void write(int c): 寫一個字符
//		osw.write(97);
		// void flush(): 刷新流
//		osw.flush();
//		osw.write(98);
//		osw.flush();

		// void write(char[] cbuf):寫入一個字符數組
//		char[] chs = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
//		osw.write(chs);

		// void write(char[] cbuf,int off,int len):寫入字符數組的一部分
//		osw.write(chs, 1, 3);

		// void write(String str:)寫一個字符串
//		osw.write("abcde");

		// void write(String str,int off,int len)寫一個字符串一部分
		osw.write("abcde", 1, 3);

		osw.close();

	}
}
