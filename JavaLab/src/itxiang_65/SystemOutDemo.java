package itxiang_65;

import java.io.PrintStream;

public class SystemOutDemo {
	public static void main(String[] args) {
		// public static final PrintStream out:標準輸出流
		PrintStream ps = System.out;

		// 能夠方便地打印各種數值
//		ps.print("hello");
//		ps.print(100);

		ps.println("hello");
		ps.println(100);

		// System.out的本質是一個字節輸出流
		System.out.println("hello");
		System.out.println(100);

		System.out.println();
//		System.out.print(); 要有參數
	}
}
