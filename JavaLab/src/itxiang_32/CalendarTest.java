package itxiang_32;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入年份:");
		int year=scanner.nextInt();
		scanner.nextLine();
		
		//設置日曆對象的年 月 日
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, 2,1);
		
		//3月1日往前推一天,就是2月的最後一天
		calendar.add(Calendar.DATE, -1);
		
		//獲取這一天的輸出即可
		int date=calendar.get(Calendar.DATE);
		
		System.out.println(year+"年的2月份有"+date+"天");
	}

}
