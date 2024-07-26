package itxiang_60;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo01 {
	public static void main(String[] args) throws IOException {
//		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Javahometrain\\JavaLab\\src\\itxiang_60\\bw.txt"));
//		bw.write("hello\r\n");
//		bw.write("world\r\n");
//		bw.close();

		BufferedReader br = new BufferedReader(new FileReader("C:\\JDBC\\etfData.csv"));

//		int ch;
//		while ((ch = br.read()) != -1) {
//			System.out.print((char) ch);
//		}

		char[] chs = new char[1024];
		int ch;
		while ((ch = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, ch));
		}
		br.close();
	}
}
