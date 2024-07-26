package itxiang_32;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		//獲取對象
		Calendar calendar= Calendar.getInstance(); //多態的形式
		
		System.out.println(calendar);
		
		//public int get(int field)
//		int year=	calendar.get(Calendar.YEAR);
//		int month =calendar.get(Calendar.MONTH)+1;
//		int date = calendar.get(Calendar.DATE);
//		System.out.println(year+"年"+month+"月"+date+"日");
		
		//public abstract void add(int filed,int amount):根據日曆的規則,將指定的時間量添加或減去給定的日曆字段
		//需求1:3年前的今天
//		calendar.add(Calendar.YEAR,-3);
//		int year=	calendar.get(Calendar.YEAR);
//		int month =calendar.get(Calendar.MONTH)+1;
//		int date = calendar.get(Calendar.DATE);
//		System.out.println(year+"年"+month+"月"+date+"日");
		//需求2:10年後的5天前
//		calendar.add(Calendar.YEAR,10);
//		calendar.add(Calendar.DATE, -5);
//		int year=	calendar.get(Calendar.YEAR);
//		int month =calendar.get(Calendar.MONTH)+1;
//		int date = calendar.get(Calendar.DATE);
//		System.out.println(year+"年"+month+"月"+date+"日");
		
		//public final void set(int year,int month,int date):設置當前日曆的年月日
//		calendar.set(2055,12,12);
//		int year=	calendar.get(Calendar.YEAR);
//		int month =calendar.get(Calendar.MONTH)+1;
//		int date = calendar.get(Calendar.DATE);
//		System.out.println(year+"年"+month+"月"+date+"日");
	}

}
