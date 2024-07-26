package itxiang_33;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo03 {
	public static void main(String[] args) {
		method();
		method2();
	}
	
	//編譯時異常
	public static void method2() {
		try {
			String string="2048-08-09";
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			Date date= sdf.parse(string);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//運行時異常
	public static void method() {
		
		try {
			int[] arr= {1,2,3};
			System.out.println(arr[3]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
