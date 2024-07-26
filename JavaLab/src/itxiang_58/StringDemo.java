package itxiang_58;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 定義一個字符串
		String string = "台灣";

		// 使用平台默認的字符集將String 編碼為一系列字節,將結果存儲到新的字節數組中
		byte[] bys = string.getBytes("GBK"); // [-27, -113, -80, -25, -127, -93]

		System.out.println(Arrays.toString(bys));

		// 通過使用平台的默認字符集解碼指定的字節數組
//		String ss = new String(bys);
//		System.out.println(ss);

		// 通過指定的字符集解碼指定的字節數組來構造新的String
		String ss = new String(bys, "GBK");

		System.out.println(ss);
	}
}
