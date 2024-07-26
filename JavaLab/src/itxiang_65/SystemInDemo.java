package itxiang_65;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		// public static final InputStream in:標準輸入流
		InputStream is = System.in;
//
//		int by;
//		while ((by = is.read()) != -1) {
//			System.out.print((char) by);
//		}

		// 如何把字節流 轉換為字符流用轉換流
		InputStreamReader isr = new InputStreamReader(is);
		// 使用字符流能不能夠實現一次讀取一行數劇呢?可以
		// 但是,一次讀取一行數劇的方法是字符緩衝輸入流的特有方法
		BufferedReader br = new BufferedReader(isr);

		System.out.println("請輸入一個字符串");
		String line = br.readLine();
		System.out.println("你輸入的字符串是:" + line);

		System.out.println("請輸入一個整數:");
		int i = Integer.parseInt(br.readLine());
		System.out.println("你輸入的整數是:" + i);

		// 自己實現鍵盤錄入數據太麻煩了,所以Java就提供了一個類提供我們使用 Scanner sc=new Scanner(System.in);
	}
}
